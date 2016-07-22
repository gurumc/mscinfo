package de.tum.ei.eda.esl.grip.ipxactJungTrafo;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit.spirit.DesignType;
import org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.Interface;
import org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.PortType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritFactory;

import edu.uci.ics.jung.graph.Graph;



/**
 * 
 * Node: ComponentInstanceType
 * Node: BusInterfaceType (busPort),
 * Node: InternalPortReferenceType/ExternalPortReferenceType
 * 
 * Edge: EClass only show connection
 *  
 */
public class JungGraphToDesign {
	Graph<EObject, EClass> archGraph = null;
	private DesignType design = null;
	private EList<ComponentInstanceType> instances = null;
	private EList<InterconnectionType> interconnections = null;
	private EList<AdHocConnectionType> adHocConnections = null;
	
	private EList<EObject> exportedNodes = null;
		
	public DesignType exportToDesign(Graph<EObject, EClass> graph) {
		
		this.exportedNodes = new BasicEList<EObject>();
		this.archGraph = graph;
		
		createEmptyDesign();
		
		parseComponentInstances();
		
		parseInterconnections();
		
		parseAdHocConnections();
						
		return design;
	}

	private void createEmptyDesign() {
		design = spiritFactory.eINSTANCE.createDesignType();
		design.setComponentInstances( spiritFactory.eINSTANCE.createComponentInstancesType());
		design.setInterconnections(spiritFactory.eINSTANCE.createInterconnectionsType());
		design.setAdHocConnections(spiritFactory.eINSTANCE.createAdHocConnectionsType());
		
		this.instances = design.getComponentInstances().getComponentInstance();
		this.interconnections = design.getInterconnections().getInterconnection();
		this.adHocConnections = design.getAdHocConnections().getAdHocConnection();
	}
	
	private void parseComponentInstances() {
		for(Iterator<EObject> itVertex = this.archGraph.getVertices().iterator(); itVertex.hasNext();) {
			EObject node = itVertex.next();
			if(node instanceof ComponentInstanceType) {
				instances.add((ComponentInstanceType) node);
				exportedNodes.add(node);
			}
		}
	}
	
	private void parseInterconnections() {
		for(Iterator<EObject> itVertex = this.archGraph.getVertices().iterator(); itVertex.hasNext();) {
			EObject node = itVertex.next();
			if(node instanceof BusInterfaceType && !exportedNodes.contains(node)) {
				ComponentInstanceType component = getNeighborComponentInstance(node);
				BusInterfaceType oppositePort = getNeighborBusInterface(node);
				EClass edgeToOppositePort = archGraph.findEdge(node, oppositePort);
				ComponentInstanceType oppositeComponent = getNeighborComponentInstance(oppositePort);
				
				InterconnectionType interconnection = spiritFactory.eINSTANCE.createInterconnectionType();
				interconnection.setName(edgeToOppositePort.getName());
				
				// add interfaces to this interconnection on both sides 
				Interface interface1 = spiritFactory.eINSTANCE.createInterface();
				interface1.setBusRef(((BusInterfaceType) node).getName());
				interface1.setComponentRef(component.getInstanceName());
				
				Interface interface2 = spiritFactory.eINSTANCE.createInterface();
				interface2.setBusRef(((BusInterfaceType) oppositePort).getName());
				interface2.setComponentRef(oppositeComponent.getInstanceName());
								
				interconnection.getActiveInterface().add(interface1);
				interconnection.getActiveInterface().add(interface2);
				
				interconnections.add(interconnection);
				exportedNodes.add(node);
				exportedNodes.add(oppositePort);
			}
		}
	}
	
	private void parseAdHocConnections() {
		/**
		 * adhocconnections are parsed in a fixed order, multi-port connection, external port connection, internal port
		 * when a port node is parsed, all connected port nodes will be parsed as well 
		 */
		parseMultiplePortConnections();
		
		parseExternalPortConnections();
		
		parseInternalPortConnections();	
	}
	
