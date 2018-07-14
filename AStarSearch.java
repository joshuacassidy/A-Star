import java.util.*;

public class AStarSearch {

    public String search(Vertex start, Vertex target) {
        List<Vertex> explored = new ArrayList<>();
        PriorityQueue<Vertex> openSet = new PriorityQueue<>();

        start.setGScore(0);
        openSet.add(start);

        while ((!openSet.isEmpty())) {
            Vertex current = openSet.poll();
            explored.add(current);

            if (current.getName().equals(target.getName())) {
                return reconstructPath(target);
            } else {
                for (Edge e : current.getAdjacencies()) {
                    Vertex child = e.getTarget();
                    double tempGScores = current.getGScore() + e.getCost();
                    double tempFScores = tempGScores + child.getHScores();

                    if (!(explored.contains(child) && tempFScores >= child.getFScores()) &&
                            ((!openSet.contains(child)) || (tempFScores < child.getFScores()))) {
                        child.setPredecessor(current);
                        child.setGScore(tempGScores);
                        child.setFScores(tempFScores);

                        if (!openSet.contains(child)) {
                            openSet.add(child);
                        }

                    }

                }
            }
        }

        return "No path found from Vertex " + start + " to Vertex " + target;

    }


    public String reconstructPath(Vertex target) {
        List<Vertex> path = new ArrayList<>();

        for (Vertex vertex = target; vertex != null; vertex = vertex.getPredecessor()) {
            path.add(vertex);
        }

        Collections.reverse(path);

        return path.toString();
    }

}
