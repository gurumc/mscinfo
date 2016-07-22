package de.tum.ei.eda.esl.grip.socDesignSpaceExploration;


import java.util.Iterator;

import javax.swing.JFrame;

import org.apache.commons.collections15.Transformer;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.RewriterNE;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.ISOMLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

public class DisplayGraph<V, E> {
	
	
	public void displayHostGraph(Graph<V, E> graph, String name) {
		JFrame jf = new JFrame(name);
		Layout<V, E> layout = new ISOMLayout<V, E>(graph);
	    VisualizationViewer<V, E> vv = new VisualizationViewer<V, E>(layout);
	    //vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<V>());
	    // vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<E>());
	    jf.getContentPane().add(vv);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jf.pack();
	    jf.setVisible(true);
	}
	
	public void displayHostGraph(Graph<V, E> graph, String name, Layout<V, E> layout) {
		JFrame jf = new JFrame(name);
	    VisualizationViewer<V, E> vv = new VisualizationViewer<V, E>(layout);
	    //vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<V>());
	    vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<E>());
	    jf.getContentPane().add(vv);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jf.pack();
	    jf.setVisible(true);
	}
	
	public void displayHostGraph(Graph<V, E> graph, String name, Transformer trans) {
		JFrame jf = new JFrame(name);
		Layout<V, E> layout = new ISOMLayout<V, E>(graph);
	    VisualizationViewer<V, E> vv = new VisualizationViewer<V, E>(layout);
	    vv.getRenderContext().setVertexLabelTransformer(trans);
	    // vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<E>());
	    jf.getContentPane().add(vv);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jf.pack();
	    jf.setVisible(true);
	}
	public void displayPatternGraph(Graph<PatternNE, PatternNE> graph, String name) {
		JFrame jf = new JFrame(name);
		Layout<PatternNE, PatternNE> layout = new ISOMLayout<PatternNE, PatternNE>(graph);
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
		Layout<RewriterNE, RewriterNE> layout = new ISOMLayout<RewriterNE, RewriterNE>(graph);
        VisualizationViewer<RewriterNE, RewriterNE> vv = new VisualizationViewer<RewriterNE, RewriterNE>(layout);
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<RewriterNE>());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<RewriterNE>());
        jf.getContentPane().add(vv);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
	}
	
}
