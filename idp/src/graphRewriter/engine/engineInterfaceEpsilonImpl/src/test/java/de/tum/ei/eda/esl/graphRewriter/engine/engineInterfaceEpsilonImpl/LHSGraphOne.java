package de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl;

import java.net.URISyntaxException;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import nodesAndEdges.Color;
import nodesAndEdges.ColoredNode;
import nodesAndEdges.Node;
import nodesAndEdges.NodesAndEdgesFactory;
import nodesAndEdges.Shape;
import nodesAndEdges.ShapedNode;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;


/**
 * 
 * Reflection based undirected LHS graph
 *
 */
public class LHSGraphOne {
	
	public static Graph<PatternNE, PatternNE> createPatternGraph() {
		Graph<PatternNE, PatternNE> patternGraph = new SparseGraph<PatternNE, PatternNE>();
		
		PatternNEEpsilonImpl pnode1 = new PatternNEEpsilonImpl();
		pnode1.setIdent("n1_red");
		pnode1.setEvlFileName(getFileName("evls/redNode.evl"));

		PatternNEEpsilonImpl pnode2 = new PatternNEEpsilonImpl();
		pnode2.setIdent("n2_square");
		pnode2.setEvlFileName(getFileName("evls/squareNode.evl"));
		
		PatternNEEpsilonImpl pedge1 = new PatternNEEpsilonImpl();
		pedge1.setIdent("e1_dashline");
		pedge1.setEvlFileName(getFileName("evls/dashEdge.evl"));
		
		patternGraph.addVertex(pnode1);
		patternGraph.addVertex(pnode2);
		patternGraph.addEdge(pedge1, pnode1, pnode2);
		
		return patternGraph;
	}
	
	public static void main(String[] agrs) {
		LHSGraphOne.createPatternGraph();
	}
	
	public static String getFileName(String name) {
		return LHSGraphOne.class.getResource(name).getFile();
	}
}

