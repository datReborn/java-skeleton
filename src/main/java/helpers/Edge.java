package helpers;

public class Edge {

	private int edgeA;
	private int edgeB;

	public Edge() {
	}

	public Edge(int[] edges) {
		super();
		this.edgeA = edges[0];
		this.edgeB = edges[1];
	}
	
	public int getEdgeA() {
		return edgeA;
	}
	
	public void setEdgeA(int edgeA) {
		this.edgeA = edgeA;
	}
	
	public int getEdgeB() {
		return edgeB;
	}
	
	public void setEdgeB(int edgeB) {
		this.edgeB = edgeB;
	}
	
	
	
}
