package de.tum.ei.eda.esl.graphRewriter.testGraphJavaClass;


public class Edge {
private String name;

public void setName(String value) {
   this.name = value;
}

public String getName() {
   return this.name;
}

private EdgeViewType type;

public void setType(EdgeViewType value) {
   this.type = value;
}

public EdgeViewType getType() {
   return this.type;
}

@Override
public String toString() {
	if(this.type.equals(EdgeViewType.dashline)) {
		return String.valueOf("dashline");
	} else if(this.type.equals(EdgeViewType.solidline)) {
		return String.valueOf("solidline");
	} else {
		return String.valueOf("unknown");
	}
}

}
