package de.tum.ei.eda.esl.graphRewriter.engine.engineCore;

public class Pair <L, R>  {
	private R right;
	
	public void setRight(R value) {
	   this.right = value;
	}
	
	public R getRight() {
	   return this.right;
	}
	
	private L left;
	
	public void setLeft(L value) {
	   this.left = value;
	}
	
	public L getLeft() {
	   return this.left;
	}

}
