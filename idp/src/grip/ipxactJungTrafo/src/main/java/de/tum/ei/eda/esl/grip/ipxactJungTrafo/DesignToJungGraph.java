package de.tum.ei.eda.esl.grip.ipxactJungTrafo;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit.spirit.DesignType;
import org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.Interface;
import org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritFactory;

import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;

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
public class DesignToJungGraph {
	
	private Graph<EObject, EClass> archGraph = null;
	private EList<ComponentInstanceType> instances = null;
	
	public Graph<EObject, EClass> transformToJung(DesignType design) {
		archGraph = new SparseGraph<EObject, EClass>();		
		
		addComponentInstances(design);
		
		addInterconnections(design);
		
		addAdHocConnections(design);
		
		return this.archGraph;
	}	
	
	private void addComponentInstances(DesignType design) {
		instances = design.getComponentInstances().getComponentInstance();				
		for(Iterator<ComponentInstanceType> itComponentInstance = instances.iterator();
				itComponentInstance.hasNext();){
			ComponentInstanceType componentInstance = itComponentInstance.next();
			componentInstance.setVendorExtensions(null);
			archGraph.addVertex(componentInstance);			
		}
	}
	
	private void addInterconnections(DesignType design) {
		for(Iterator<InterconnectionType> itInterconnect = design.getInterconnections().getInterconnection().iterator();
				itInterconnect.hasNext();){
			InterconnectionType interconnect = itInterconnect.next();
			
			// add port one
			Interface interface1 = interconnect.getActiveInterface().get(0);
			BusInterfaceType node1 = addNodeFromBusInterface(interface1);
			
			// add port two
			Interface interface2 = interconnect.getActiveInterface().get(1);
			BusInterfaceType node2 = addNodeFromBusInterface(interface2);
			
			// connect two ports
			EClass edge = EcoreFactory.eINSTANCE.createEClass();
			edge.setName(interconnect.getName());
			archGraph.addEdge(edge, node1, node2);
		}
	}
	
	private void addAdHocConnections(DesignType design) {
		if(design.getAdHocConnections() != null) {
			EList<AdHocConnectionType> adHocConnections = design.getAdHocConnections().getAdHocConnection();
			for(Iterator<AdHocConnectionType> itAdhoc = adHocConnections.iterator(); itAdhoc.hasNext();){
				AdHocConnectionType connection = itAdhoc.next();
				int internalPortNumber = connection.getInternalPortReference().size();
				int externalPortNumber = connection.getExternalPortReference().size();
				
				if(internalPortNumber == 2 && externalPortNumber == 0) {
					
					InternalPortReferenceType internalPortReference1 =connection.getInternalPortReference().get(0); 
					InternalPortReferenceType node1 = addNodeFromPortReference(internalPortReference1);
										
					InternalPortReferenceType internalPortReference2 =connection.getInternalPortReference().get(1); 
					InternalPortReferenceType node2 = addNodeFromPortReference(internalPortReference2);
										
					// connect two adHoc ports
					EClass edge = EcoreFactory.eINSTANCE.createEClass();
					edge.setName(connection.getName());
					archGraph.addEdge(edge, node1, node2);
					
				} else if(internalPortNumber == 1 && externalPortNumber == 1){
					
					InternalPortReferenceType internalPortReference1 =connection.getInternalPortReference().get(0); 
					InternalPortReferenceType node1 = addNodeFromPortReference(internalPortReference1);	
					
					// add external adHoc port
					ExternalPortReferenceType externalPortReference = connection.getExternalPortReference().get(0);
					ExternalPortReferenceType node2 = addNodeFromPortReference(externalPortReference);
					
					// connect internal port and external port
					EClass edge2 = EcoreFactory.eINSTANCE.createEClass();
					edge2.setName(connection.getName());
					archGraph.addEdge(edge2, node1, node2);
				} else if(internalPortNumber > 0 && internalPortNumber + externalPortNumber > 2){
					
					EClass nodeAdhocConnection = EcoreFactory.eINSTANCE.createEClass();
					nodeAdhocConnection.setName(connection.getName());
					archGraph.addVertex(nodeAdhocConnection);
					
					for(Iterator<InternalPortReferenceType> it = connection.getInternalPortReference().iterator(); it.hasNext();) {
						InternalPortReferenceType internalPortReference = it.next(); 
						InternalPortReferenceType node = addNodeFromPortReference(internalPortReference);
						EClass edge = EcoreFactory.eINSTANCE.createEClass();
						archGraph.addEdge(edge, node, nodeAdhocConnection);
					}
					
					for(Iterator<ExternalPortReferenceType> it = connection.getExternalPortReference().iterator(); it.hasNext();) {
						ExternalPortReferenceType externalPortReference = it.next();
						ExternalPortReferenceType node = addNodeFromPortReference(externalPortReference);
						EClass edge = EcoreFactory.eINSTANCE.createEClass();
						archGraph.addEdge(edge, node, nodeAdhocConnection);
					}					
				} else {
					System.err.println("AdHocConnection error in DesignToJungGraph!!!");
					System.err.println(design.getName()+" connection:"+connection.getName()+" internal port number: "+connection.getInternalPortReference().size()+
							" external port number: "+connection.getExternalPortReference().size());
					for(Iterator<InternalPortReferenceType> it = connection.getInternalPortReference().iterator(); it.hasNext();) {
						InternalPortReferenceType port = it.next();
						System.err.println(port.getComponentRef()+"--->"+port.getPortRef()+"\n");
					}
					for(Iterator<ExternalPortReferenceType> it = connection.getExternalPortReference().iterator(); it.hasNext();) {
						ExternalPortReferenceType port = it.next();
						System.err.println("IO--->"+port.getPortRef()+"\n");
					}
				}
			}
		
		}
	}
	
	private BusInterfaceType addNodeFromBusInterface(Interface busInterface) {
		BusInterfaceType node = spiritFactory.eINSTANCE.createBusInterfaceType();
		node.setName(busInterface.getBusRef());
		archGraph.addVertex(node);
		// connect port one with component
		EClass edge = EcoreFactory.eINSTANCE.createEClass();
		ComponentInstanceType component = getComponentInstance(this.instances,busInterface.getComponentRef());
		archGraph.addEdge(edge, component, node);
		return node;		
	}
	
	private InternalPortReferenceType addNodeFromPortReference(InternalPortReferenceType port) {
		InternalPortReferenceType node = spiritFactory.eINSTANCE.createInternalPortReferenceType();
		node.setPortRef(port.getPortRef());
		node.setLeft(port.getLeft());
		node.setRight(port.getRight());
		archGraph.addVertex(node);
		
		// connect adHoc port one with component
		ComponentInstanceType component = getComponentInstance(this.instances, port.getComponentRef());
		EClass edge = EcoreFactory.eINSTANCE.createEClass();
		archGraph.addEdge(edge, component, node);
		return node;
	}

	private ExternalPortReferenceType addNodeFromPortReference(ExternalPortReferenceType port) {
		ExternalPortReferenceType node = spiritFactory.eINSTANCE.createExternalPortReferenceType();
		node.setPortRef(port.getPortRef());
		node.setLeft(port.getLeft());
		node.setRight(port.getRight());
		archGraph.addVertex(node);
		return node;
	}
	
	private ComponentInstanceType getComponentInstance(EList<ComponentInstanceType> componentInstances, String name) {
		for(Iterator<ComponentInstanceType> it = componentInstances.iterator(); it.hasNext();) {
			ComponentInstanceType instance = it.next();
			if(instance.getInstanceName().equals(name)) {
				return instance;
			}
		}
		return null;
	}
	
}
