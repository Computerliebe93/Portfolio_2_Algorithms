import java.util.ArrayList;

public class AdjacencyListGraph {
    private ArrayList<Vertex> vertices;

    public AdjacencyListGraph(){
        vertices = new ArrayList<Vertex>();
    }
    public void addVertex(Vertex v){
        vertices.add(v);
    }
    public void newEdge(Vertex from, Vertex to, Integer dist){
        if (! (vertices.contains(from) && vertices.contains(to)))
        {
            System.out.println("Vertex not found");
            return;
        }
        Edge newEdge = new Edge(from, to, dist);

    }

    public void printGraph(){
        Vertex currentV;
        for (int i = 0; i < vertices.size(); i++){
            currentV = vertices.get(i);
            System.out.println("Edges from Vertex: " + currentV.getName());
            for (int j= 0; j < currentV.getOutEdges().size(); j++)
            {
                Edge currentE = currentV.getOutEdges().get(j);
                System.out.println("To " + currentE.getToVertex().getName() + " weight " + currentE.getWeight());
            }
            System.out.println(" ");
        }
    }


}

class Vertex implements Comparable<Vertex>{
    private String Name;
    private ArrayList<Edge> outEdges;
    Integer distance = Integer.MAX_VALUE;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Edge> getOutEdges() {
        return outEdges;
    }

    public void setOutEdges(ArrayList<Edge> outEdges) {
        this.outEdges = outEdges;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Vertex(String id)
    {
        this.Name = id;
        outEdges = new ArrayList<>();
    }
    public void addOutEdge(Edge outEdge){
        outEdges.add(outEdge);
    }

    @Override
    public int compareTo(Vertex o) {
        if (this.distance < o.distance)
            return -1;
        if (this.distance > o.distance)
            return 1;


        return 0;
    }
}

class Edge {
    private Vertex fromVertex;
    private Vertex toVertex;

    public Vertex getFromVertex() {
        return fromVertex;
    }

    public void setFromVertex(Vertex fromVertex) {
        this.fromVertex = fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public void setToVertex(Vertex toVertex) {
        this.toVertex = toVertex;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    private Integer weight;
    public Edge(Vertex from, Vertex to, Integer cost){
        fromVertex = from;
        toVertex = to;
        weight = cost;
        from.addOutEdge(this);
    }
}
