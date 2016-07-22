package de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass;


public class ShapedNode extends Node {
private float size;

public void setSize(float value) {
   this.size = value;
}

public float getSize() {
   return this.size;
}

private Shape shape;

public void setShape(Shape value) {
   this.shape = value;
}

public Shape getShape() {
   return this.shape;
}

@Override
public String toString() {
	return this.getName()+":"+this.getShape()+","+this.getSize();
   }
}
