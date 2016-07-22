package de.tum.ei.eda.esl.grip.ipxactRuleTrafoEpsilon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections15.Transformer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.DesignType;
import org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritFactory;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;
import org.spiritconsortium.xml.schema.spirit.spirit.util.spiritResourceFactoryImpl;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.GraphMatcher;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.GraphRewriter;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.Match;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.Rule;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.ModifierNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.PatternNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.engineInterface.RewriterNE;
import de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl.CreatorNEEpsilonImpl;
import de.tum.ei.eda.esl.graphRewriter.engine.engineInterfaceEpsilonImpl.ModifierNEEpsilonImpl;
import de.tum.ei.eda.esl.grip.ipxactJungTrafo.DesignToJungGraph;
import de.tum.ei.eda.esl.grip.ipxactJungTrafo.JungGraphToDesign;
import edu.uci.ics.jung.graph.Graph;

public class TestRuleParser {
	public static void main(String[] args) {
		String hostFileName = TestRuleParser.class.getResource(
				("resource/arch0/System.design.1.0.xml")).getFile();
		String outputFileName = new String("generatedFiles/system_out.xml");
		
		/*
		../data/soc/hw/rules/rule1.1_addSO", 
		"../data/soc/hw/rules/rule2.1_addER",
		"../data/soc/hw/rules/rule3.1_addGR",
		"../data/soc/hw/rules/rule1.2_addSO_existingBus",				
		"../data/soc/hw/rules/rule2.2_addER_existingBus",
		"../data/soc/hw/rules/rule3.2_addGR_existingBus",
		"../data/soc/hw/rules/rule2.3_addER_PP",
		"../data/soc/hw/rules/rule3.3_addGR_PP"
		*/
		//String lhsFileName = new String("../../data/soc/hw/rules/rule1.1_addSO/leftpat/leftpat.design.1.0.xml");
		//String rhsFileName = new String("../../data/soc/hw/rules/rule1.1_addSO/rightpat/rightpat.design.1.0.xml");
		
		//String lhsFileName = new String("../../data/soc/hw/rules/rule1.2_addSO_existingBus/leftpat/leftpat.design.1.0.xml");
		//String rhsFileName = new String("../../data/soc/hw/rules/rule1.2_addSO_existingBus/rightpat/rightpat.design.1.0.xml");
		
		//String lhsFileName = ("../../data/soc/hw/rules/rule2.1_addER/leftpat/leftpat.design.1.0.xml");
		//String rhsFileName = new String("../../data/soc/hw/rules/rule2.1_addER/rightpat/rightpat.design.1.0.xml");
		
		String lhsFileName = TestRuleParser.class.getResource(
				("resource/rules/rule2.1_addER/leftpat/leftpat.design.1.0.xml")).getFile();
		String rhsFileName = TestRuleParser.class.getResource(
				("resource/rules/rule2.1_addER/rightpat/rightpat.design.1.0.xml")).getFile();
		
		//String lhsFileName = TestRuleParser.class.getResource(
		//		("resource/rules/rule2.3_addER_PP/leftpat/leftpat.design.1.0.xml")).getFile();
		//String rhsFileName = TestRuleParser.class.getResource(
		//		("resource/rules/rule2.3_addER_PP/rightpat/rightpat.design.1.0.xml")).getFile();
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new spiritResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(spiritPackage.eNS_URI, spiritPackage.eINSTANCE);
		
		Resource resourceHost = resourceSet.createResource(URI.createURI(hostFileName));
		Resource resourceLhs = resourceSet.createResource(URI.createURI(lhsFileName));
		Resource resourceRhs = resourceSet.createResource(URI.createURI(rhsFileName));
		Resource resourceOut = resourceSet.createResource(URI.createURI(outputFileName));
		
		try {
			resourceHost.load(null);
			resourceLhs.load(null);
			resourceRhs.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		DocumentRoot documentRootHost = (DocumentRoot) resourceHost.getContents().get(0);
		DesignToJungGraph parser = new DesignToJungGraph();
		Graph<EObject, EClass> hostGraph = parser.transformToJung(documentRootHost.getDesign());
		
		DocumentRoot documentRootLhs = (DocumentRoot) resourceLhs.getContents().get(0);
		Graph<PatternNE, PatternNE> lhs = new IpxactToEpsilonLHS().transformToLHSGraph(documentRootLhs.getDesign());
		
		DocumentRoot documentRootRhs = (DocumentRoot) resourceRhs.getContents().get(0);
		Graph<RewriterNE, RewriterNE> rhs = new IpxactToEpsilonRHS().transformToRHSGraph(
				documentRootLhs.getDesign(), documentRootRhs.getDesign());
		
		Rule rule = new Rule();
		rule.setGraphletLhs(lhs);
		rule.setGraphletRhs(rhs);
		
		DisplayGraph<RewriterNE, RewriterNE> displayGraph = new DisplayGraph<RewriterNE, RewriterNE>();
		Transformer<RewriterNE, String> trans = new Transformer<RewriterNE,String>() {
			public String transform(RewriterNE element) {
				return element.getIdent();						
			}
		};
		//displayGraph.displayHostGraph(rhs, null, trans);
		
		System.out.println("running matching...");
		GraphMatcher<EObject, EClass> matcher = new GraphMatcher<EObject, EClass>();
		Set<Match<EObject, EClass>> matches = matcher.matchLHS(hostGraph, rule);
		System.out.println(matches.size()+" matches are found in host graph");
		
		Match<EObject, EClass> match = null;
		for(Iterator<Match<EObject, EClass>> it=matches.iterator(); it.hasNext();) {
			match = it.next();
			//match.printMatch();
		}
		
		//---------------------
		/*
		List<Match<EObject, EClass>> testMatch = new ArrayList<Match<EObject, EClass>>();
		for(Iterator<Match<EObject, EClass>> it=matches.iterator(); it.hasNext();) {
			testMatch.add(it.next());
		}
		for(Iterator<PatternNE> it = lhs.getVertices().iterator(); it.hasNext();) {
			PatternNE node = it.next();
			if(testMatch.get(1).containsPatternNode(node) && testMatch.get(0).containsPatternNode(node)) {
				if(testMatch.get(1).getMatchedNode(node) != testMatch.get(0).getMatchedNode(node)) {
					System.out.println("match 0 is "+testMatch.get(0).getMatchedNode(node)
							+" but match 1 is "+testMatch.get(1).getMatchedNode(node));
				}
			} else {
				System.err.println(node+" is not matched !");
			}
		}
		*/
		
		//--------------------
		GraphRewriter<EObject, EClass> rewriter = new GraphRewriter<EObject, EClass>();
		Graph<EObject, EClass> outputGraph = rewriter.applyRHS(hostGraph, match, rule);
		
		System.out.println("rule is applied ");
		
		DocumentRoot documentRootOut = spiritFactory.eINSTANCE.createDocumentRoot();
		DesignType designOut = new JungGraphToDesign().exportToDesign(outputGraph);
		documentRootOut.setDesign(designOut);
		resourceOut.getContents().add(documentRootOut);
		try {
			resourceOut.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		Graph<EObject, EClass> outputGraph1 = parser.transformToJung(documentRootOut.getDesign());
		
		System.out.println("Finish !");
		
	}
	
	public static void printRHS(Graph<RewriterNE, RewriterNE> graph) {
		for(Iterator<RewriterNE> it=graph.getVertices().iterator(); it.hasNext();) {
			RewriterNE node = it.next();
			if(node instanceof ModifierNEEpsilonImpl) {
				System.out.println("Modifier: "+node.getIdent()+" "+((ModifierNEEpsilonImpl) node).getEolFileName());	
			} else if(node instanceof CreatorNEEpsilonImpl) {
				System.out.println("Creator: "+node.getIdent()+" "+((CreatorNEEpsilonImpl) node).getEolFileName());
			} else {
				System.out.println("Rewriter:"+node);
			}
			
		}
	}
	
	public static void testMatchResult(Graph<PatternNE, PatternNE> lhs, Match<EObject, EClass> match) {
		for(Iterator<PatternNE> it = lhs.getVertices().iterator(); it.hasNext();) {
			PatternNE node = it.next();
			if(!match.containsPatternNode(node)) {
				System.out.println("node is not matched "+node);
			}
		}
		for(Iterator<PatternNE> it = lhs.getEdges().iterator(); it.hasNext();) {
			PatternNE node = it.next();
			if(!match.containsPatternEdge(node)) {
				System.out.println("edge is not matched "+node);
			}
		}
	}
}
