package de.tum.ei.eda.esl.graphRewriter.engine.engineCore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.rits.cloning.Cloner;







import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.CreatorNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.ModifierNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.RewriterNE;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;

public class GraphRewriter<V, E> {
	
	private Cloner cloner = new Cloner();
	private Graph<V, E> hostGraph = null;
	private EdgeType hostGraphEdgeType = null;
	private Match<V, E> match = null;
	private Rule rule = null;
	
	
	private Map<RewriterNE, V> rhsNodeToOutputNode = null;
	private Map<V, V> hostNodeToOutputNode = null;
	
	public Graph<V, E> applyRHS(Graph<V, E> inputHostGraph, Match<V, E> inputMatch, Rule inputRule) {
		this.hostGraph = inputHostGraph;
		this.match = inputMatch;
		this.rule = inputRule;
		
		this.hostGraphEdgeType = hostGraph.getDefaultEdgeType();
		for(Iterator<E> it=hostGraph.getEdges().iterator(); it.hasNext();) {
			this.hostGraphEdgeType = hostGraph.getEdgeType(it.next());
			break;
		}
		
		this.rhsNodeToOutputNode = new HashMap<RewriterNE, V>();
		this.hostNodeToOutputNode = new HashMap<V, V>();
		
		Graph<V, E> outputGraph = new SparseGraph<V, E>();
		
		this.addRHSNodes(outputGraph);
		this.addRHSEdges(outputGraph);
		this.addUnmatchedHostGraphNodes(outputGraph);
		this.addUnmatchedHostGraphEdges(outputGraph);
		
		return outputGraph;
	}
	
	private void addRHSNodes(Graph<V, E> outputGraph) {
		Graph<RewriterNE, RewriterNE> rhs = rule.getGraphletRhs();
		
		for(Iterator<RewriterNE> it=rhs.getVertices().iterator(); it.hasNext();) {
			RewriterNE rhsNode = it.next();
			
			if(rhsNode instanceof ModifierNE) {	// modify node
				if(!rule.containsPatternNE(rhsNode.getIdent())) {
					System.err.println("ModifierNE cannot find matched PatternNE");	
				}
				PatternNE lhsNode = rule.getPatternNE(rhsNode.getIdent());
				V hostNode = match.getMatchedNode(lhsNode);
				V modifiedNode = ((ModifierNE<V>) rhsNode).modify(cloner.deepClone(hostNode));
				rhsNodeToOutputNode.put(rhsNode, modifiedNode);
				hostNodeToOutputNode.put(hostNode, modifiedNode);
				outputGraph.addVertex(modifiedNode);
			} else if(rhsNode instanceof CreatorNE) {  // create a new node
				V createNode = ((CreatorNE<V>) rhsNode).create();
				rhsNodeToOutputNode.put(rhsNode, createNode);
				outputGraph.addVertex(createNode);
				
			} else {	// unchange node
				if(!rule.containsPatternNE(rhsNode.getIdent())) {
					System.err.println("ModifierNE cannot find matched PatternNE");	
				}
				PatternNE lhsNode = rule.getPatternNE(rhsNode.getIdent());
				V hostNode = match.getMatchedNode(lhsNode);
				V modifiedNode = (V) cloner.deepClone(hostNode);
				rhsNodeToOutputNode.put(rhsNode, modifiedNode);
				hostNodeToOutputNode.put(hostNode, modifiedNode);
				outputGraph.addVertex(modifiedNode);
			}
		}
	}
	
	private void addRHSEdges(Graph<V, E> outputGraph) {
		Graph<RewriterNE, RewriterNE> rhs = rule.getGraphletRhs();
		for(Iterator<RewriterNE> it=rhs.getEdges().iterator(); it.hasNext();) {
			RewriterNE rhsEdge = it.next();
			
			if(ModifierNE.class.isInstance(rhsEdge)) {
				if(!rule.containsPatternNE(rhsEdge.getIdent())) {
					System.err.println("ModifierNE cannot find matched PatternNE");
					System.exit(0);
				}
				PatternNE lhsEdge = rule.getPatternNE(rhsEdge.getIdent());
				E hostEdge = match.getMatchedEdge(lhsEdge);
				E modifiedEdge = ((ModifierNE<E>) rhsEdge).modify(cloner.deepClone(hostEdge));
				
				RewriterNE rhsNode1 = rhs.getEndpoints(rhsEdge).getFirst();
				RewriterNE rhsNode2 = rhs.getEndpoints(rhsEdge).getSecond();
				
				outputGraph.addEdge(modifiedEdge, rhsNodeToOutputNode.get(rhsNode1), rhsNodeToOutputNode.get(rhsNode2), hostGraphEdgeType);
				
			} else if(CreatorNE.class.isInstance(rhsEdge)) {
				RewriterNE rhsNode1 = rhs.getEndpoints(rhsEdge).getFirst();
				RewriterNE rhsNode2 = rhs.getEndpoints(rhsEdge).getSecond();
				
				E newEdge = ((CreatorNE<E>) rhsEdge).create();
				outputGraph.addEdge(newEdge, rhsNodeToOutputNode.get(rhsNode1), rhsNodeToOutputNode.get(rhsNode2), hostGraphEdgeType);
				
			} else {
				if(!rule.containsPatternNE(rhsEdge.getIdent())) {
					System.err.println("ModifierNE cannot find matched PatternNE !!!"+" edge identi: "+rhsEdge.getIdent());	
				}
				PatternNE lhsEdge = rule.getPatternNE(rhsEdge.getIdent());
				E hostEdge = match.getMatchedEdge(lhsEdge);
				E modifiedEdge = (E) cloner.deepClone(hostEdge);
				
				RewriterNE rhsNode1 = rhs.getEndpoints(rhsEdge).getFirst();
				RewriterNE rhsNode2 = rhs.getEndpoints(rhsEdge).getSecond();
				
				outputGraph.addEdge(modifiedEdge, rhsNodeToOutputNode.get(rhsNode1), rhsNodeToOutputNode.get(rhsNode2), hostGraphEdgeType);
			}
		}
	}
	
	private void addUnmatchedHostGraphNodes(Graph<V, E> outputGraph) {
		for(Iterator<V> it=hostGraph.getVertices().iterator(); it.hasNext();) {
			V hostNode = it.next();
			if(match.containsHostNode(hostNode)) {
				continue;
			} else {
				V outputGraphNode = cloner.deepClone(hostNode);
				outputGraph.addVertex(outputGraphNode);
				hostNodeToOutputNode.put(hostNode, outputGraphNode);
			}
		}
	}
	
	private void addUnmatchedHostGraphEdges(Graph<V, E> outputGraph) {
		for(Iterator<E> it=hostGraph.getEdges().iterator(); it.hasNext();) {
			E hostEdge = it.next();
			if(match.containsHostEdge(hostEdge)) {
				continue;
			} else {
				V hostNode1 = hostGraph.getEndpoints(hostEdge).getFirst();
				V hostNode2 = hostGraph.getEndpoints(hostEdge).getSecond();
				if(hostNodeToOutputNode.containsKey(hostNode1) && hostNodeToOutputNode.containsKey(hostNode1)) {
					V outputGraphNode1 = hostNodeToOutputNode.get(hostNode1);
					V outputGraphNode2 = hostNodeToOutputNode.get(hostNode2);
					E outputGraphEdge = cloner.deepClone(hostEdge);
					outputGraph.addEdge(outputGraphEdge, outputGraphNode1, outputGraphNode2, hostGraphEdgeType);
				}
			}
		}
	}
}
