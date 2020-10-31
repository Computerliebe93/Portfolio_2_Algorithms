import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        int eskildsstrup = 0;
        int haslev = 1;
        int holbæk = 2;
        int jægerspris = 3;
        int kalundborg = 4;
        int korsør = 5;
        int køge = 6;
        int maribo = 7;
        int næstved = 8;
        int ringsted = 9;
        int slagelse = 10;

        int nykøbingF = 11;
        int vordingborg = 12;
        int roskilde = 13;
        int sorø = 14;
        int nakskov = 15;

        MatrixGraph thisGraph = new MatrixGraph(16);
        thisGraph.addEdge(eskildsstrup, maribo, 28);
        thisGraph.addEdge(eskildsstrup, nykøbingF,13);
        thisGraph.addEdge(eskildsstrup, vordingborg,24);
        thisGraph.addEdge(haslev, korsør,60);
        thisGraph.addEdge(haslev, køge,24);
        thisGraph.addEdge(haslev, næstved,25);
        thisGraph.addEdge(haslev, ringsted,19);
        thisGraph.addEdge(haslev, roskilde,47);
        thisGraph.addEdge(haslev, slagelse,48);
        thisGraph.addEdge(haslev, sorø,34);
        thisGraph.addEdge(haslev, vordingborg,40);
        thisGraph.addEdge(holbæk, jægerspris,34);
        thisGraph.addEdge(holbæk, kalundborg,44);
        thisGraph.addEdge(holbæk, korsør, 66);
        thisGraph.addEdge(holbæk, ringsted,36);
        thisGraph.addEdge(holbæk, roskilde,32);
        thisGraph.addEdge(holbæk, slagelse,46);
        thisGraph.addEdge(holbæk, sorø,34);
        thisGraph.addEdge(jægerspris, korsør,95);
        thisGraph.addEdge(jægerspris, køge,58);
        thisGraph.addEdge(jægerspris, ringsted,56);
        thisGraph.addEdge(jægerspris, roskilde, 33);
        thisGraph.addEdge(jægerspris, slagelse, 74);
        thisGraph.addEdge(jægerspris, sorø, 63);
        thisGraph.addEdge(kalundborg, ringsted, 62);
        thisGraph.addEdge(kalundborg, roskilde, 70);
        thisGraph.addEdge(kalundborg, slagelse, 39);
        thisGraph.addEdge(kalundborg, sorø, 51);
        thisGraph.addEdge(korsør, næstved, 45);
        thisGraph.addEdge(korsør, slagelse, 20);
        thisGraph.addEdge(køge, næstved, 45);
        thisGraph.addEdge(køge, ringsted, 28);
        thisGraph.addEdge(køge, roskilde, 25);
        thisGraph.addEdge(køge, vordingborg, 60);
        thisGraph.addEdge(maribo, nakskov, 27);
        thisGraph.addEdge(maribo, nykøbingF, 26);
        thisGraph.addEdge(næstved, roskilde, 57);
        thisGraph.addEdge(næstved, ringsted, 26);
        thisGraph.addEdge(næstved, slagelse, 37);
        thisGraph.addEdge(næstved, sorø, 32);
        thisGraph.addEdge(næstved, vordingborg, 28);
        thisGraph.addEdge(ringsted, roskilde, 31);
        thisGraph.addEdge(ringsted, sorø, 15);
        thisGraph.addEdge(ringsted, vordingborg, 58);
        thisGraph.addEdge(slagelse, sorø, 14);
        thisGraph.MSTPrims();


        AdjacencyListGraph adjGraph = new AdjacencyListGraph();

        Vertex A = new Vertex("Eskildsstrup");
        Vertex B = new Vertex("Haslev");
        Vertex C = new Vertex("Holbæk");
        Vertex D = new Vertex("Jægerspris");
        Vertex E = new Vertex("Kalundborg");
        Vertex F = new Vertex("Korsør");
        Vertex G = new Vertex("Køge");
        Vertex H = new Vertex("Maribo");
        Vertex I = new Vertex("Næstved");
        Vertex J = new Vertex("Ringsted");
        Vertex K = new Vertex("Slagelse");
        Vertex L = new Vertex("Nykøbing F");
        Vertex M = new Vertex("Vordingborg");
        Vertex N = new Vertex("Roskilde");
        Vertex O = new Vertex("sorø");
        Vertex P = new Vertex("Nakskov");

        adjGraph.addVertex(A);
        adjGraph.addVertex(B);
        adjGraph.addVertex(C);
        adjGraph.addVertex(D);
        adjGraph.addVertex(D);
        adjGraph.addVertex(E);
        adjGraph.addVertex(F);
        adjGraph.addVertex(G);
        adjGraph.addVertex(H);
        adjGraph.addVertex(I);
        adjGraph.addVertex(J);
        adjGraph.addVertex(K);
        adjGraph.addVertex(L);
        adjGraph.addVertex(M);
        adjGraph.addVertex(N);
        adjGraph.addVertex(O);
        adjGraph.addVertex(P);


        adjGraph.newEdge(A, H,28);
        adjGraph.newEdge(A, L, 13);
        adjGraph.newEdge(A, M, 24);
        adjGraph.newEdge(B, F, 60);
        adjGraph.newEdge(B, G, 24);
        adjGraph.newEdge(B, I, 25);
        adjGraph.newEdge(B, J, 19);
        adjGraph.newEdge(B, N, 47);
        adjGraph.newEdge(B, K, 48);
        adjGraph.newEdge(B, O, 34);
        adjGraph.newEdge(B, M, 40);
        adjGraph.newEdge(C, D, 34);
        adjGraph.newEdge(C, E, 44);
        adjGraph.newEdge(C, F, 66);
        adjGraph.newEdge(C, J, 36);
        adjGraph.newEdge(C, N, 32);
        adjGraph.newEdge(C, K, 46);
        adjGraph.newEdge(C, O, 34);
        adjGraph.newEdge(D, F, 95);
        adjGraph.newEdge(D, G, 58);
        adjGraph.newEdge(D, J, 56);
        adjGraph.newEdge(D, N, 33);
        adjGraph.newEdge(D, K, 74);
        adjGraph.newEdge(D, O, 63);
        adjGraph.newEdge(E, J, 62);
        adjGraph.newEdge(E, N, 70);
        adjGraph.newEdge(E, K, 39);
        adjGraph.newEdge(E, O, 51);
        adjGraph.newEdge(F, I, 45);
        adjGraph.newEdge(F, K, 20);
        adjGraph.newEdge(G, I, 45);
        adjGraph.newEdge(G, J, 28);
        adjGraph.newEdge(G, N, 25);
        adjGraph.newEdge(G, M, 60);
        adjGraph.newEdge(H, P, 27);
        adjGraph.newEdge(H, L, 26);
        adjGraph.newEdge(I, N, 57);
        adjGraph.newEdge(I, J, 26);
        adjGraph.newEdge(I, K, 37);
        adjGraph.newEdge(I, O, 32);
        adjGraph.newEdge(I, M, 28);
        adjGraph.newEdge(J, N, 31);
        adjGraph.newEdge(J, O, 15);
        adjGraph.newEdge(J, M, 58);
        adjGraph.newEdge(K, O, 14);

        adjGraph.printGraph();


        int[] pred=thisGraph.ShortestPath(0);
        thisGraph.PrintPath(pred, 6);
        //thisGraph.PrintPath(pred, 5);


    // Not working
    }
    PriorityQueue<SmallestItem> theSmallestItem = CreateInitPriorityQueSmallest();
    Iterator<SmallestItem> itrSmallestItem = theSmallestItem.iterator();
        while (itrSmallestItem.hasnext()){
        SmallestItem thisSmallest = itrSmallestItem.next();
        System.out.println("Smallest item: " + thisSmallest.getSmallest());

    }

    public static PriorityQueue<SmallestItem> CreateInitPriorityQueSmallest(){
        PriorityQueue<PriorityQueue> PriorityQue = new PriorityQueue<PriorityQueue>();
        PriorityQue.add(new PriorityQueue(0));
        PriorityQue.add(new PriorityQueue(2147483647));
        PriorityQue.add(new PriorityQueue(28));
        PriorityQue.add(new PriorityQueue(13));
        PriorityQue.add(new PriorityQueue(24));
        PriorityQue.add(new PriorityQueue(27));
        return SmallestItem;
    }

}
