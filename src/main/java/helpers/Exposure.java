package helpers;

import java.util.List;

public class Exposure {

    private Edge[] edges;
    private int numNodes;

    public Exposure() {
    }

    public Edge[] getEdges() {
        return edges;
    }

    public void setEdges(Edge[] edges) {
        this.edges = edges;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }
}
