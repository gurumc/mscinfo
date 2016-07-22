package de.tum.ei.eda.esl.grip.ipxactRuleTrafoEpsilon;

import org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.Interface;
import org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType;

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

public class IdentifierFactory {
	
	public static String nodeComponentInstance(ComponentInstanceType instance) {
		return instance.getInstanceName();
	}

	public static String nodeInterface(Interface interface1) {
		return interface1.getComponentRef()+"_"+interface1.getBusRef();
	}
	
	public static String nodeInternalPort(InternalPortReferenceType port) {
		return port.getComponentRef()+"_"+port.getPortRef()+"_"+port.getLeft();
	}
	
	public static String nodeExternalPort(ExternalPortReferenceType port) {
		return port.getPortRef()+"_"+port.getLeft();
	}
	
	public static String nodeAdhocConnection(AdHocConnectionType connection) {
		return connection.getName();
	}
	
	public static String edgeComponentToBusInterface(Interface interface1) {
		return "E_"+interface1.getComponentRef()+"_"+interface1.getBusRef();
	}
	
	public static String edgeComponentToAdhocPort(InternalPortReferenceType port) {
		return "E_"+port.getComponentRef()+"_"+port.getPortRef()+"_"+port.getLeft();
	}
	
	public static String edgeBusInterfaceToBusInterface(InterconnectionType interconnect) {
		return "E_"+interconnect.getName();
	}

	public static String edgePortToPort(AdHocConnectionType connect) {
		return "E_"+connect.getName();
	}
	
	public static String edgePortToAdhocConnection(InternalPortReferenceType port) {
		return "E_MUL_"+port.getComponentRef()+"_"+port.getPortRef()+"_"+port.getLeft();
	}

	public static String edgePortToAdhocConnection(ExternalPortReferenceType port) {
		return "E_MUL_"+"_"+port.getPortRef()+"_"+port.getLeft();
	}
}
