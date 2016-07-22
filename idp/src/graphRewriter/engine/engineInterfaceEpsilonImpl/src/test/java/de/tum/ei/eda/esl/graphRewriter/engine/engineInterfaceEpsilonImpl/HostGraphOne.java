package de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl;

import javax.swing.JFrame;

import nodesAndEdges.Color;
import nodesAndEdges.ColoredNode;
import nodesAndEdges.Edge;
import nodesAndEdges.EdgeViewType;
import nodesAndEdges.Node;
import nodesAndEdges.NodesAndEdgesFactory;
import nodesAndEdges.Shape;
import nodesAndEdges.ShapedNode;
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
		
		ShapedNode node1 = NodesAndEdgesFactory.eINSTANCE.createShapedNode();
		node1.setName("node1");
		node1.setShape(Shape.ROUND);

		ColoredNode node2 = NodesAndEdgesFactory.eINSTANCE.createColoredNode();
		node2.setName("node2");
		node2.setColor(Color.RED);
		
		ShapedNode node3 = NodesAndEdgesFactory.eINSTANCE.createShapedNode();
		node3.setName("node3");
		node3.setShape(Shape.SQUARE);
		
		ShapedNode node4 = NodesAndEdgesFactory.eINSTANCE.createShapedNode();
		node4.setName("node4");
		node4.setShape(Shape.SQUARE);

		ShapedNode node5 = NodesAndEdgesFactory.eINSTANCE.createShapedNode();
		node5.setName("node5");
		node5.setShape(Shape.SQUARE);
		
		Edge edge1 = NodesAndEdgesFactory.eINSTANCE.createEdge();
		edge1.setName("edge1");
		edge1.setType(EdgeViewType.DASHLINE);
		Edge edge2 = NodesAndEdgesFactory.eINSTANCE.createEdge();
		edge2.setName("edge2");
		edge2.setType(EdgeViewType.SOLIDLINE);
		Edge edge3 = NodesAndEdgesFactory.eINSTANCE.createEdge();
		edge3.setName("edge3");
		edge3.setType(EdgeViewType.SOLIDLINE);
		Edge edge4 = NodesAndEdgesFactory.eINSTANCE.createEdge();
		edge4.setName("edge4");
		edge4.setType(EdgeViewType.DASHLINE);
		
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
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<Edge>());
        jf.getContentPane().add(vv);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
	}
}
