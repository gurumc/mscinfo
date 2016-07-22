package de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceReflectionImpl.directedGraph;




import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.RewriterNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceReflectionImpl.CreatorNEImpl;
import de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceReflectionImpl.ModifierNEImpl;
import de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceReflectionImpl.RewriterNEImpl;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.Color;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.ColoredNode;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.Edge;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.EdgeViewType;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.Node;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.Shape;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.ShapedNode;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;

/**
 * 
 * Reflection based directed RHS graph
 *
 */
public class RHSGraphTwo {
	public static Graph<RewriterNE, RewriterNE> createPatternGraph() {
		Graph<RewriterNE, RewriterNE> RHSGraph = new SparseGraph<RewriterNE, RewriterNE>();
		
		ModifierNEImpl<Node> node1 = new ModifierNEImpl<Node>();
		node1.setIdent("p_node1");
		try {
			node1.addModification(ShapedNode.class.getMethod("setShape", Shape.class), Shape.round);
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			
		}
		
		RewriterNEImpl node2 = new RewriterNEImpl();
		node2.setIdent("p_node2");
		
		CreatorNEImpl<Node> node3 = new CreatorNEImpl<Node>();
		node3.setIdent("newNode");
		node3.setNewElementClass(ShapedNode.class);
		try {
			node3.addInitialValue(ShapedNode.class.getDeclaredMethod("setSize", float.class), (float) 15.2);
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			
		}
		
		RewriterNEImpl edge1 = new RewriterNEImpl();
		edge1.setIdent("p_edge1");
		
		CreatorNEImpl<Edge> edge2 = new CreatorNEImpl<Edge>();
		edge2.setIdent("newEdge");
		edge2.setNewElementClass(Edge.class);
		try {
			edge2.addInitialValue(Edge.class.getDeclaredMethod("setType", EdgeViewType.class), EdgeViewType.solidline);
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			
		}
		
		RHSGraph.addVertex(node1);
		RHSGraph.addVertex(node2);
		RHSGraph.addVertex(node3);
		RHSGraph.addEdge(edge1, node1, node2, EdgeType.DIRECTED);
		RHSGraph.addEdge(edge2, node1, node3, EdgeType.DIRECTED);
		
		return RHSGraph;
	}
}
