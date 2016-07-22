package de.tum.ei.eda.esl.graphRewriter.searchTreeExploration;

import java.util.Set;

import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.GraphMatcher;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.GraphRewriter;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.Match;
import de.tum.ei.eda.esl.graphRewriter.engine.engineCore.Rule;
import edu.uci.ics.jung.graph.Graph;

public class RuleExecutorImplByGraphEngine<V, E> implements RuleExecutor<Graph<V, E>, Rule>{

	private GraphRewriter<V, E> rewriter = new GraphRewriter<V, E>();
	private GraphMatcher<V, E> matcher = new GraphMatcher<V, E>();

	public Graph<V, E> execute(Graph<V, E> node, Rule rule) {
		Set<Match<V, E>> matches = matcher.matchLHS(node, rule);
		if(matches.size()==0) {
			return null;
		} else {
			System.out.println(matches.size()+" matches are found !");
			Match<V, E> match = (Match<V, E>) matches.toArray()[0];
			Graph<V, E> output = rewriter.applyRHS(node, match, rule);
			return output;
		}
	}


}
