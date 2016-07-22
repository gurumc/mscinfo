package org.de.tum.ei.eda.esl.graphRewriter.isomorphism;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import edu.uci.ics.jung.graph.Graph;

public interface IsomorphismTester {

	/*
	 * Return true if the graphs are Isomorphic
	 */
	boolean areIsomorphic(Graph<EObject, EClass> g1, Graph<EObject, EClass> g2);

}
