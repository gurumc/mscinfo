package de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceReflectionImpl.directedGraph;


import org.apache.commons.collections15.Transformer;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceReflectionImpl.PatternNEImpl;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.Color;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.ColoredNode;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.Edge;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.EdgeViewType;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.Shape;
import de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass.ShapedNode;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;

/**
 * 
 * Reflection based directed LHS graph
 *
 */
public class LHSGraphTwo {
	public static Graph<PatternNE, PatternNE> createPatternGraph() {
		Graph<PatternNE, PatternNE> patternGraph = new SparseGraph<PatternNE, PatternNE>();
		
		PatternNEImpl node1 = new PatternNEImpl();
		node1.setIdent("p_node1");
		Transformer<ShapedNode, Shape> node1Trans = new Transformer<ShapedNode, Shape>() {
            public Shape transform(ShapedNode node) {
                return node.getShape();
            }
        };
        node1.addMatchConstraint(ShapedNode.class, node1Trans, Shape.square);
        
        PatternNEImpl node2 = new PatternNEImpl();
		node2.setIdent("p_node2");
		Transformer<ColoredNode, Color> node2Trans = new Transformer<ColoredNode, Color>() {
            public Color transform(ColoredNode node) {
                return node.getColor();
            }
        };
        node2.addMatchConstraint(ColoredNode.class, node2Trans, Color.red);
        
        PatternNEImpl edge1 = new PatternNEImpl();
		edge1.setIdent("p_edge1");
		Transformer<Edge, EdgeViewType> edge1Trans = new Transformer<Edge, EdgeViewType>() {
            public EdgeViewType transform(Edge edge) {
                return edge.getType();
            }
        };
        // edge1.addMatchConstraint(Edge.class, edge1Trans, EdgeViewType.solidline);
        
        patternGraph.addVertex(node1);
        patternGraph.addVertex(node2);
        patternGraph.addEdge(edge1, node2, node1, EdgeType.DIRECTED);
		return patternGraph;
	}
}
