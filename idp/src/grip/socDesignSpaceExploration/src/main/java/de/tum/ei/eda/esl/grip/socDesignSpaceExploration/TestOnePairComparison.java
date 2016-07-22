package de.tum.ei.eda.esl.grip.socDesignSpaceExploration;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.de.tum.ei.eda.esl.graphRewriter.isomorphism.IsomorphismTester;
import org.de.tum.ei.eda.esl.graphRewriter.isomorphism.VF2IsomorphismTester;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit.spirit.DesignType;
import org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritFactory;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;
import org.spiritconsortium.xml.schema.spirit.spirit.util.spiritResourceFactoryImpl;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.Rule;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.RewriterNE;
import de.tum.ei.eda.esl.graphRewriter.searchTreeExploration.GraphComparator;
import de.tum.ei.eda.esl.graphRewriter.searchTreeExploration.NodeComparator;
import de.tum.ei.eda.esl.graphRewriter.searchTreeExploration.RuleExecutor;
import de.tum.ei.eda.esl.graphRewriter.searchTreeExploration.RuleExecutorImplByGraphEngine;
import de.tum.ei.eda.esl.graphRewriter.searchTreeExploration.RuleTree;
import de.tum.ei.eda.esl.grip.ipxactJungTrafo.DesignToJungGraph;
import de.tum.ei.eda.esl.grip.ipxactJungTrafo.JungGraphToDesign;
import de.tum.ei.eda.esl.grip.ipxactRuleTrafoEpsilon.IpxactToEpsilonLHS;
import de.tum.ei.eda.esl.grip.ipxactRuleTrafoEpsilon.IpxactToEpsilonRHS;
import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.graph.Graph;

public class TestOnePairComparison {
public static void main(String[] args) {
	
	String hostFileName = TestDesignSpaceTree.class.getResource("inputdes/arch0/System.design.1.0.xml").getFile();
	String outputFileName = new String("system_out.xml");
	
	String lhsFileName1 = TestDesignSpaceTree.class.getResource("rules/rule1.1_addSO/leftpat/leftpat.design.1.0.xml").getFile();
	String rhsFileName1 = TestDesignSpaceTree.class.getResource("rules/rule1.1_addSO/rightpat/rightpat.design.1.0.xml").getFile();
	
	String lhsFileName2 = TestDesignSpaceTree.class.getResource("rules/rule1.2_addSO_existingBus/leftpat/leftpat.design.1.0.xml").getFile();
	String rhsFileName2 = TestDesignSpaceTree.class.getResource("rules/rule1.2_addSO_existingBus/rightpat/rightpat.design.1.0.xml").getFile();
	
	String lhsFileName3 = TestDesignSpaceTree.class.getResource("rules/rule2.1_addER/leftpat/leftpat.design.1.0.xml").getFile();
	String rhsFileName3 = TestDesignSpaceTree.class.getResource("rules/rule2.1_addER/rightpat/rightpat.design.1.0.xml").getFile();
	
	String lhsFileName4 = TestDesignSpaceTree.class.getResource("rules/rule2.3_addER_PP/leftpat/leftpat.design.1.0.xml").getFile();
	String rhsFileName4 = TestDesignSpaceTree.class.getResource("rules/rule2.3_addER_PP/rightpat/rightpat.design.1.0.xml").getFile();
	
	ResourceSet resourceSet = new ResourceSetImpl();
	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new spiritResourceFactoryImpl());
	resourceSet.getPackageRegistry().put(spiritPackage.eNS_URI, spiritPackage.eINSTANCE);
	
	Resource resourceHost = resourceSet.createResource(URI.createURI(hostFileName));
	Resource resourceOut = resourceSet.createResource(URI.createURI(outputFileName));
	
