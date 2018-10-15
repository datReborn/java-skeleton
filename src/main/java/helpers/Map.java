package helpers;

public class Map {

    private int target;
    private int numServers;
    private int[][] arcs;

    public Map() {
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getNumServers() {
        return numServers;
    }

    public void setNumServers(int numServers) {
        this.numServers = numServers;
    }

    public int[][] getArcs() {
        return arcs;
    }

    public void setArcs(int[][] arcs) {
        this.arcs = arcs;
    }
}
