public class Main{

    public static void main(String[] args){

        AStarSearch starSearch = new AStarSearch();

        Vertex vertex0 = new Vertex("a", 1);
        Vertex vertex1 = new Vertex("b", 1);
        Vertex vertex2 = new Vertex("c", 1);

        vertex0.addAdjacencies(new Edge(vertex2,1));
        vertex0.addAdjacencies(new Edge(vertex1,1));
        vertex1.addAdjacencies(new Edge(vertex2,1));
        starSearch.search(vertex0, vertex2);
        System.out.println(starSearch.reconstructPath(vertex2));

        Vertex vertexA = new Vertex("a",5);
        Vertex vertexB = new Vertex("b",7);
        Vertex vertexC = new Vertex("c",3);
        Vertex vertexD = new Vertex("d",4);
        Vertex vertexE = new Vertex("e",6);
        Vertex vertexF = new Vertex("f",5);
        Vertex vertexG = new Vertex("g",6);
        Vertex vertexH = new Vertex("h",20);

        vertexA.addAdjacencies(new Edge(5, vertexB));
        vertexA.addAdjacencies(new Edge(9, vertexC));
        vertexA.addAdjacencies(new Edge(6, vertexE));

        vertexB.addAdjacencies(new Edge(3, vertexC));
        vertexB.addAdjacencies(new Edge(9, vertexH));

        vertexC.addAdjacencies(new Edge(2, vertexB));
        vertexC.addAdjacencies(new Edge(1, vertexD));

        vertexD.addAdjacencies(new Edge(5, vertexH));
        vertexD.addAdjacencies(new Edge(7, vertexG));


        vertexE.addAdjacencies(new Edge(2, vertexD));
        vertexE.addAdjacencies(new Edge(2, vertexF));

        vertexF.addAdjacencies(new Edge(7, vertexH));

        vertexG.addAdjacencies(new Edge(2, vertexE));

        System.out.println(starSearch.search(vertexA, vertexH));


    }

}