	Resource resourceLhs1 = resourceSet.createResource(URI.createURI(lhsFileName1));
	Resource resourceRhs1 = resourceSet.createResource(URI.createURI(rhsFileName1));
	Resource resourceLhs2 = resourceSet.createResource(URI.createURI(lhsFileName2));
	Resource resourceRhs2 = resourceSet.createResource(URI.createURI(rhsFileName2));
	Resource resourceLhs3 = resourceSet.createResource(URI.createURI(lhsFileName3));
	Resource resourceRhs3 = resourceSet.createResource(URI.createURI(rhsFileName3));
	Resource resourceLhs4 = resourceSet.createResource(URI.createURI(lhsFileName4));
	Resource resourceRhs4 = resourceSet.createResource(URI.createURI(rhsFileName4));
	
	try {
		resourceHost.load(null);
		resourceLhs1.load(null);
		resourceRhs1.load(null);
		resourceLhs2.load(null);
		resourceRhs2.load(null);
		resourceLhs3.load(null);
		resourceRhs3.load(null);
		resourceLhs4.load(null);
		resourceRhs4.load(null);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	DocumentRoot documentRootHost = (DocumentRoot) resourceHost.getContents().get(0);
	DesignToJungGraph parser = new DesignToJungGraph();
	Graph<EObject, EClass> hostGraph = parser.transformToJung(documentRootHost.getDesign());
	
	DocumentRoot documentRootLhs1 = (DocumentRoot) resourceLhs1.getContents().get(0);
	Graph<PatternNE, PatternNE> lhs1 = new IpxactToEpsilonLHS().transformToLHSGraph(documentRootLhs1.getDesign());
	
	DocumentRoot documentRootLhs2 = (DocumentRoot) resourceLhs2.getContents().get(0);
	Graph<PatternNE, PatternNE> lhs2 = new IpxactToEpsilonLHS().transformToLHSGraph(documentRootLhs2.getDesign());
	
	DocumentRoot documentRootLhs3 = (DocumentRoot) resourceLhs3.getContents().get(0);
	Graph<PatternNE, PatternNE> lhs3 = new IpxactToEpsilonLHS().transformToLHSGraph(documentRootLhs3.getDesign());
	
	DocumentRoot documentRootLhs4 = (DocumentRoot) resourceLhs4.getContents().get(0);
	Graph<PatternNE, PatternNE> lhs4 = new IpxactToEpsilonLHS().transformToLHSGraph(documentRootLhs4.getDesign());
	
	DocumentRoot documentRootRhs1 = (DocumentRoot) resourceRhs1.getContents().get(0);
	Graph<RewriterNE, RewriterNE> rhs1 = new IpxactToEpsilonRHS().transformToRHSGraph(
			documentRootLhs1.getDesign(), documentRootRhs1.getDesign());
	
	DocumentRoot documentRootRhs2 = (DocumentRoot) resourceRhs2.getContents().get(0);
	Graph<RewriterNE, RewriterNE> rhs2 = new IpxactToEpsilonRHS().transformToRHSGraph(
			documentRootLhs2.getDesign(), documentRootRhs2.getDesign());
	
	DocumentRoot documentRootRhs3 = (DocumentRoot) resourceRhs3.getContents().get(0);
	Graph<RewriterNE, RewriterNE> rhs3 = new IpxactToEpsilonRHS().transformToRHSGraph(
			documentRootLhs3.getDesign(), documentRootRhs3.getDesign());
	
	DocumentRoot documentRootRhs4 = (DocumentRoot) resourceRhs4.getContents().get(0);
	Graph<RewriterNE, RewriterNE> rhs4 = new IpxactToEpsilonRHS().transformToRHSGraph(
			documentRootLhs4.getDesign(), documentRootRhs4.getDesign());
	
	
	Rule rule1 = new Rule();
	rule1.setName(lhsFileName1);
	rule1.setGraphletLhs(lhs1);
	rule1.setGraphletRhs(rhs1);
	
	Rule rule2 = new Rule();
	rule2.setName(lhsFileName2);
	rule2.setGraphletLhs(lhs2);
	rule2.setGraphletRhs(rhs2);
	
	Rule rule3 = new Rule();
	rule3.setName(lhsFileName3);
	rule3.setGraphletLhs(lhs3);
	rule3.setGraphletRhs(rhs3);
	
	Rule rule4 = new Rule();
	rule4.setName(lhsFileName4);
	rule4.setGraphletLhs(lhs4);
	rule4.setGraphletRhs(rhs4);

	DisplayGraph disp = new DisplayGraph();
//	disp.displayPatternGraph(rule1.getGraphletLhs(), "rule1 lhs");
//	disp.displayRewriterGraph(rule1.getGraphletRhs(), "rule1 rhs");
//
//	disp.displayPatternGraph(rule2.getGraphletLhs(), "rule2 lhs");
//	disp.displayRewriterGraph(rule2.getGraphletRhs(), "rule2 rhs");
//	
	
	RuleExecutor<Graph<EObject, EClass>, Rule> ruleExecutor = 
			new RuleExecutorImplByGraphEngine<EObject, EClass>();
	
	Graph<EObject, EClass> graph1 = ruleExecutor.execute(hostGraph, rule1);
	//validateIPxactDesign(graph1);
	Graph<EObject, EClass> graph2 = ruleExecutor.execute(hostGraph, rule3);
	Graph<EObject, EClass> graph1_2 = ruleExecutor.execute(graph1, rule3);
//	validateIPxactDesign(graph1_2);
	Graph<EObject, EClass> graph2_1 = ruleExecutor.execute(graph2, rule1);
//	validateIPxactDesign(graph2_1);
	
	if(graph1_2.getVertexCount() != graph2_1.getVertexCount()) {
		System.out.println("source vertex ");
		for(EObject vertex: graph1_2.getVertices())
		{
			if(vertex instanceof ComponentInstanceType) {
			System.out.println(((ComponentInstanceType) vertex).getInstanceName());
			}
			
		}
		
		System.out.println("target vertex ");
		for(EObject vertex: graph2_1.getVertices())
		{
			if(vertex instanceof ComponentInstanceType) {
				System.out.println(((ComponentInstanceType) vertex).getInstanceName());
			}
			
		}
	} else{
		System.out.println("vertex number are same");
	}
	
	GraphComparator<EObject, EClass> comp = new GraphComparator<EObject, EClass>();
//	
	IsomorphismTester vf2 = new VF2IsomorphismTester();
	long st = System.nanoTime();
//	boolean x = vf2.areIsomorphic(graph1_2, graph2_1);
//	System.out.println(System.nanoTime() - st);
	if(vf2.areIsomorphic(graph1_2, graph2_1))
	{
		System.out.println("VF2: match found");
		System.out.println("time for comparison" + (System.nanoTime() -st));
	}
	else
	{
		System.out.println("VF2:no match found");	
		System.out.println("time for comparison" + (System.nanoTime() -st));
	}
	
	if(vf2.areIsomorphic(graph1_2, graph2_1))
	{
		System.out.println("VF2: match found");
	}
	else
	{
		System.out.println("VF2:no match found");	
	}
	
	if(vf2.areIsomorphic(graph1_2, graph1_2))
	{
		System.out.println("VF2: match found");
	}
	else
	{
		System.out.println("VF2:no match found");	
	}
	
//	if(comp.compare(graph1_2, graph1_2))
//	{
//		System.out.println("match found");
//	}
//	else
//	{
//		System.out.println("no match found");
//	}
	
		
	System.out.println("Finish !");
}

private static Graph<EObject, EClass> validateIPxactDesign(Graph<EObject, EClass> graph)
{

	HashSet<String> hset = new HashSet<String>();
	for(EObject vertex:graph.getVertices())
	{
		if(vertex instanceof ComponentInstanceType)
		{
			String oldValue = ((ComponentInstanceType) vertex).getInstanceName();
			if(hset.contains(oldValue))
			{
				oldValue = oldValue+"_2";
				while(hset.contains(oldValue))
				{
					oldValue = oldValue+"_2";	
				}
				((ComponentInstanceType) vertex).setInstanceName(oldValue);
			}
			hset.add(oldValue);
		}

	}
	return graph;
}


}
