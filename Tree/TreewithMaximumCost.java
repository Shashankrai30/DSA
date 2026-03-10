//package Tree;
//
//import java.util.*;
//
//public class TreewithMaximumCost {
//    static int N;
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        int value[]=new int[n+1];
//
//        for(int i=0;i<=n;i++){
//            value[i]= sc.nextInt();
//            N+=value[i];
//        }
//
//        int[][] edges=new int [n][2];
//
//        for(int i=0;i<n-1;i++){
//            int src=sc.nextInt();
//            int dst=sc.nextInt();
//            edges[i][0]=src;
//            edges[i][1]=dst;
//        }
//
//        System.out.println(sumoftree(n,edges,value));
//
//    }
//    static List<Integer>[]tree;
//    static int []distance;
//    static int []subTree;
//    static int []ans;
//    static int max;
//    public static int sumoftree(int n, int[][] edges,int value[]) {
//        tree = new ArrayList[n];
//        distance = new int[n];
//        subTree = new int[n];
//        ans = new int[n];
//        max=0;
//        for(int i = 0 ;  i <  n ; i++)
//        {
//            tree[i] = new ArrayList<>();
//        }
//        for(int i = 0 ; i < edges.length;i++)
//        {
//            int a = edges[i][0];
//            int b  = edges[i][1];
//            tree[a].add(b);
//            tree[b].add(a);
//        }
//
//        dfs(0,-1,value);
//        ans[0] = distance[0];
//
//        reRoot(0,-1);
//
//        // reRooting
//        return max;
//
//    }
//    public static  void dfs(int node , int parent,int value[])
//    {
//        subTree[node] = value[node];
//        for(int child : tree[node])
//        {
//            if(child == parent)continue;
//            dfs(child,node,value);
//            subTree[node]+=subTree[child];
//            distance[node]+=distance[child]+subTree[child];
//        }
//    }
//    public static void reRoot(int node, int parent)
//    {
//        for(int child : tree[node])
//        {
//            if(child == parent)continue;
//            ans[child] = ans[node] + N - 2 * subTree[child];
//            max=Math.max(ans[child],max);
//            reRoot(child,node);
//        }
//    }
//}
package Tree;

import java.util.*;

public class TreewithMaximumCost {

    static long N;
    static List<Integer>[] tree;
    static long[] distance;
    static long[] subTree;
    static long[] ans;
    static long max;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int value[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            value[i] = sc.nextInt();
            N += value[i];
        }

        int[][] edges = new int[n - 1][2];

        for (int i = 0; i < n - 1; i++) {
            int src = sc.nextInt();
            int dst = sc.nextInt();
            edges[i][0] = src;
            edges[i][1] = dst;
        }

        System.out.println(sumoftree(n, edges, value));
    }

    public static long sumoftree(int n, int[][] edges, int value[]) {

        tree = new ArrayList[n + 1];
        distance = new long[n + 1];
        subTree = new long[n + 1];
        ans = new long[n + 1];
        max = 0;

        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];

            tree[a].add(b);
            tree[b].add(a);
        }

        dfs(1, -1, value);

        ans[1] = distance[1];
        max = ans[1];

        reRoot(1, -1);

        return max;
    }

    public static void dfs(int node, int parent, int value[]) {

        subTree[node] = value[node];

        for (int child : tree[node]) {

            if (child == parent) continue;

            dfs(child, node, value);

            subTree[node] += subTree[child];

            distance[node] += distance[child] + subTree[child];
        }
    }

    public static void reRoot(int node, int parent) {

        for (int child : tree[node]) {

            if (child == parent) continue;

            ans[child] = ans[node] + N - 2 * subTree[child];

            max = Math.max(max, ans[child]);

            reRoot(child, node);
        }
    }
}


//import java.io.*;
//import java.util.*;
//
//public class Main {
//
//    static long N;
//    static List<Integer>[] tree;
//    static long[] distance;
//    static long[] subTree;
//    static long[] ans;
//    static long max;
//
//    public static void main(String[] args) throws Exception {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        int n = Integer.parseInt(br.readLine());
//
//        long value[] = new long[n + 1];
//
//        st = new StringTokenizer(br.readLine());
//        for (int i = 1; i <= n; i++) {
//            value[i] = Long.parseLong(st.nextToken());
//            N += value[i];
//        }
//
//        tree = new ArrayList[n + 1];
//        for (int i = 1; i <= n; i++) {
//            tree[i] = new ArrayList<>();
//        }
//
//        for (int i = 0; i < n - 1; i++) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            tree[a].add(b);
//            tree[b].add(a);
//        }
//
//        distance = new long[n + 1];
//        subTree = new long[n + 1];
//        ans = new long[n + 1];
//
//        dfs(1, -1, value);
//
//        ans[1] = distance[1];
//        max = ans[1];
//
//        reRoot(1, -1);
//
//        System.out.println(max);
//    }
//
//    static void dfs(int node, int parent, long value[]) {
//
//        subTree[node] = value[node];
//
//        for (int child : tree[node]) {
//
//            if (child == parent) continue;
//
//            dfs(child, node, value);
//
//            subTree[node] += subTree[child];
//            distance[node] += distance[child] + subTree[child];
//        }
//    }
//
//    static void reRoot(int node, int parent) {
//
//        for (int child : tree[node]) {
//
//            if (child == parent) continue;
//
//            ans[child] = ans[node] + N - 2 * subTree[child];
//
//            max = Math.max(max, ans[child]);
//
//            reRoot(child, node);
//        }
//    }
//}
