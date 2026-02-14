package Graph;
//
//import java.util.*;
//
//public class GameRoute{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//
//        int count[] = new int[n + 1];
//        int indegree[] = new int[n + 1];
//
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        for (int i = 0; i < n + 1; i++) {
//            list.add(new ArrayList<>());
//        }
//
//        for (int i = 0; i < m; i++) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//            list.get(u).add(v);
//            indegree[v]++;
//        }
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(1);
//        count[1] = 1;
//
//        while (!q.isEmpty()) {
//            int node = q.poll();
//
//            for (int neighbour : list.get(node)) {
//                count[neighbour] = count[node] + count[neighbour];
//                indegree[neighbour]--;
//                if (indegree[neighbour] == 0) {
//                    q.offer(neighbour);
//                }
//            }
//        }
//        System.out.println(count[n]);
//    }
//}
import java.io.*;
import java.util.*;

public class GameRoute {

    static final long MOD = 1000000007;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[n + 1];
        long[] dp = new long[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            adj.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();

        // Push all nodes with indegree 0
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        dp[1] = 1;  // Start from node 1

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int next : adj.get(node)) {
                dp[next] = (dp[next] + dp[node]) % MOD;

                indegree[next]--;
                if (indegree[next] == 0) {
                    q.offer(next);
                }
            }
        }

        out.println(dp[n]);
        out.close();
    }
}