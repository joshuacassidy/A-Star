import java.util.ArrayList;

public class Vertex implements Comparable<Vertex> {

    private final String name;
    private double gScore;
    private final double hScores;
    private double fScores = 0;
    private ArrayList<Edge> adjacencies;
    private Vertex predecessor;

    public Vertex(String name, double hScores){
        this.name = name;
        this.hScores = hScores;
        adjacencies = new ArrayList<>();
    }

    public String toString(){
        return name;
    }

    public void addAdjacencies(Edge edge) {
        adjacencies.add(edge);
    }

    public String getName() {
        return name;
    }

    public double getGScore() {
        return gScore;
    }

    public void setGScore(double gScore) {
        this.gScore = gScore;
    }

    public double getHScores() {
        return hScores;
    }

    public double getFScores() {
        return fScores;
    }

    public void setFScores(double fScores) {
        this.fScores = fScores;
    }

    public ArrayList<Edge> getAdjacencies() {
        return adjacencies;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public int compareTo(Vertex vertex){
        if(fScores > vertex.fScores){
            return 1;
        } else if (fScores < vertex.fScores){
            return -1;
        } else{
            return 0;
        }
    }


}