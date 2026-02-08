package Graph;
import java.util.*;

public class List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nymber of vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        int edge = sc.nextInt();

//        int[][] matrix = new int[V+1][V+1];
//
        System.out.print("Enter all edges: ");
//        for(int i = 0; i < edge; i++) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//            matrix[u][v] = 1;
//            matrix[v][u] = 1;
//        }
//        printM(matrix, V+1);

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < V+1; i++) {
            adjList.add(new ArrayList<>());
        }

        for(int i = 0; i < edge; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        printL(adjList);
    }

    public static void printM(int[][] matrix, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printL(ArrayList<ArrayList<Integer>> adjList) {
        for(int i = 0; i < adjList.size(); i++) {
            for(int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
