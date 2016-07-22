package de.tum.ei.eda.esl.grip.ipxactJungTrafo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;

import javax.swing.JFrame;

import org.apache.commons.collections15.Transformer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit.spirit.DesignType;
import org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot;
import org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.PortType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritFactory;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;
import org.spiritconsortium.xml.schema.spirit.spirit.util.spiritResourceFactoryImpl;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.ISOMLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

public class TestGraphParser {
	
	public static void main(String[] args) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new spiritResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(spiritPackage.eNS_URI, spiritPackage.eINSTANCE);
		
		String designFileName = TestGraphParser.class.getResource("resource/arch3_arm/System.design.1.0.xml").toString();
				
		Resource resource = resourceSet.createResource(URI.createURI(designFileName));
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		DocumentRoot documentRoot = (DocumentRoot) resource.getContents().get(0);
		DesignToJungGraph parser = new DesignToJungGraph();
		Graph<EObject, EClass> archGraph = parser.transformToJung(documentRoot.getDesign());
		displayHostGraph(archGraph, null);
		
		Resource resourceOut = resourceSet.createResource(URI.createURI("System_out.xml"));
		
		DocumentRoot documentRootOut = spiritFactory.eINSTANCE.createDocumentRoot();
		DesignType designOut = new JungGraphToDesign().exportToDesign(archGraph);
		documentRoot.setDesign(designOut);
		resourceOut.getContents().add(documentRoot);
		try {
			resourceOut.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DesignToJungGraph parser2 = new DesignToJungGraph();
		Graph<EObject, EClass> archGraph2 = parser.transformToJung(designOut);
		/*
		for(Iterator<EObject> it=archGraph.getVertices().iterator(); it.hasNext();) {
			EObject element = it.next();
			if(element instanceof EClass) {
				System.out.println( ((EClass) element).getName());
			} else if(element instanceof ComponentInstanceType) {
				System.out.println( ((ComponentInstanceType) element).getInstanceName());
			} else if(element instanceof ExternalPortReferenceType) {
				System.out.println(((ExternalPortReferenceType) element).getPortRef());
			} else if(element instanceof BusInterfaceType) {
				System.out.println(((BusInterfaceType) element).getName());
			} else if(element instanceof PortType) {
				System.out.println( ((PortType) element).getLogicalName());
			} else{
				System.out.println(element.toString());	
			}
		}
		*/
		displayHostGraph(archGraph2, "output");
		
		System.out.println("Finish !");
	}

	
	public static void displayHostGraph(Graph<EObject, EClass> graph, String name) {
		JFrame jf = new JFrame(name);
		//Layout<EObject, EObject> layout = new CircleLayout<EObject, EObject>(graph);
		Layout<EObject, EClass> layout = new ISOMLayout<EObject, EClass>(graph);
		
	    VisualizationViewer<EObject, EClass> vv = new VisualizationViewer<EObject, EClass>(layout);
	    
		Transformer<EObject, String> trans = new Transformer<EObject,String>() {
			public String transform(EObject element) {
				if(element instanceof EClass) {
					return ((EClass) element).getName();
				} else if(element instanceof ComponentInstanceType) {
					return ((ComponentInstanceType) element).getInstanceName();
				} else if(element instanceof ExternalPortReferenceType) {
					return ((ExternalPortReferenceType) element).getPortRef();
				} else if(element instanceof InternalPortReferenceType) {
					return ((InternalPortReferenceType) element).getPortRef();
				} else if(element instanceof BusInterfaceType) {
					return ((BusInterfaceType) element).getName();
				} else if(element instanceof PortType) {
					return ((PortType) element).getLogicalName();
				} else{
					return element.toString();	
				}
				
			}
		};
	    
	    vv.getRenderContext().setVertexLabelTransformer(trans);
	    // vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<EObject>());
	    jf.getContentPane().add(vv);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jf.pack();
	    jf.setVisible(true);
	}
	
	
	}
