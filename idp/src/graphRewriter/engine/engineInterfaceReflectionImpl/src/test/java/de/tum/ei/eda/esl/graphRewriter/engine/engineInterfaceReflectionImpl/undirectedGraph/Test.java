package de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceReflectionImpl.undirectedGraph;

import java.util.Iterator;
import java.util.Set;

import javax.swing.JFrame;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.GraphMatcher;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.GraphRewriter;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.Match;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.Rule;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.RewriterNE;
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

public class Test {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Graph<Node, Edge> hostGraph = HostGraphOne.createSampleGraph();
		
		Graph<PatternNE, PatternNE> lhs = PatternGraphOne.createPatternGraph();
		Graph<RewriterNE, RewriterNE> rhs = RHSGraphOne.createPatternGraph();
		Rule rule = new Rule();
		rule.setGraphletLhs(lhs);
		rule.setGraphletRhs(rhs);
		
		displayHostGraph(hostGraph, "Host Graph");
		displayPatternGraph(lhs, "LHS");	
		displayRewriterGraph(rhs, "RHS");
		
		// first run on host graph
		GraphMatcher<Node, Edge> matcher = new GraphMatcher<Node, Edge>();
		Set<Match<Node, Edge>> matches1 = matcher.matchLHS(hostGraph, rule);
		System.out.println(matches1.size()+" matches are found in host graph");
			
		Match<Node, Edge> match1 = null;
		for(Iterator<Match<Node, Edge>> it=matches1.iterator(); it.hasNext();) {
			match1 = it.next();
			displayHostGraph(constructMatchedSubgraph(hostGraph, lhs, match1), "Matched Subgraph");
		}
		
		GraphRewriter<Node, Edge> rewriter = new GraphRewriter<Node, Edge>();
		Graph<Node, Edge> outputGraph1 = rewriter.applyRHS(hostGraph, match1, rule);
		displayHostGraph(outputGraph1, "Output Graph1");
		
		// second run on output graph
		
		Set<Match<Node, Edge>> matches2 = matcher.matchLHS(outputGraph1, rule);
		System.out.println(matches2.size()+" matches are found in host graph");
			
		Match<Node, Edge> match2 = null;
		for(Iterator<Match<Node, Edge>> it=matches2.iterator(); it.hasNext();) {
			match2 = it.next();
		}

		Graph<Node, Edge> outputGraph2 = rewriter.applyRHS(outputGraph1, match2, rule);
		displayHostGraph(outputGraph2, "Output Graph2");		
	}
	
	public static Graph<Node,Edge> constructMatchedSubgraph(Graph<Node, Edge> hostGraph, 
			Graph<PatternNE, PatternNE> lhs, Match<Node, Edge> match) {
		Graph<Node, Edge> graph = new SparseGraph<Node, Edge>();
		for(Iterator<PatternNE> it=lhs.getVertices().iterator(); it.hasNext();) {
			PatternNE patternNode = it.next();
			graph.addVertex((Node) match.getMatchedNode(patternNode));
		}
		for(Iterator<PatternNE> it=lhs.getEdges().iterator(); it.hasNext(); ) {
			PatternNE patternEdge = it.next();
			graph.addEdge(match.getMatchedEdge(patternEdge)
					, match.getMatchedNode(lhs.getEndpoints(patternEdge).getFirst())
					, match.getMatchedNode(lhs.getEndpoints(patternEdge).getSecond()),
					lhs.getEdgeType(patternEdge));
		}
		return graph;
	}
	
	public static void displayHostGraph(Graph<Node,Edge> graph, String name) {
		JFrame jf = new JFrame(name);
		Layout<Node, Edge> layout = new CircleLayout<Node, Edge>(graph);
        VisualizationViewer<Node, Edge> vv = new VisualizationViewer<Node, Edge>(layout);
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<Node>());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<Edge>());
        jf.getContentPane().add(vv);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
	}
	
	public static void displayPatternGraph(Graph<PatternNE, PatternNE> graph, String name) {
		JFrame jf = new JFrame(name);
		Layout<PatternNE, PatternNE> layout = new CircleLayout<PatternNE, PatternNE>(graph);
        VisualizationViewer<PatternNE, PatternNE> vv = new VisualizationViewer<PatternNE, PatternNE>(layout);
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<PatternNE>());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<PatternNE>());
        jf.getContentPane().add(vv);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
	}
	
	public static void displayRewriterGraph(Graph<RewriterNE, RewriterNE> graph, String name) {
		JFrame jf = new JFrame(name);
		Layout<RewriterNE, RewriterNE> layout = new CircleLayout<RewriterNE, RewriterNE>(graph);
        VisualizationViewer<RewriterNE, RewriterNE> vv = new VisualizationViewer<RewriterNE, RewriterNE>(layout);
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<RewriterNE>());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<RewriterNE>());
        jf.getContentPane().add(vv);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
	}
	
}
