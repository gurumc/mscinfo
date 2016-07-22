package de.tum.ei.eda.esl.grip.ipxactRuleTrafoEpsilon;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit.spirit.DesignType;
import org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.Interface;
import org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritFactory;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl.PatternNEEpsilonImpl;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;

public class JungGraphToEpsilonLHS{
	
	private final String componentInstanceTemplate = "freemarkerTemplates/validation/componentInstanceEvl.ftl";
	private final String busInterfaceTemplate = "freemarkerTemplates/validation/busInterfaceEvl.ftl";
	private final String externalAdHocPortTemplate = "freemarkerTemplates/validation/externalAdHocPortEvl.ftl";
	private final String internalAdHocPortTemplate = "freemarkerTemplates/validation/internalAdHocPortEvl.ftl";
	
	// private final String emptyEvl = IpxactToEpsilonLHS.class.getResource("evls/any.evl").getFile();
	private final String emptyEvl = "generatedFiles/any.evl";
	
	private Map<String, PatternNE> componentRefToPatternNEMap = null; 
	private IpxactToEpsilonLHS ipxactToEpsilonLHS = new IpxactToEpsilonLHS();
	
	Graph<EObject, EClass> archGraph = null;
	File evlFolder = null;
	private Graph<PatternNE, PatternNE> lhsGraph = null;
	private EList<EObject> exportedNodes = null;
	Map<EObject, PatternNE> eobjectToPatternNE= null;
	
