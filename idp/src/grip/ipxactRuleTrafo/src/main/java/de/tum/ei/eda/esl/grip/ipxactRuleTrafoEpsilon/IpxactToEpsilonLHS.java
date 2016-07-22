package de.tum.ei.eda.esl.grip.ipxactRuleTrafoEpsilon;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit.spirit.DesignType;
import org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot;
import org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.Interface;
import org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;
import org.spiritconsortium.xml.schema.spirit.spirit.util.spiritResourceFactoryImpl;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.GraphMatcher;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.Match;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.Rule;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.RewriterNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl.CreatorNEEpsilonImpl;
import de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl.ModifierNEEpsilonImpl;
import de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl.PatternNEEpsilonImpl;
import de.tum.ei.eda.esl.grip.ipxactJungTrafo.DesignToJungGraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * 
 * Node: ComponentInstanceType
 * Node: BusInterfaceType (busPort),
 * Node: InternalPortReferenceType/ExternalPortReferenceType
 * Node: EClass(component->port->EClass->port->component)
 * 
 * Edge: EClass only show connection
 *  
 */

public class IpxactToEpsilonLHS {
	
	private final String componentInstanceTemplate = "freemarkerTemplates/validation/componentInstanceEvl.ftl";
	private final String busInterfaceTemplate = "freemarkerTemplates/validation/busInterfaceEvl.ftl";
	private final String externalAdHocPortTemplate = "freemarkerTemplates/validation/externalAdHocPortEvl.ftl";
	private final String internalAdHocPortTemplate = "freemarkerTemplates/validation/internalAdHocPortEvl.ftl";
	
	// private final String emptyEvl = IpxactToEpsilonLHS.class.getResource("evls/any.evl").getFile();
	private final String emptyEvl = "generatedFiles/any.evl";
	
	private Graph<PatternNE, PatternNE> lhsGraph = null;
	private Map<String, PatternNE> componentRefToPatternNEMap = null;  
	File evlFolder = null;
	
	public Graph<PatternNE, PatternNE> transformToLHSGraph(DesignType design) {
		lhsGraph = new SparseGraph<PatternNE, PatternNE>();
		componentRefToPatternNEMap = new HashMap<String, PatternNE>();
		
		evlFolder = new File("generatedFiles/"+design.getName()+"Evls/");
		if(!evlFolder.exists()) {
			evlFolder.mkdirs();
		}
		
		generateEvlForUnconstraintElements();
		
		addComponentInstances(design);
		addInterconnections(design);		
		addAdHocConnections(design);
		
		return lhsGraph;
	}
	
