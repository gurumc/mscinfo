package de.tum.ei.eda.esl.graphRewriter.searchTreeExploration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.de.tum.ei.eda.esl.graphRewriter.isomorphism.IsomorphismTester;
import org.de.tum.ei.eda.esl.graphRewriter.isomorphism.VF2IsomorphismTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit.spirit.DesignType;
import org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.GraphMatcher;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.Match;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.Rule;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import de.tum.ei.eda.esl.grip.ipxactJungTrafo.JungGraphToDesign;
import de.tum.ei.eda.esl.grip.ipxactRuleTrafoEpsilon.IpxactToEpsilonLHS;
import de.tum.ei.eda.esl.grip.ipxactRuleTrafoEpsilon.JungNodestoPatternNE;
import edu.uci.ics.jung.graph.Graph;

public class GraphComparator<V,E> implements NodeComparator<Graph<V,E>>{

	Graph<EObject, EClass> source = null; 
	Graph<EObject, EClass> target = null; 

	Map<EObject, PatternNE> eobjectToPatternNE = null;

	/*
	 * (non-Javadoc)
	 * @see de.tum.ei.eda.esl.graphRewriter.searchTreeExploration.NodeComparator#compare(java.lang.Object, java.lang.Object)
	 */
	public boolean compare(Graph node1, Graph node2) {
		this.source = (Graph<EObject, EClass>) node1;
		this.target = (Graph<EObject, EClass>) node2;

		if(!matcheEdgeList()){
			return false;
		}
		
		IsomorphismTester vf2 = new VF2IsomorphismTester();
		if(vf2.areIsomorphic(source, target)){
			return true;
		}
		else{
			return false;
		}

	}
	
	/*
	 * Method to match the edge lists
	 */
	private boolean matcheEdgeList()
	{
		int [] src = new int[source.getVertexCount()];
		int [] tgt = new int[target.getVertexCount()];
		int i = 0;

		//vertex and edge check
		if(source.getVertexCount() != target.getVertexCount() || source.getEdgeCount() != target.getEdgeCount()){	
			return false;
		}

		/* Edge list comparison */
		for(EObject vertex: source.getVertices()){
			src[i++] = source.degree(vertex);
		}
		i = 0;
		for(EObject vertex: target.getVertices())
		{
			tgt[i++] = target.degree(vertex);
		}

		Arrays.sort(src);
		Arrays.sort(tgt);

		if(Arrays.equals(src, tgt)){
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public boolean matcheEdgeList(Graph<V, E> node1, Graph<V, E> node2) {
		this.source = (Graph<EObject, EClass>) node1;
		this.target = (Graph<EObject, EClass>) node2;
		
		if(matcheEdgeList()){
			return true;
		}
		return false;
	}

	/*  
	 * Method to remove duplicate names in vertices (component instances) 
	 * Only works ComponentInstanceType: Since at present we need only that
	 * and can be easily expanded/better name modifications can be done
	 */
	private static Graph<EObject, EClass> validateIPxactDesign(Graph<EObject, EClass> graph)
	{

		HashSet<String> hset = new HashSet<String>();
		for(EObject vertex:graph.getVertices())
		{
			if(vertex instanceof ComponentInstanceType)
			{
				String oldValue = ((ComponentInstanceType) vertex).getInstanceName();
				if(hset.contains(oldValue))
				{
					oldValue = oldValue+"_2";
					while(hset.contains(oldValue))
					{
						oldValue = oldValue+"_2";	
					}
					((ComponentInstanceType) vertex).setInstanceName(oldValue);
				}
				hset.add(oldValue);
			}

		}
		return graph;
	}

	private boolean matchNodeContent(EObject tnode, EObject snode) {
		// comment out below 2 lines if  it doesn't work
		if(source.getNeighborCount(tnode) != target.getNeighborCount(snode))
			return false;

		if(tnode instanceof ComponentInstanceType && snode instanceof ComponentInstanceType){
			tnode = (ComponentInstanceType) tnode;
		}
		else if(tnode instanceof BusInterfaceType && snode instanceof BusInterfaceType){
			tnode = (BusInterfaceType) tnode;
		}
		else if (tnode instanceof EClass && snode instanceof EClass){
			tnode = (EClass) tnode;
		}
		else if (tnode instanceof InternalPortReferenceType && snode instanceof InternalPortReferenceType){
			tnode = (InternalPortReferenceType) tnode;
		}
		else if(tnode instanceof ExternalPortReferenceType && snode instanceof ExternalPortReferenceType){
			tnode = (ExternalPortReferenceType) tnode;
		}
		else
			return false;

		/*
		 * Both nodes are of the same type, so we can safely compare these nodes
		 */
		PatternNE patternNode = eobjectToPatternNE.get(tnode);
		if(patternNode != null)
		{
			if(patternNode.match(snode)){
				return true;
			}
			else{
				return false;
			}

		}

		return false;
	}


}