	public Graph<PatternNE, PatternNE> transformToLHSGraph(Graph<EObject,EClass> jungGraph)
	{
		this.exportedNodes = new BasicEList<EObject>();
		lhsGraph = new SparseGraph<PatternNE, PatternNE>();
		componentRefToPatternNEMap = new HashMap<String, PatternNE>();
		this.archGraph = jungGraph;
		this.eobjectToPatternNE= new HashMap<EObject, PatternNE>();
		
		evlFolder = new File("generatedFiles/"+jungGraph.toString()+"Evls/");//TODO change the name
		if(!evlFolder.exists()) {
			evlFolder.mkdirs();
		}
		
		generateEvlForUnconstraintElements();
		
		addComponentInstances(jungGraph);
		//addInterconnections(jungGraph);		
		addAdHocConnections(jungGraph);
		
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
	
	private void addComponentInstances(Graph<EObject,EClass> jungGraph)
	{
		for(EObject vertex: jungGraph.getVertices())
		{	
			if(vertex instanceof ComponentInstanceType)
			{
				ComponentInstanceType componentInstance = (ComponentInstanceType) vertex;
				String evlName = new String();
				evlName =evlFolder.getPath()+"/"+ componentInstance.getInstanceName()+".evl";
				ipxactToEpsilonLHS.generateEvlWithFreemarker(componentInstance, componentInstanceTemplate, evlName);
				PatternNEEpsilonImpl node = new PatternNEEpsilonImpl();
				node.setIdent(IdentifierFactory.nodeComponentInstance(componentInstance));
				node.setEvlFileName(evlName);
				lhsGraph.addVertex(node);
				eobjectToPatternNE.put(vertex, node);
				componentRefToPatternNEMap.put(node.getIdent(), node);
				exportedNodes.add(vertex);
			}
			
			if(vertex instanceof BusInterfaceType && !exportedNodes.contains(vertex))
			{
				ComponentInstanceType component = getNeighborComponentInstance(vertex);
				BusInterfaceType oppositePort = getNeighborBusInterface(vertex);
				EClass edgeToOppositePort = archGraph.findEdge(vertex, oppositePort);
				ComponentInstanceType oppositeComponent = getNeighborComponentInstance(oppositePort);
				
				InterconnectionType interconnection = spiritFactory.eINSTANCE.createInterconnectionType();
				interconnection.setName(edgeToOppositePort.getName());
				
				// add interfaces to this interconnection on both sides 
				Interface interface1 = spiritFactory.eINSTANCE.createInterface();
				interface1.setBusRef(((BusInterfaceType) vertex).getName());
				interface1.setComponentRef(component.getInstanceName());
				PatternNE node1 = addNodeFromBusInterface(interface1);
				
				Interface interface2 = spiritFactory.eINSTANCE.createInterface();
				interface2.setBusRef(((BusInterfaceType) oppositePort).getName());
				interface2.setComponentRef(oppositeComponent.getInstanceName());
				PatternNE node2 = addNodeFromBusInterface(interface2);
				
				connectWithUnconstraintedEdge(
						IdentifierFactory.edgeBusInterfaceToBusInterface(interconnection), node1, node2);
				exportedNodes.add(vertex);
			}
		}

	}
	
	private void addAdHocConnections(Graph<EObject,EClass> jungGraph)
	{

		for(EObject vertex: jungGraph.getVertices())
		{	
			if(vertex instanceof EClass && !exportedNodes.contains(vertex))
			{
				AdHocConnectionType adHocConnection = spiritFactory.eINSTANCE.createAdHocConnectionType();
				adHocConnection.setName(((EClass) vertex).getName());
				PatternNE adHocConnectionNode = createNodeFromAdhocConnection(adHocConnection);
				lhsGraph.addVertex(adHocConnectionNode);
				eobjectToPatternNE.put(vertex, adHocConnectionNode);
				
				for(EObject neighbor: archGraph.getNeighbors(vertex))
				{
					if(neighbor instanceof ExternalPortReferenceType) {
						ExternalPortReferenceType port = createExternalPortReferenceFromNode((ExternalPortReferenceType) neighbor);
						PatternNE node = addNodeFromPortReference(port);
						connectWithUnconstraintedEdge(
								IdentifierFactory.edgePortToAdhocConnection(port), node, adHocConnectionNode);
						exportedNodes.add(neighbor);
					}
					else if (neighbor instanceof InternalPortReferenceType) {
						InternalPortReferenceType port = createInternalPortReferenceFromNode((InternalPortReferenceType) neighbor);
						PatternNE node = addNodeFromPortReference(port);
						connectWithUnconstraintedEdge(
								IdentifierFactory.edgePortToAdhocConnection(port), node, adHocConnectionNode);
						exportedNodes.add(neighbor);
					}
					else {
						System.err.println("Illegal port type in JungToDesign !");
					}		
				}
				exportedNodes.add(vertex);
			}
			if(vertex instanceof ExternalPortReferenceType && !exportedNodes.contains(vertex)) {
				InternalPortReferenceType oppositePort = getNeighborInternalPort(vertex);
				EClass edgeToOppositePort = archGraph.findEdge(vertex, oppositePort);
				AdHocConnectionType adHocConnection = spiritFactory.eINSTANCE.createAdHocConnectionType();
				adHocConnection.setName(edgeToOppositePort.getName());
				
				InternalPortReferenceType port1 = createInternalPortReferenceFromNode(oppositePort);
				PatternNE node1 = addNodeFromPortReference(port1);
				
				// add one external port
				ExternalPortReferenceType port2 = createExternalPortReferenceFromNode((ExternalPortReferenceType) vertex);
				PatternNE node2 = addNodeFromPortReference(port2);
														
				connectWithUnconstraintedEdge(
						IdentifierFactory.edgePortToPort(adHocConnection), node1, node2);
				exportedNodes.add(vertex);		
			}
			
			if(vertex instanceof InternalPortReferenceType && !exportedNodes.contains(vertex)) {
				AdHocConnectionType adHocConnection = spiritFactory.eINSTANCE.createAdHocConnectionType();
				InternalPortReferenceType oppositePort = getNeighborInternalPort(vertex);
				EClass edgeToOppositePort = archGraph.findEdge(vertex, oppositePort);
				adHocConnection.setName(edgeToOppositePort.getName());
				
				InternalPortReferenceType port1 = createInternalPortReferenceFromNode((InternalPortReferenceType) vertex);;
				PatternNE node1 = addNodeFromPortReference(port1);
				
				InternalPortReferenceType port2 = createInternalPortReferenceFromNode(oppositePort);
				PatternNE node2 = addNodeFromPortReference(port2);
				
				connectWithUnconstraintedEdge(
						IdentifierFactory.edgePortToPort(adHocConnection), node1, node2);
				exportedNodes.add(vertex);
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
	
	private ExternalPortReferenceType createExternalPortReferenceFromNode(ExternalPortReferenceType node) {
		ExternalPortReferenceType newPort = spiritFactory.eINSTANCE.createExternalPortReferenceType();
		newPort.setPortRef(((ExternalPortReferenceType) node).getPortRef());
		newPort.setLeft(((ExternalPortReferenceType) node).getLeft());
		newPort.setRight(((ExternalPortReferenceType) node).getRight());
		return newPort;
	}
	
	private InternalPortReferenceType createInternalPortReferenceFromNode(InternalPortReferenceType node) {
		ComponentInstanceType connectedComponent = getNeighborComponentInstance(node);
		if(connectedComponent == null) {
			return null;
		} else {
			InternalPortReferenceType newPort = spiritFactory.eINSTANCE.createInternalPortReferenceType();
			newPort.setPortRef(node.getPortRef());
			newPort.setComponentRef(connectedComponent.getInstanceName());
			newPort.setLeft(node.getLeft());
			newPort.setRight(node.getRight());
			return newPort;	
		}		
	}
	
	/**
	 * 
	 * @param node
	 * @return connected node with ComponentInstanceType (there cannot be more than one instances)
	 */
	private ComponentInstanceType getNeighborComponentInstance(EObject node) {
		ComponentInstanceType chosenNeighbor = null;
		
		for(Iterator<EObject> it=archGraph.getNeighbors(node).iterator(); it.hasNext();) {
			EObject neighbor = it.next();
			if(neighbor instanceof ComponentInstanceType) {
				chosenNeighbor = (ComponentInstanceType) neighbor;
				break;
			} 
		}
		return chosenNeighbor;
	}
	
	/**
	 * 
	 * @param node
	 * @return the first detected neighbor node with BusInterfaceType
	 */
	private BusInterfaceType getNeighborBusInterface(EObject node) {
		BusInterfaceType chosenNeighbor = null;
		
		for(Iterator<EObject> it=archGraph.getNeighbors(node).iterator(); it.hasNext();) {
			EObject neighbor = it.next();
			if(neighbor instanceof BusInterfaceType) {
				chosenNeighbor = (BusInterfaceType) neighbor;
				break;
			} 
		}
		return chosenNeighbor;
	}
	
	private InternalPortReferenceType getNeighborInternalPort(EObject node) {
		InternalPortReferenceType chosenNeighbor = null;
		
		for(Iterator<EObject> it=archGraph.getNeighbors(node).iterator(); it.hasNext();) {
			EObject neighbor = it.next();
			if(neighbor instanceof InternalPortReferenceType) {
				chosenNeighbor = (InternalPortReferenceType) neighbor;
				break;
			} 
		}
		return chosenNeighbor;
	}
	private PatternNE addNodeFromBusInterface(Interface busInterface) {
		String evlName = new String();
		evlName =evlFolder.getPath()+"/"+busInterface.getComponentRef()+"_"+busInterface.getBusRef()+".evl";
		ipxactToEpsilonLHS.generateEvlWithFreemarker(busInterface, busInterfaceTemplate, evlName);
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
		ipxactToEpsilonLHS.generateEvlWithFreemarker(port, internalAdHocPortTemplate, evlName);
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
		ipxactToEpsilonLHS.generateEvlWithFreemarker(port, externalAdHocPortTemplate, evlName);
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
}
