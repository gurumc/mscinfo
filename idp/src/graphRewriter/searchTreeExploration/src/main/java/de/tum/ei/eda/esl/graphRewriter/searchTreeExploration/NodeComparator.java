package de.tum.ei.eda.esl.graphRewriter.searchTreeExploration;

public interface NodeComparator <V> {
	/* 
	 * Method to compare two graphs
	 */
	boolean compare(V node1, V node2);
	
	/*
	 * Method to match edge and vertices list
	 */
	boolean matcheEdgeList(V node1, V node2);
}