	private void parseMultiplePortConnections() {
		for(Iterator<EObject> itVertex = this.archGraph.getVertices().iterator(); itVertex.hasNext();) {
			EObject node = itVertex.next();
			if(node instanceof EClass && !exportedNodes.contains(node)) {
				AdHocConnectionType adHocConnection = spiritFactory.eINSTANCE.createAdHocConnectionType();
				adHocConnections.add(adHocConnection);
				
				EList<InternalPortReferenceType> internalPorts = new BasicEList<InternalPortReferenceType>();
				EList<ExternalPortReferenceType> externalPorts = new BasicEList<ExternalPortReferenceType>();
				
				for(Iterator<EObject> itNeighbor = archGraph.getNeighbors(node).iterator(); itNeighbor.hasNext();) {
					EObject neighbor = itNeighbor.next();
					if(neighbor instanceof ExternalPortReferenceType) {
						ExternalPortReferenceType newPort = createExternalPortReferenceFromNode((ExternalPortReferenceType) neighbor);
						externalPorts.add(newPort);
						exportedNodes.add(neighbor);
					} else if (neighbor instanceof InternalPortReferenceType) {
						InternalPortReferenceType newPort = createInternalPortReferenceFromNode((InternalPortReferenceType) neighbor);
						internalPorts.add(newPort);
						exportedNodes.add(neighbor);
					} else {
						System.err.println("Illegal port type in JungToDesign !");
					}
				}
				
				adHocConnection.getInternalPortReference().addAll(internalPorts);
				adHocConnection.getExternalPortReference().addAll(externalPorts);
				adHocConnection.setName(((EClass) node).getName());
				exportedNodes.add(node);
			}
		}
	}
	
	private void parseExternalPortConnections() {
		for(Iterator<EObject> itVertex = this.archGraph.getVertices().iterator(); itVertex.hasNext();) {
			EObject node = itVertex.next();
			if(node instanceof ExternalPortReferenceType && !exportedNodes.contains(node)) {
				AdHocConnectionType adHocConnection = spiritFactory.eINSTANCE.createAdHocConnectionType();
				adHocConnections.add(adHocConnection);
				
				// current node is an external IO port, connected port must be internal
				InternalPortReferenceType oppositePort = getNeighborInternalPort(node);
				EClass edgeToOppositePort = archGraph.findEdge(node, oppositePort);
								
				ExternalPortReferenceType newExternalPort = createExternalPortReferenceFromNode((ExternalPortReferenceType) node);
				InternalPortReferenceType newInternalPort = createInternalPortReferenceFromNode(oppositePort);

				adHocConnection.setName(edgeToOppositePort.getName());
				adHocConnection.getInternalPortReference().add(newInternalPort);
				adHocConnection.getExternalPortReference().add(newExternalPort);
				exportedNodes.add(node);
				exportedNodes.add(oppositePort);
			}
		}
	}
	
	private void parseInternalPortConnections() {
		for(Iterator<EObject> itVertex = this.archGraph.getVertices().iterator(); itVertex.hasNext();) {
			EObject node = itVertex.next();
			if(node instanceof InternalPortReferenceType && !exportedNodes.contains(node)) {
				AdHocConnectionType adHocConnection = spiritFactory.eINSTANCE.createAdHocConnectionType();
				adHocConnections.add(adHocConnection);
								
				InternalPortReferenceType oppositePort = getNeighborInternalPort(node);
				EClass edgeToOppositePort = archGraph.findEdge(node, oppositePort);
				
				InternalPortReferenceType newInternalPort1 = createInternalPortReferenceFromNode((InternalPortReferenceType) node);
				InternalPortReferenceType newInternalPort2 = createInternalPortReferenceFromNode(oppositePort);
				
				adHocConnection.setName(edgeToOppositePort.getName());
				adHocConnection.getInternalPortReference().add(newInternalPort1);
				adHocConnection.getInternalPortReference().add(newInternalPort2);
				
				exportedNodes.add(node);
				exportedNodes.add(oppositePort);					
				
			}
		}	
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
	
	private ExternalPortReferenceType createExternalPortReferenceFromNode(ExternalPortReferenceType node) {
		ExternalPortReferenceType newPort = spiritFactory.eINSTANCE.createExternalPortReferenceType();
		newPort.setPortRef(((ExternalPortReferenceType) node).getPortRef());
		newPort.setLeft(((ExternalPortReferenceType) node).getLeft());
		newPort.setRight(((ExternalPortReferenceType) node).getRight());
		return newPort;
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
	
}