	private void generateEvlForUnconstraintElements() {
		File file = new File(emptyEvl);
		String content = "";
		FileWriter fw;
		try {
			fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	private void addComponentInstances(DesignType design) {
		// generate component instances evls and add to graph
		EList<ComponentInstanceType> instances = design.getComponentInstances().getComponentInstance();
		for(Iterator<ComponentInstanceType> itComponentInstance = instances.iterator();
				itComponentInstance.hasNext();){
			ComponentInstanceType componentInstance = itComponentInstance.next();
			String evlName = new String();
			evlName =evlFolder.getPath()+"/"+componentInstance.getInstanceName()+".evl";
			generateEvlWithFreemarker(componentInstance, componentInstanceTemplate, evlName);
			PatternNEEpsilonImpl node = new PatternNEEpsilonImpl();
			node.setIdent(IdentifierFactory.nodeComponentInstance(componentInstance));
			node.setEvlFileName(evlName);
			lhsGraph.addVertex(node);
			componentRefToPatternNEMap.put(node.getIdent(), node);
		}
	}
	
	private void addInterconnections(DesignType design) {
		// generate interconnection(bus interface) evls and add to graph
		if(design.getInterconnections() !=null) {
			EList<InterconnectionType> interconnections = design.getInterconnections().getInterconnection();
			for(Iterator<InterconnectionType> itInterconnect = interconnections.iterator(); 
					itInterconnect.hasNext();) {
				InterconnectionType interconnect = itInterconnect.next();
				
				// generate bus interface one evl
				Interface interface1 = interconnect.getActiveInterface().get(0);
				PatternNE node1 = addNodeFromBusInterface(interface1);
					
				// generate bus interface two evl
				Interface interface2 = interconnect.getActiveInterface().get(1);
				PatternNE node2 = addNodeFromBusInterface(interface2);
				
				connectWithUnconstraintedEdge(
						IdentifierFactory.edgeBusInterfaceToBusInterface(interconnect), node1, node2);
			}
		}
	}
	
	private void addAdHocConnections(DesignType design) {
		// generate adhocConnection evls and add to graph
		if(design.getAdHocConnections() != null) {
			EList<AdHocConnectionType> adHocConnections = design.getAdHocConnections().getAdHocConnection();
			for(Iterator<AdHocConnectionType> it = adHocConnections.iterator(); it.hasNext();) {
				AdHocConnectionType adHocConnection = it.next();
				int internalPortNumber = adHocConnection.getInternalPortReference().size();
				int externalPortNumber = adHocConnection.getExternalPortReference().size();
				
				
				if(internalPortNumber == 2) {
					// add internal ports
					InternalPortReferenceType port1 =adHocConnection.getInternalPortReference().get(0);
					PatternNE node1 = addNodeFromPortReference(port1);
					
					InternalPortReferenceType port2 =adHocConnection.getInternalPortReference().get(1);
					PatternNE node2 = addNodeFromPortReference(port2);
					
					connectWithUnconstraintedEdge(
							IdentifierFactory.edgePortToPort(adHocConnection), node1, node2);
									
				} else if(internalPortNumber == 1 && externalPortNumber==1) {
					// add one internal port
					InternalPortReferenceType port1 =adHocConnection.getInternalPortReference().get(0);
					PatternNE node1 = addNodeFromPortReference(port1);
										
					// add one external port
					ExternalPortReferenceType port2 =adHocConnection.getExternalPortReference().get(0);
					PatternNE node2 = addNodeFromPortReference(port2);
															
					connectWithUnconstraintedEdge(
							IdentifierFactory.edgePortToPort(adHocConnection), node1, node2);
				} else if(internalPortNumber > 0 && internalPortNumber + externalPortNumber > 2){
					PatternNE adHocConnectionNode = createNodeFromAdhocConnection(adHocConnection);
					lhsGraph.addVertex(adHocConnectionNode);
					
					for(Iterator<InternalPortReferenceType> itPort = 
							adHocConnection.getInternalPortReference().iterator();
							itPort.hasNext();) {
						
						InternalPortReferenceType port = itPort.next(); 
						PatternNE node = addNodeFromPortReference(port);
						connectWithUnconstraintedEdge(
								IdentifierFactory.edgePortToAdhocConnection(port), node, adHocConnectionNode);
					}
					
					for(Iterator<ExternalPortReferenceType> itPort = 
							adHocConnection.getExternalPortReference().iterator(); 
							itPort.hasNext();) {
						
						ExternalPortReferenceType port = itPort.next(); 
						PatternNE node = addNodeFromPortReference(port);
						connectWithUnconstraintedEdge(
								IdentifierFactory.edgePortToAdhocConnection(port), node, adHocConnectionNode);
					}
										
				} else {
					System.err.println("AdHocConnection is illegal in LHS!!!");
				}
			}
		}
	}
	
	private PatternNE createNodeFromAdhocConnection( AdHocConnectionType adHocConnection) {
		String identi = IdentifierFactory.nodeAdhocConnection(adHocConnection);
		PatternNEEpsilonImpl node = new PatternNEEpsilonImpl();
		node.setIdent(identi);
		node.setEvlFileName(emptyEvl);
		return node;
		
	}
	
	private PatternNE addNodeFromBusInterface(Interface busInterface) {
		String evlName = new String();
		evlName =evlFolder.getPath()+"/"+busInterface.getComponentRef()+"_"+busInterface.getBusRef()+".evl";
		generateEvlWithFreemarker(busInterface, busInterfaceTemplate, evlName);
		PatternNEEpsilonImpl node = new PatternNEEpsilonImpl();
		node.setIdent(IdentifierFactory.nodeInterface(busInterface));
		node.setEvlFileName(evlName);
		lhsGraph.addVertex(node);
		connectWithUnconstraintedEdge(IdentifierFactory.edgeComponentToBusInterface(busInterface),
				node, componentRefToPatternNEMap.get(busInterface.getComponentRef()));
		return node;
	}
	
	private PatternNE addNodeFromPortReference(InternalPortReferenceType port) {
		String evlName = new String();
		evlName =evlFolder.getPath()+"/"+port.getComponentRef()+"_"+port.getPortRef()+".evl";
		generateEvlWithFreemarker(port, internalAdHocPortTemplate, evlName);
		PatternNEEpsilonImpl node = new PatternNEEpsilonImpl();
		node.setIdent(IdentifierFactory.nodeInternalPort(port));
		node.setEvlFileName(evlName);
		lhsGraph.addVertex(node);
		connectWithUnconstraintedEdge(IdentifierFactory.edgeComponentToAdhocPort(port), 
				node, componentRefToPatternNEMap.get(port.getComponentRef()));
		return node;
	}
	
	private PatternNE addNodeFromPortReference(ExternalPortReferenceType port) {
		String evlName = new String();
		evlName =evlFolder.getPath()+"/"+"IO_"+port.getPortRef()+".evl";
		generateEvlWithFreemarker(port, externalAdHocPortTemplate, evlName);
		PatternNEEpsilonImpl node = new PatternNEEpsilonImpl();
		node.setIdent(IdentifierFactory.nodeExternalPort(port));
		node.setEvlFileName(evlName);
		lhsGraph.addVertex(node);		
		return node;
	}
	
	private void connectWithUnconstraintedEdge(String identi, PatternNE node1, PatternNE node2) {
		PatternNEEpsilonImpl edge = new PatternNEEpsilonImpl();
		edge.setEvlFileName(emptyEvl);
		//edge.setIdent(node1.getIdent()+"And"+node2.getIdent());
		edge.setIdent(identi);
		this.lhsGraph.addEdge(edge, node1, node2);
	}
	
	public void generateEvlWithFreemarker(EObject instance, String templateName, String outputEvlName) {
		Configuration config = new Configuration();
		config.setClassForTemplateLoading(IpxactToEpsilonLHS.class, "");
		Template template = null;
		try {
			
			template = config.getTemplate(templateName);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		FileWriter out = null;
		try {
			out = new FileWriter(outputEvlName);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
        try {
			template.process(instance, out);
		} catch (TemplateException e) {
			e.printStackTrace();			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
		
	/*
	public static void main(String[] args) throws IOException {
		DisplayGraph<EObject, EClass> displayGraph = new DisplayGraph<EObject, EClass>();
		
		String lhsFileName = new String("../data/soc/hw/rules/rule1.1_addSO/leftpat/leftpat.design.1.0.xml");
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new spiritResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(spiritPackage.eNS_URI, spiritPackage.eINSTANCE);
		Resource resource = resourceSet.createResource(URI.createURI(lhsFileName));
				
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("lhs file is loaded!");
		DocumentRoot documentRoot = (DocumentRoot) resource.getContents().get(0);
		Graph<PatternNE, PatternNE> lhs = new IpxactToEpsilonLHS().transformToLHSGraph(documentRoot.getDesign());
		displayGraph.displayPatternGraph(lhs, null);
		System.out.println("lhs graph is created!");
		
		String hostFileName = new String("../data/soc/hw/inputdes/arch0/System.design.1.0.xml");
		Resource resourceHost = resourceSet.createResource(URI.createURI(hostFileName));
		try {
			resourceHost.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("host file is loaded!");
		DocumentRoot documentRootHost = (DocumentRoot) resourceHost.getContents().get(0);
		Graph<EObject, EClass> hostGraph = new DesignToJungGraph().transformToJung(documentRootHost.getDesign());
		Rule rule = new Rule();
		rule.setGraphletLhs(lhs);
		System.out.println("host graph is created!");
		
		GraphMatcher<EObject, EClass> matcher = new GraphMatcher<EObject, EClass>();
		Set<Match<EObject, EClass>> matches1 = matcher.matchLHS(hostGraph, rule);
		System.out.println(matches1.size()+" matches are found in host graph");
		
		Match<EObject, EClass> match1 = null;
		for(Iterator<Match<EObject, EClass>> it=matches1.iterator(); it.hasNext();) {
			match1 = it.next();
			displayGraph.displayHostGraph(displayGraph.constructMatchedSubgraph(hostGraph, lhs, match1), null);
		}
		
		System.out.println("Finish !");
		

	}
	 */
}
