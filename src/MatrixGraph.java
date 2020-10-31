import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

public class MatrixGraph {
    int[][] matrixEdgeGraph;
    int[][] matrixWeightGraph;

    MatrixGraph(int vertices) {
        matrixEdgeGraph = new int[vertices][vertices];
        matrixWeightGraph = new int[vertices][vertices];
    }

    public void addEdge(int from, int to, int weight) {
        matrixEdgeGraph[from][to] = 1;
        matrixWeightGraph[from][to] = weight;
    }

    public void printGraph() {
        for (int fromI = 0; fromI < matrixEdgeGraph.length; fromI++) {
            System.out.println("Edges from vertex " + fromI);
            for (int toJ = 0; toJ < matrixEdgeGraph.length; toJ++) {
                if (matrixEdgeGraph[fromI][toJ] == 1) {
                    System.out.print(" To " + toJ);
                    System.out.println(" weight " + matrixWeightGraph[fromI][toJ]);
                }
            }
            System.out.println(" ");
        }
    }

    public void MSTPrims() {
        int[] distance = new int[matrixEdgeGraph.length];
        int[] predecessor = new int[matrixEdgeGraph.length];
        int[] visited = new int[matrixEdgeGraph.length];
        PriorityQueue<Pair> Q = new PriorityQueue<Pair>();
        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(predecessor, -1);
        Arrays.fill(visited, 0);
        if (matrixEdgeGraph.length > 0) {
            distance[0] = 0;
            Q.offer(new Pair(0, 0));
        }
        int counter = 0;
        int MST = 0;
        while (!Q.isEmpty() && counter < matrixWeightGraph.length) {
            Pair u = Q.poll();
            if (visited[u.index] !=1) {
                for (int v = 0; v < matrixEdgeGraph.length; v++) {
                    if (matrixEdgeGraph[u.index][v] == 1 && matrixWeightGraph[u.index][v] < distance[v]) {
                        distance[v] = matrixWeightGraph[u.index][v];
                        predecessor[v] = u.index;
                        Q.offer(new Pair(distance[v], v));
                    }
                }
                visited[u.index] = 1;
                counter++;
                MST+=distance[u.index];
            }
        }
        System.out.println("Minimum spanning tree distance " + MST);
        System.out.println("Total price: " + MST * 1000000 + " DKK");
        PrintMST(predecessor, distance);
    }
    public void PrintMST(int[] pred, int[] dist){
        for (int i = 0; i < matrixEdgeGraph.length; i++){
            System.out.println(i + " parent " + pred[i] + " Edge weight " + dist[i]);
        }
        System.out.println();
    }
    public int[] ShortestPath (int source){
        int[] distance = new int[matrixEdgeGraph.length];
        int[] predecessor = new int[matrixEdgeGraph.length];
        int[] visited = new int[matrixEdgeGraph.length];
        PriorityQueue<Pair> Q = new PriorityQueue<Pair>();
        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(predecessor, -1);
        Arrays.fill(visited, 0);
        if (matrixEdgeGraph.length > 0) {
            distance[0] = 0;
            Q.offer(new Pair(0, 0));
        }

        int counter = 0;
        while (!Q.isEmpty() && counter < matrixEdgeGraph.length) {
            Pair i = Q.poll();
            for (int J = 0; J < matrixEdgeGraph.length; J++) {
                if (matrixEdgeGraph[i.index][J] == 1 && visited[J] != 1) {
                    if (distance[i.index] + matrixWeightGraph[i.index][J] < distance[J]) {
                        distance[J] = distance[i.index] + matrixWeightGraph[i.index][J];
                        predecessor[J] = i.index;
                        Q.offer(new Pair(distance[J], J));
                    }
                }
            }
            counter++;
            visited[i.index] = 1;
        }
        return predecessor;
    }

    public void PrintPath (int[] pred, int target){
        Stack<Integer> reversePath = new Stack<Integer>();
        int current = target;
        while (current != -1){
            reversePath.push(current);
            current=pred[current];
        }
        int pathLength = 0;
        current = reversePath.pop();
        while (!reversePath.isEmpty()){
            int tovertex = reversePath.pop();
            System.out.println("From " + current + " to " + tovertex + " distance " + matrixWeightGraph[current][tovertex]);
            pathLength += matrixWeightGraph [current][tovertex];
            current = tovertex;
        }
        System.out.println("Total distance " + pathLength);
    }
}
    class Pair implements Comparable<Pair> {
        Integer distance;
        Integer index;



        public Pair(Integer distance, Integer vertex) {
            this.distance = distance;
            this.index = vertex;
        }

        @Override
        public int compareTo(Pair o) {
            return this.distance.compareTo(o.distance);
        }
    }

