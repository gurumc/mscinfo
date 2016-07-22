package de.tum.ei.eda.esl.grip.ipxactRuleTrafoEpsilon;


import java.util.Iterator;

import javax.swing.JFrame;

import org.apache.commons.collections15.Transformer;

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

	
}
