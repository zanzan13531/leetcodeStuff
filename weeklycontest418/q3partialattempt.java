import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static class Node {
        public List<Integer> neighbors;
        public List<Integer> usedNeigh;
    }
    public int[][] constructGridLayout(int n, int[][] edges) {
        int[] edgeCount = new int[n]; // each index represents the number of edges at node n
        Node[] nodes = new Node[n];
        for (int i = 0 ; i < n; i++) {
            nodes[i] = new Node();
            nodes[i].neighbors = new ArrayList<Integer>();
            nodes[i].usedNeigh = new ArrayList<Integer>();
        }
        for (int i = 0; i < edges.length; i++) {
            int s = edges[i][0];
            int d = edges[i][0];
            edgeCount[s]++;
            edgeCount[d]++;
            nodes[s].neighbors.add(d);
            nodes[d].neighbors.add(s);
        }
        ArrayList<Integer> oneEdges = new ArrayList<Integer>();
        ArrayList<Integer> twoEdges = new ArrayList<Integer>();
        ArrayList<Integer> threeEdges = new ArrayList<Integer>();
        ArrayList<Integer> fourEdges = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int edgesC = edgeCount[i];
            if (edgesC == 1) {
                oneEdges.add(i);
            } else if (edgesC == 2) {
                twoEdges.add(i);
            } else if (edgesC == 3) {
                threeEdges.add(i);
            } else if (edgesC == 4) {
                fourEdges.add(i);
            } else {
                System.out.println("error");
            }
        }
        if (oneEdges.size() > 0) {
            int[][] result = new int[1][n];
            int cur = oneEdges.get(i);
                    
        }
    }
} {
    
}
