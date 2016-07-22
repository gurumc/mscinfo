package de.tum.ei.eda.esl.grip.ipxactRuleTrafoEpsilon;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.Interface;
import org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritFactory;

import edu.uci.ics.jung.graph.Graph;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl.PatternNEEpsilonImpl;

public class JungNodestoPatternNE {

	private final String componentInstanceTemplate = "freemarkerTemplates/validation/componentInstanceEvl.ftl";
	private final String busInterfaceTemplate = "freemarkerTemplates/validation/busInterfaceEvl.ftl";
	private final String externalAdHocPortTemplate = "freemarkerTemplates/validation/externalAdHocPortEvl.ftl";
	private final String internalAdHocPortTemplate = "freemarkerTemplates/validation/internalAdHocPortEvl.ftl";
	
	// private final String emptyEvl = IpxactToEpsilonLHS.class.getResource("evls/any.evl").getFile();
	private final String emptyEvl = "generatedFiles/any.evl";
	private IpxactToEpsilonLHS ipxactToEpsilonLHS = new IpxactToEpsilonLHS();
	
	File evlFolder = null;
	Graph<EObject, EClass> archGraph = null;
	
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
	
	
	public Map<EObject, PatternNE> transformToPatterNE(Graph<EObject,EClass> jungGraph)
	{
		Map<EObject, PatternNE> eobjectToPatternNE= new HashMap<EObject, PatternNE>();
		this.archGraph = jungGraph;
		evlFolder = new File("generatedFiles/"+"esm"+"Evls/");
		
		if(!evlFolder.exists()) {
			evlFolder.mkdirs();
		}
		
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
				eobjectToPatternNE.put(vertex, node);
			}
			else if(vertex instanceof BusInterfaceType)
			{
				ComponentInstanceType component = getNeighborComponentInstance(vertex);
				//BusInterfaceType oppositePort = getNeighborBusInterface(vertex);
				Interface interface1 = spiritFactory.eINSTANCE.createInterface();
				interface1.setBusRef(((BusInterfaceType) vertex).getName());
				interface1.setComponentRef(component.getInstanceName());
				PatternNE node = addNodeFromBusInterface(interface1);
				
//				BusInterfaceType busInterface = (BusInterfaceType) vertex;
//				String evlName = new String();
//				evlName =evlFolder.getPath()+"/"+ busInterface.getName()+".evl"; //TODO change the name
//				ipxactToEpsilonLHS.generateEvlWithFreemarker(busInterface, busInterfaceTemplate, evlName);
//				PatternNEEpsilonImpl node = new PatternNEEpsilonImpl();
//				node.setIdent(busInterface.getName());
//				node.setEvlFileName(evlName);
				eobjectToPatternNE.put(vertex, node);
			}
			else if (vertex instanceof EClass){
				String identi = ((EClass) vertex).getName();
				PatternNEEpsilonImpl node = new PatternNEEpsilonImpl();
				node.setIdent(identi);
				node.setEvlFileName(emptyEvl);
				eobjectToPatternNE.put(vertex, node);
			}
			else if(vertex instanceof ExternalPortReferenceType){
				//ExternalPortReferenceType port = createExternalPortReferenceFromNode((ExternalPortReferenceType) vertex);
				PatternNE node = addNodeFromPortReference((ExternalPortReferenceType) vertex);
				eobjectToPatternNE.put(vertex, node);
			}
			else if(vertex instanceof InternalPortReferenceType){
				//InternalPortReferenceType port = createInternalPortReferenceFromNode((InternalPortReferenceType) vertex);;
				PatternNE node = addNodeFromPortReference((InternalPortReferenceType)vertex);
				eobjectToPatternNE.put(vertex, node);
			}
		}
		
		return eobjectToPatternNE;	
	}
	

//	private PatternNE addNodeFromPortReference(InternalPortReferenceType port) {		
//		String evlName = new String();
//		evlName =evlFolder.getPath()+"/"+port.getComponentRef()+"_"+port.getPortRef()+".evl";
//		ipxactToEpsilonLHS.generateEvlWithFreemarker(port, internalAdHocPortTemplate, evlName);
//		PatternNEEpsilonImpl node = new PatternNEEpsilonImpl();
//		node.setIdent(IdentifierFactory.nodeInternalPort(port));
//		node.setEvlFileName(evlName);
//		return node;
//	}
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
	
	private PatternNE addNodeFromBusInterface(Interface busInterface) {
		String evlName = new String();
		evlName =evlFolder.getPath()+"/"+busInterface.getComponentRef()+"_"+busInterface.getBusRef()+".evl";
		ipxactToEpsilonLHS.generateEvlWithFreemarker(busInterface, busInterfaceTemplate, evlName);
		PatternNEEpsilonImpl node = new PatternNEEpsilonImpl();
		node.setIdent(IdentifierFactory.nodeInterface(busInterface));
		node.setEvlFileName(evlName);
		return node;
	}
	
	private PatternNE addNodeFromPortReference(ExternalPortReferenceType port) {
		String evlName = new String();
		evlName =evlFolder.getPath()+"/"+"IO_"+((ExternalPortReferenceType) port).getPortRef()+".evl";
		ipxactToEpsilonLHS.generateEvlWithFreemarker(port, externalAdHocPortTemplate, evlName);
		PatternNEEpsilonImpl node = new PatternNEEpsilonImpl();
		node.setIdent(IdentifierFactory.nodeExternalPort(port));
		node.setEvlFileName(evlName);
		return node;
	}

//	private ExternalPortReferenceType createExternalPortReferenceFromNode(ExternalPortReferenceType node) {
//		ExternalPortReferenceType newPort = spiritFactory.eINSTANCE.createExternalPortReferenceType();
//		newPort.setPortRef(((ExternalPortReferenceType) node).getPortRef());
//		newPort.setLeft(((ExternalPortReferenceType) node).getLeft());
//		newPort.setRight(((ExternalPortReferenceType) node).getRight());
//		return newPort;
//	}
//	
	private PatternNE addNodeFromPortReference(InternalPortReferenceType vertex) {
		ComponentInstanceType connectedComponent = getNeighborComponentInstance(vertex);
		if(connectedComponent == null) {
			return null;
		}
		String evlName = new String();
		evlName =evlFolder.getPath()+"/"+connectedComponent.getInstanceName()+"_"+vertex.getPortRef()+".evl";
		ipxactToEpsilonLHS.generateEvlWithFreemarker(vertex, internalAdHocPortTemplate, evlName);
		PatternNEEpsilonImpl node = new PatternNEEpsilonImpl();
		node.setIdent(IdentifierFactory.nodeInternalPort(vertex));
		node.setEvlFileName(evlName);
		return node;
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
}
