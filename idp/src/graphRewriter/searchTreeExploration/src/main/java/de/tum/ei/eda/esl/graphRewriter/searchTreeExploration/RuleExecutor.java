package de.tum.ei.eda.esl.graphRewriter.searchTreeExploration;

public interface RuleExecutor<V, E> {
	public V execute(V node, E rule);
}
