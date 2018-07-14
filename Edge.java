public class Edge{
    private final double cost;
    private final Vertex target;

    public Edge(Vertex target, double cost){
        this.target = target;
        this.cost = cost;
    }

    public Edge(int cost, Vertex target){
        this.target = target;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public Vertex getTarget() {
        return target;
    }
}