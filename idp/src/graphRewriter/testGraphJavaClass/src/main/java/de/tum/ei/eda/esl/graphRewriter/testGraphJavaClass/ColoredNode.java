package de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass;


public class ColoredNode extends Node {
private Color color;

public void setColor(Color value) {
   this.color = value;
}

public Color getColor() {
   return this.color;
}

@Override
public String toString() {
	return this.getName()+":"+this.getColor();
}
}
