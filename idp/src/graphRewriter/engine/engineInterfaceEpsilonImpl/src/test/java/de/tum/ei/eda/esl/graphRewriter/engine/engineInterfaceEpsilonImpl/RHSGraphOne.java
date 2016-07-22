package de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl;


import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.RewriterNE;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;
import nodesAndEdges.Node;

public class RHSGraphOne {
	public static Graph<RewriterNE, RewriterNE> createPatternGraph() {
		Graph<RewriterNE, RewriterNE> RHSGraph = new SparseGraph<RewriterNE, RewriterNE>();
		
		CreatorNEEpsilonImpl<Node> newNode = new CreatorNEEpsilonImpl<Node>();
		newNode.setEolFileName(getFileName("eols/addNewNode.eol"));
		newNode.setIdent("newNode");
		
		CreatorNEEpsilonImpl<Node> newEdge = new CreatorNEEpsilonImpl<Node>();
		newEdge.setEolFileName(getFileName("eols/addNewEdge.eol"));
		newEdge.setIdent("newEdge");
		
		ModifierNEEpsilonImpl<Node> pnode1 = new ModifierNEEpsilonImpl<Node>();
		pnode1.setIdent("n1_red");
		pnode1.setEolFileName(getFileName("eols/changeNodeName.eol"));
		
		RewriterNEEpsilonImpl pnode2 = new RewriterNEEpsilonImpl();
		pnode2.setIdent("n2_square");
		
		RewriterNEEpsilonImpl pedge1 = new RewriterNEEpsilonImpl();
		pedge1.setIdent("e1_dashline");
		
		RHSGraph.addVertex(pnode1);
		RHSGraph.addVertex(pnode2);
		RHSGraph.addEdge(pedge1, pnode1, pnode2);
		
		RHSGraph.addVertex(newNode);
		RHSGraph.addEdge(newEdge, pnode2, newNode);
		
		return RHSGraph;
	}
	
	public static void main(String[] args) {
		RHSGraphOne.createPatternGraph();
	}
	
	public static String getFileName(String name) {
		return RHSGraphOne.class.getResource(name).getFile();
	}
}
