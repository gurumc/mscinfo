package de.tum.ei.eda.esl.grip.ipxactRuleTrafoEpsilon;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections15.Transformer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit.spirit.DesignType;
import org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot;
import org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.Interface;
import org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;
import org.spiritconsortium.xml.schema.spirit.spirit.util.spiritResourceFactoryImpl;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.RewriterNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl.CreatorNEEpsilonImpl;
import de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl.ModifierNEEpsilonImpl;
import de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl.RewriterNEEpsilonImpl;
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

public class IpxactToEpsilonRHS {
	
	//private final String emptyEClassEolFileName = IpxactToEpsilonRHS.class.getResource("eols/newEClass.eol").getFile();
	private final String emptyEClassEolFileName = "generatedFiles/newEClass.eol";
	
	private final String componentInstanceModifierTemplate = "freemarkerTemplates/modification/componentInstanceModifierEol.ftl";
	private final String componentInstanceCreatorTemplate = "freemarkerTemplates/creatation/componentInstanceCreatorEol.ftl";
	
	private final String busInterfaceModifierTemplate = "freemarkerTemplates/modification/busInterfaceModifierEol.ftl";
	private final String busInterfaceCreatorTemplate = "freemarkerTemplates/creatation/busInterfaceCreatorEol.ftl";
	private final String internalPortModifierTemplate = "freemarkerTemplates/modification/internalPortModifierEol.ftl";
	private final String internalPortCreatorTemplate = "freemarkerTemplates/creatation/internalPortCreatorEol.ftl";
	private final String externalPortModifierTemplate = "freemarkerTemplates/modification/externalPortModifierEol.ftl";
	private final String externalPortCreatorTemplate = "freemarkerTemplates/creatation/externalPortCreatorEol.ftl";
	
	private final String interconnectionEClassModifierTemplate = "freemarkerTemplates/modification/interconnectionEClassModifierEol.ftl";
	private final String interconnectionEClassCreatorTemplate = "freemarkerTemplates/creatation/interconnectionEClassCreatorEol.ftl";
	private final String adHocConnectionEClassModifierTemplate = "freemarkerTemplates/modification/adHocConnectionEClassModifierEol.ftl";
	private final String adHocConnectionEClassCreatorTemplate = "freemarkerTemplates/creatation/adHocConnectionEClassCreatorEol.ftl";
	
	private Graph<RewriterNE, RewriterNE> rhsGraph = null;
	File eolFolder = null;
	
	private Map<String, EObject> identifierToLhsIpxactElement = null;
	private Map<String, RewriterNE> componentRefToRhsGraphElement = null;
	
	public Graph<RewriterNE, RewriterNE> transformToRHSGraph(DesignType lhsDesign, DesignType rhsDesign) {
		rhsGraph = new SparseGraph<RewriterNE, RewriterNE>();
		identifierToLhsIpxactElement = new HashMap<String, EObject>();
		componentRefToRhsGraphElement = new HashMap<String, RewriterNE>();
		
		loadLhsElements(lhsDesign);
		
		eolFolder = new File("generatedFiles/"+rhsDesign.getName()+"Eols/");
		if(!eolFolder.exists()) {
			eolFolder.mkdirs();
		}
		
		generateEmptyEClassEol();
		
		addComponentInstances(rhsDesign);
		addInterconnections(rhsDesign);
		addAdHocConnections(rhsDesign);
		
		return rhsGraph;
	}
	
