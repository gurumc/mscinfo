package de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceReflectionImpl.undirectedGraph;


import javax.swing.JFrame;

import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.Color;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.ColoredNode;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.Edge;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.EdgeViewType;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.Node;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.Shape;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.ShapedNode;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

/**
 * 
 * Non-ecore undirected graph demo
 *
 */

public class HostGraphOne {
	
	public static Graph<Node, Edge> createSampleGraph() {
		Graph<Node, Edge> graph = new SparseGraph<Node, Edge>();
		
		ShapedNode node1 = new ShapedNode();
		node1.setName("node1");
		node1.setShape(Shape.round);

		ColoredNode node2 = new ColoredNode();
		node2.setName("node2");
		node2.setColor(Color.red);
		
		ShapedNode node3 = new ShapedNode();
		node3.setName("node3");
		node3.setShape(Shape.square);
		
		ShapedNode node4 = new ShapedNode();
		node4.setName("node4");
		node4.setShape(Shape.square);

		ShapedNode node5 = new ShapedNode();
		node5.setName("node5");
		node5.setShape(Shape.square);
		
		Edge edge1 = new Edge();
		edge1.setName("edge1");
		edge1.setType(EdgeViewType.dashline);
		Edge edge2 = new Edge();
		edge2.setName("edge2");
		edge2.setType(EdgeViewType.solidline);
		Edge edge3 = new Edge();
		edge3.setName("edge3");
		edge3.setType(EdgeViewType.solidline);
		Edge edge4 = new Edge();
		edge4.setName("edge4");
		edge4.setType(EdgeViewType.dashline);
		
		graph.addVertex(node1);
		graph.addVertex(node2);
		graph.addVertex(node3);
		graph.addVertex(node4);
		graph.addVertex(node5);
		
		graph.addEdge(edge1, node1, node2);
		graph.addEdge(edge2, node2, node3);
		graph.addEdge(edge3, node2, node4);
		graph.addEdge(edge4, node2, node5);
		
		return graph;		
	}
	
	public static void main(String[] args) {
		Graph<Node, Edge> graph = HostGraphOne.createSampleGraph();
		JFrame jf = new JFrame();
		Layout<Node, Edge> layout = new CircleLayout<Node, Edge>(graph);
        VisualizationViewer<Node, Edge> vv = new VisualizationViewer<Node, Edge>(layout);
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<Node>());
        jf.getContentPane().add(vv);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
	}
}
