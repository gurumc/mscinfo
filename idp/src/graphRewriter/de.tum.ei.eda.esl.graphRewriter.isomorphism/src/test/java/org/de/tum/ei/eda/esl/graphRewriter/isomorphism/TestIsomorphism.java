package org.de.tum.ei.eda.esl.graphRewriter.isomorphism;

import javax.swing.JFrame;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import de.tum.ei.eda.esl.grip.ipxactRuleTrafoEpsilon.DisplayGraph;
import edu.uci.ics.jung.algorithms.layout.ISOMLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

public class TestIsomorphism {


	public static void main(String[] args){
	
		System.out.println("VF2 test started: creating graphs");
		Graph g1 = createGraph1();
		Graph g2 = createGraph2();
		
		IsomorphismTester vf2 = new VF2IsomorphismTester();
		
		//DisplayGraph<EObject, EClass> disp = new DisplayGraph<EObject, EClass>();
		
		displayHostGraph(g1, "g1");
		displayHostGraph(g2, "g2");
		
		if(vf2.areIsomorphic(g1, g2))
		{
			System.out.println("VF2: match found");
		}
		else
		{
			System.out.println("VF2:no match found");	
		}
	}
	private static Graph createGraph1() {
		Graph g1 = new SparseGraph<EObject, EClass>();
		EObject a = new NodeImpl("a");
		EObject b = new NodeImpl("b");
		EObject c = new NodeImpl("c");
		EObject d = new NodeImpl("d");
		EObject e = new NodeImpl("e");
		EObject f = new NodeImpl("f");
		EObject g = new NodeImpl("g");
		
		g1.addVertex(a);
		g1.addVertex(b);
		g1.addVertex(c);
		g1.addVertex(d);
		g1.addVertex(e);
		g1.addVertex(f);
		g1.addVertex(g);
		
		EClass ed1 = EcoreFactory.eINSTANCE.createEClass();
		ed1.setName("ed1");
		EClass ed2 = EcoreFactory.eINSTANCE.createEClass();
		ed2.setName("ed1");
		EClass ed3 = EcoreFactory.eINSTANCE.createEClass();
		ed3.setName("ed1");
		EClass ed4 = EcoreFactory.eINSTANCE.createEClass();
		ed4.setName("ed1");
		EClass ed5 = EcoreFactory.eINSTANCE.createEClass();
		ed5.setName("ed1");
		EClass ed6 = EcoreFactory.eINSTANCE.createEClass();
		ed6.setName("ed1");
		g1.addEdge(ed1, a, b);
		g1.addEdge(ed2, a, c);
		g1.addEdge(ed3, a, g);
		g1.addEdge(ed4, a, d);
		g1.addEdge(ed5, b, e);
		g1.addEdge(ed6, b, f);
		
		
		return g1;
		
	}
	private static Graph createGraph2() {
		Graph g2  = new SparseGraph<EObject, EClass>();
		
		
		EObject a = new NodeImpl("a");
		EObject b = new NodeImpl("b");
		EObject c = new NodeImpl("c");
		EObject d = new NodeImpl("d");
		EObject e = new NodeImpl("e");
		EObject f = new NodeImpl("f");
		EObject g = new NodeImpl("g");	
		
		g2.addVertex(a);
		g2.addVertex(b);
		g2.addVertex(c);
		g2.addVertex(d);
		g2.addVertex(e);
		g2.addVertex(f);
		g2.addVertex(g);
		
		EClass ed1 = EcoreFactory.eINSTANCE.createEClass();
		ed1.setName("ed1");
		EClass ed2 = EcoreFactory.eINSTANCE.createEClass();
		ed2.setName("ed1");
		EClass ed3 = EcoreFactory.eINSTANCE.createEClass();
		ed3.setName("ed1");
		EClass ed4 = EcoreFactory.eINSTANCE.createEClass();
		ed4.setName("ed1");
		EClass ed5 = EcoreFactory.eINSTANCE.createEClass();
		ed5.setName("ed1");
		EClass ed6 = EcoreFactory.eINSTANCE.createEClass();
		ed6.setName("ed1");
		g2.addEdge(ed1, a, b);
		g2.addEdge(ed2, a, c);
		g2.addEdge(ed3, a, d);
		g2.addEdge(ed4, a, g);
		g2.addEdge(ed5, b, e);
		g2.addEdge(ed6, b, f);
		
		return g2;
	}
	
	public static void displayHostGraph(Graph<EObject, EClass> graph, String name) {
		JFrame jf = new JFrame(name);
		Layout<EObject, EClass> layout = new ISOMLayout<EObject, EClass>(graph);
	    VisualizationViewer<EObject, EClass> vv = new VisualizationViewer<EObject, EClass>(layout);
	    vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<EObject>());
	    // vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<E>());
	    jf.getContentPane().add(vv);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jf.pack();
	    jf.setVisible(true);
	}
}