	private void generateEmptyEClassEol() {
		File file = new File(emptyEClassEolFileName);
		String content = "var element = new EClass; EClass.all.add(element);";
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
	
	private void addComponentInstances(DesignType rhsDesign) {
		// create component instances eols and add ModifierNE/CreatorNE  
		for(Iterator<ComponentInstanceType> itComponentInstance = 
				rhsDesign.getComponentInstances().getComponentInstance().iterator();
				itComponentInstance.hasNext();){
			ComponentInstanceType componentInstance = itComponentInstance.next();
			RewriterNE node = createNodeFromComponentInstance(componentInstance);
			
			rhsGraph.addVertex(node);
			
			componentRefToRhsGraphElement.put(componentInstance.getInstanceName(), node);
		}
	}	
	
	private void addInterconnections(DesignType rhsDesign) {
		if(rhsDesign.getInterconnections() !=null) {
			EList<InterconnectionType> interconnections = rhsDesign.getInterconnections().getInterconnection();
			for(Iterator<InterconnectionType> itInterconnect = interconnections.iterator(); 
					itInterconnect.hasNext();) {
				InterconnectionType interconnect = itInterconnect.next();
				
				Interface interface1 = interconnect.getActiveInterface().get(0);
				RewriterNE node1 = createNodeFromBusInterface(interface1);
				rhsGraph.addVertex(node1);
				
				connectComponentInstanceAndBusInterface(interface1, 
						componentRefToRhsGraphElement.get(interface1.getComponentRef()), node1);	
				
				
				Interface interface2 = interconnect.getActiveInterface().get(1);
				RewriterNE node2 = createNodeFromBusInterface(interface2);
				rhsGraph.addVertex(node2);
				
				connectComponentInstanceAndBusInterface(interface2, 
						componentRefToRhsGraphElement.get(interface2.getComponentRef()), node2);
								
				connectBusInterfaceAndBusInterface(interconnect, node1, node2);
			}
		}
	}
	
	private void addAdHocConnections(DesignType rhsDesign) {
		if(rhsDesign.getAdHocConnections() != null) {
			EList<AdHocConnectionType> adHocConnections = rhsDesign.getAdHocConnections().getAdHocConnection();
			for(Iterator<AdHocConnectionType> it = adHocConnections.iterator(); it.hasNext();) {
				AdHocConnectionType adHocConnection = it.next();
				int internalPortNumber = adHocConnection.getInternalPortReference().size();
				int externalPortNumber = adHocConnection.getExternalPortReference().size();
				
				if(internalPortNumber == 2 && externalPortNumber == 0) {

					InternalPortReferenceType port1 =adHocConnection.getInternalPortReference().get(0);
					RewriterNE node1 = createNodeFromPortReference(port1);
					rhsGraph.addVertex(node1);
					connectComponentInstanceAndPort(port1, 
							componentRefToRhsGraphElement.get(port1.getComponentRef()), node1);
					
					InternalPortReferenceType port2 =adHocConnection.getInternalPortReference().get(1);
					RewriterNE node2 = createNodeFromPortReference(port2);
					rhsGraph.addVertex(node2);
					connectComponentInstanceAndPort(port2, 
							componentRefToRhsGraphElement.get(port2.getComponentRef()), node2);
					
					connectPortAndPort(adHocConnection, node1, node2);
				
				} else if(internalPortNumber == 1 && externalPortNumber==1) {
				
					InternalPortReferenceType port1 = adHocConnection.getInternalPortReference().get(0);
					RewriterNE node1 = createNodeFromPortReference(port1);
					rhsGraph.addVertex(node1);
					connectComponentInstanceAndPort(port1, 
							componentRefToRhsGraphElement.get(port1.getComponentRef()), node1);
					
					ExternalPortReferenceType port2 = adHocConnection.getExternalPortReference().get(0);
					RewriterNE node2 = createNodeFromPortReference(port2);
					
					connectPortAndPort(adHocConnection, node1, node2);
				
				} else if(internalPortNumber > 0 && internalPortNumber + externalPortNumber > 2){
					
					RewriterNE adHocConnectionNode = createNodeFromAdhocConnection(adHocConnection);
					rhsGraph.addVertex(adHocConnectionNode);
					
					for(Iterator<InternalPortReferenceType> itPort = 
							adHocConnection.getInternalPortReference().iterator();
							itPort.hasNext();) {
						
						InternalPortReferenceType port = itPort.next(); 
						RewriterNE node = createNodeFromPortReference(port);
						rhsGraph.addVertex(node);
						connectComponentInstanceAndPort(port, 
								componentRefToRhsGraphElement.get(port.getComponentRef()), node);
						connectPortAndAdhocConnectionNode(port, adHocConnectionNode, node);
					}
					
					for(Iterator<ExternalPortReferenceType> itPort = 
							adHocConnection.getExternalPortReference().iterator(); 
							itPort.hasNext();) {
						
						ExternalPortReferenceType port = itPort.next(); 
						RewriterNE node = createNodeFromPortReference(port);
						rhsGraph.addVertex(node);
						connectPortAndAdhocConnectionNode(port, adHocConnectionNode, node);
					}
					
				} else {
					System.err.println("AdHocConnection is illegal in IpxactToEpsilonRHS!!!");
					System.err.println(rhsDesign.getName()+" connection:"+adHocConnection.getName()+
							" internal port number: "+adHocConnection.getInternalPortReference().size()+
							" external port number: "+adHocConnection.getExternalPortReference().size());
					for(Iterator<InternalPortReferenceType> it1 = 
							adHocConnection.getInternalPortReference().iterator(); it1.hasNext();) {
						InternalPortReferenceType port = it1.next();
						System.err.println(port.getComponentRef()+"--->"+port.getPortRef()+"\n");
					}
					for(Iterator<ExternalPortReferenceType> it1 = 
							adHocConnection.getExternalPortReference().iterator(); it1.hasNext();) {
						ExternalPortReferenceType port = it1.next();
						System.err.println("IO--->"+port.getPortRef()+"\n");
					}
				}				
			}
		}
	}
	
	private RewriterNE createNodeFromAdhocConnection(
			AdHocConnectionType adHocConnection) {
		String identi = IdentifierFactory.nodeAdhocConnection(adHocConnection);
		String eolName =eolFolder.getPath()+"/"+identi+".eol";
		if(identifierToLhsIpxactElement.containsKey(identi)) {
			generateEolWithFreemarker(adHocConnection, adHocConnectionEClassModifierTemplate, eolName);
			ModifierNEEpsilonImpl<EClass> node = new ModifierNEEpsilonImpl<EClass>();
			node.setIdent(identi);
			node.setEolFileName(eolName);
			return node;	
		} else {
			generateEolWithFreemarker(adHocConnection, adHocConnectionEClassCreatorTemplate, eolName);
			CreatorNEEpsilonImpl<EClass> node = new CreatorNEEpsilonImpl<EClass>();
			node.setIdent(identi);
			node.setEolFileName(eolName);
			return node;
		}
	}

	private RewriterNE createNodeFromBusInterface(Interface busInterface) {
		String identifier = IdentifierFactory.nodeInterface(busInterface);
		String eolName =eolFolder.getPath()+"/"+identifier+".eol";
		if( identifierToLhsIpxactElement.containsKey(identifier) ) {
			generateEolWithFreemarker(busInterface, busInterfaceModifierTemplate, eolName);
			ModifierNEEpsilonImpl<BusInterfaceType> node = new ModifierNEEpsilonImpl<BusInterfaceType>();
			node.setIdent(identifier);
			node.setEolFileName(eolName);
			return node;
		} else {
			generateEolWithFreemarker(busInterface, busInterfaceCreatorTemplate, eolName);
			CreatorNEEpsilonImpl<BusInterfaceType> node = new CreatorNEEpsilonImpl<BusInterfaceType>();
			node.setIdent(identifier);
			node.setEolFileName(eolName);
			return node;
		}
	}
	
	private RewriterNE createNodeFromComponentInstance(ComponentInstanceType componentInstance) {
		String identifier = IdentifierFactory.nodeComponentInstance(componentInstance);
		String eolName =eolFolder.getPath()+"/"+identifier+".eol";
		
		if(identifierToLhsIpxactElement.containsKey(identifier)) {	
			generateEolWithFreemarker(componentInstance, componentInstanceModifierTemplate, eolName);
			ModifierNEEpsilonImpl<ComponentInstanceType> node = new ModifierNEEpsilonImpl<ComponentInstanceType>();
			node.setIdent(identifier);
			node.setEolFileName(eolName);
			return node;
		} else {
			generateEolWithFreemarker(componentInstance, componentInstanceCreatorTemplate, eolName);
			CreatorNEEpsilonImpl<ComponentInstanceType> node = new CreatorNEEpsilonImpl<ComponentInstanceType>();
			node.setIdent(identifier);
			node.setEolFileName(eolName);
			return node;
		}
	}
	
	private RewriterNE createNodeFromPortReference(InternalPortReferenceType port) {
		String identifier = IdentifierFactory.nodeInternalPort(port);
		String eolName = this.eolFolder.getPath()+"/"+identifier+".eol";
		if( this.identifierToLhsIpxactElement.containsKey(identifier) ) {
			generateEolWithFreemarker(port, internalPortModifierTemplate, eolName);
			ModifierNEEpsilonImpl<InternalPortReferenceType> node = new ModifierNEEpsilonImpl<InternalPortReferenceType>();
			node.setIdent(identifier);
			node.setEolFileName(eolName);
			return node;	
		} else {
			generateEolWithFreemarker(port, internalPortCreatorTemplate, eolName);
			CreatorNEEpsilonImpl<InternalPortReferenceType> node = new CreatorNEEpsilonImpl<InternalPortReferenceType>();
			node.setIdent(identifier);
			node.setEolFileName(eolName);
			return node;
		}
	}
	
	private RewriterNE createNodeFromPortReference(ExternalPortReferenceType port) {
		String identifier = IdentifierFactory.nodeExternalPort(port);
		String eolName = this.eolFolder.getPath()+"/"+identifier+".eol";
		if( this.identifierToLhsIpxactElement.containsKey(identifier) ) {
			generateEolWithFreemarker(port, externalPortModifierTemplate, eolName);
			ModifierNEEpsilonImpl<ExternalPortReferenceType> node = new ModifierNEEpsilonImpl<ExternalPortReferenceType>();
			node.setIdent(identifier);
			node.setEolFileName(eolName);
			return node;	
		} else {
			generateEolWithFreemarker(port, externalPortCreatorTemplate, eolName);
			CreatorNEEpsilonImpl<ExternalPortReferenceType> node = new CreatorNEEpsilonImpl<ExternalPortReferenceType>();
			node.setIdent(identifier);
			node.setEolFileName(eolName);
			return node;
		}
	}
	
	private void connectComponentInstanceAndBusInterface(Interface ipxactBusInterface, 
			RewriterNE componentInstance, RewriterNE busInterface) {
		String identi = IdentifierFactory.edgeComponentToBusInterface(ipxactBusInterface);
				
		if(identifierToLhsIpxactElement.containsKey(identi)) {
			RewriterNEEpsilonImpl edge = new RewriterNEEpsilonImpl();
			edge.setIdent(identi);
			this.rhsGraph.addEdge(edge, componentInstance, busInterface);
		} else {
			CreatorNEEpsilonImpl<EClass> edge = new CreatorNEEpsilonImpl<EClass>();
			edge.setIdent(identi);
			
			edge.setEolFileName(emptyEClassEolFileName);
			this.rhsGraph.addEdge(edge, componentInstance, busInterface);
		}
	}
	
	private void connectBusInterfaceAndBusInterface (InterconnectionType ipxactInterconnect, 
			RewriterNE interface1, RewriterNE interface2) {
		String identi = IdentifierFactory.edgeBusInterfaceToBusInterface(ipxactInterconnect);
		String eolName =eolFolder.getPath()+"/"+identi+".eol";
		
		if(identifierToLhsIpxactElement.containsKey(identi)) {
			ModifierNEEpsilonImpl<EClass> edge = new ModifierNEEpsilonImpl<EClass>();
			edge.setIdent(identi);
			generateEolWithFreemarker(ipxactInterconnect, interconnectionEClassModifierTemplate, eolName);
			edge.setEolFileName(eolName);
			this.rhsGraph.addEdge(edge, interface1, interface2);
		} else {
			CreatorNEEpsilonImpl<EClass> edge = new CreatorNEEpsilonImpl<EClass>();
			edge.setIdent(identi);
			generateEolWithFreemarker(ipxactInterconnect, interconnectionEClassCreatorTemplate, eolName);
			edge.setEolFileName(eolName);
			this.rhsGraph.addEdge(edge, interface1, interface2);
		}
	}
	
	private void connectComponentInstanceAndPort(InternalPortReferenceType ipxactPort,
			RewriterNE componentInstance, RewriterNE port) {
		String identi = IdentifierFactory.edgeComponentToAdhocPort(ipxactPort);
		
		if(identifierToLhsIpxactElement.containsKey(identi)) {
			RewriterNEEpsilonImpl edge = new RewriterNEEpsilonImpl();
			edge.setIdent(identi);
			this.rhsGraph.addEdge(edge, componentInstance, port);
		} else {
			CreatorNEEpsilonImpl<EClass> edge = new CreatorNEEpsilonImpl<EClass>();
			edge.setIdent(identi);
			
			edge.setEolFileName(emptyEClassEolFileName);
			this.rhsGraph.addEdge(edge, componentInstance, port);
		}
	}
	
	private void connectPortAndPort (AdHocConnectionType ipxactAdhocConnection, RewriterNE port1, RewriterNE port2) {
		String identi = IdentifierFactory.edgePortToPort(ipxactAdhocConnection);
		String eolName =eolFolder.getPath()+"/"+identi+".eol";
		
		if(identifierToLhsIpxactElement.containsKey(identi)) {
			ModifierNEEpsilonImpl<EClass> edge = new ModifierNEEpsilonImpl<EClass>();
			edge.setIdent(identi);
			generateEolWithFreemarker(ipxactAdhocConnection, adHocConnectionEClassModifierTemplate, eolName);
			edge.setEolFileName(eolName);
			this.rhsGraph.addEdge(edge, port1, port2);
		} else {
			CreatorNEEpsilonImpl<EClass> edge = new CreatorNEEpsilonImpl<EClass>();
			edge.setIdent(identi);
			generateEolWithFreemarker(ipxactAdhocConnection, adHocConnectionEClassCreatorTemplate, eolName);
			edge.setEolFileName(eolName);
			this.rhsGraph.addEdge(edge, port1, port2);
		}
	}
	
	private void connectPortAndAdhocConnectionNode(InternalPortReferenceType ipxactPort,
			RewriterNE port, RewriterNE adHocConnectionNode) {
		String identi = IdentifierFactory.edgePortToAdhocConnection(ipxactPort);
		
		if(identifierToLhsIpxactElement.containsKey(identi)) {
			RewriterNEEpsilonImpl edge = new RewriterNEEpsilonImpl();
			edge.setIdent(identi);
			this.rhsGraph.addEdge(edge, port, adHocConnectionNode);
		} else {
			CreatorNEEpsilonImpl<EClass> edge = new CreatorNEEpsilonImpl<EClass>();
			edge.setIdent(identi);			
			edge.setEolFileName(emptyEClassEolFileName);
			this.rhsGraph.addEdge(edge, port, adHocConnectionNode);
		}
	}
	
	private void connectPortAndAdhocConnectionNode(ExternalPortReferenceType ipxactPort,
			RewriterNE port, RewriterNE adHocConnectionNode) {
		String identi = IdentifierFactory.edgePortToAdhocConnection(ipxactPort);
		if(identifierToLhsIpxactElement.containsKey(identi)) {
			RewriterNEEpsilonImpl edge = new RewriterNEEpsilonImpl();
			edge.setIdent(identi);
			this.rhsGraph.addEdge(edge, port, adHocConnectionNode);
		} else {
			CreatorNEEpsilonImpl<EClass> edge = new CreatorNEEpsilonImpl<EClass>();
			edge.setIdent(identi);			
			edge.setEolFileName(emptyEClassEolFileName);
			this.rhsGraph.addEdge(edge, port, adHocConnectionNode);
		}		
	}
	
	/**
	 * create map from identifiers to all existing elements in lhs
	 * @param lhsDesign
	 */
	private void loadLhsElements(DesignType lhsDesign) {
				
		for(Iterator<ComponentInstanceType> itComponentInstance = 
				lhsDesign.getComponentInstances().getComponentInstance().iterator();
				itComponentInstance.hasNext();){
			ComponentInstanceType componentInstance = itComponentInstance.next();
			identifierToLhsIpxactElement.put(IdentifierFactory.nodeComponentInstance(componentInstance), 
					componentInstance);			
		}
		
		if(lhsDesign.getInterconnections() != null) {
			EList<InterconnectionType> interconnections = lhsDesign.getInterconnections().getInterconnection();
			for(Iterator<InterconnectionType> itInterconnect = interconnections.iterator();
					itInterconnect.hasNext();) {
				InterconnectionType interconnect = itInterconnect.next();
								
				Interface interface1 = interconnect.getActiveInterface().get(0);
				identifierToLhsIpxactElement.put(IdentifierFactory.nodeInterface(interface1), interface1);
				identifierToLhsIpxactElement.put(IdentifierFactory.edgeComponentToBusInterface(interface1),
						interface1);
				
				Interface interface2 = interconnect.getActiveInterface().get(1);
				identifierToLhsIpxactElement.put(IdentifierFactory.nodeInterface(interface2), interface2);
				identifierToLhsIpxactElement.put(IdentifierFactory.edgeComponentToBusInterface(interface2), 
						interface2);
				
				identifierToLhsIpxactElement.put(IdentifierFactory.edgeBusInterfaceToBusInterface(interconnect), 
						interconnect);
			}
		}
		
		if(lhsDesign.getAdHocConnections() != null) {
			EList<AdHocConnectionType> adHocConnections = lhsDesign.getAdHocConnections().getAdHocConnection();
			for(Iterator<AdHocConnectionType> it = adHocConnections.iterator(); it.hasNext();) {
				AdHocConnectionType adHocConnection = it.next();
				
				if(adHocConnection.getInternalPortReference().size() == 2) {
					InternalPortReferenceType port1 =adHocConnection.getInternalPortReference().get(0);
					identifierToLhsIpxactElement.put(IdentifierFactory.nodeInternalPort(port1), port1);
					
					InternalPortReferenceType port2 =adHocConnection.getInternalPortReference().get(1);
					identifierToLhsIpxactElement.put(IdentifierFactory.nodeInternalPort(port2), port2);
					
				} else if(adHocConnection.getInternalPortReference().size() == 1 && 
						adHocConnection.getExternalPortReference().size()==1) {
					InternalPortReferenceType port1 =adHocConnection.getInternalPortReference().get(0);
					identifierToLhsIpxactElement.put(IdentifierFactory.nodeInternalPort(port1), port1);
					
					ExternalPortReferenceType port2 =adHocConnection.getExternalPortReference().get(0);
					identifierToLhsIpxactElement.put(IdentifierFactory.nodeExternalPort(port2), port2);
				} else {
					System.err.println("AdHocConnection is illegal in loading LHS identifiers !!!");
				}
				
				identifierToLhsIpxactElement.put(IdentifierFactory.edgePortToPort(adHocConnection), adHocConnection);
			}
		}
	}
	
	public void generateEolWithFreemarker(EObject instance, String templateName, String outputEvlName) {
		
		Configuration config = new Configuration();
		config.setClassForTemplateLoading(IpxactToEpsilonRHS.class, "");
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
	public static void main(String[] args) {
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new spiritResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(spiritPackage.eNS_URI, spiritPackage.eINSTANCE);
		
		String lhsFileName = new String("../../data/soc/hw/rules/rule1.1_addSO/leftpat/leftpat.design.1.0.xml");
		String rhsFileName = new String("../../data/soc/hw/rules/rule1.1_addSO/rightpat/rightpat.design.1.0.xml");
		Resource resourceLhs = resourceSet.createResource(URI.createURI(lhsFileName));
		Resource resourceRhs = resourceSet.createResource(URI.createURI(rhsFileName));
						
		try {
			resourceLhs.load(null);
			resourceRhs.load(null);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		DocumentRoot documentRootLhs = (DocumentRoot) resourceLhs.getContents().get(0);
		DocumentRoot documentRootRhs = (DocumentRoot) resourceRhs.getContents().get(0);
		Graph<RewriterNE, RewriterNE> rhs = new IpxactToEpsilonRHS().transformToRHSGraph(documentRootLhs.getDesign(),
				documentRootRhs.getDesign());
		
		DisplayGraph<RewriterNE, RewriterNE> displayGraph = new DisplayGraph<RewriterNE, RewriterNE>();
		Transformer<RewriterNE, String> trans = new Transformer<RewriterNE,String>() {
			public String transform(RewriterNE element) {
				return element.getIdent();						
			}
		};
		displayGraph.displayHostGraph(rhs, null, trans);
	}
	*/
}
