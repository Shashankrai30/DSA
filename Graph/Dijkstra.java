package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Dijkstra {
    public static class pair{
        int node;
        long dist;
        public pair(int node,long distance){
            this.node=node;
            this.dist=distance;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        long distance[]=new long[n+1];
        Arrays.fill(distance,(int)1e9);
        int parent[]=new int[n+1];
        Arrays.fill(parent,-1);
        ArrayList<ArrayList<pair>> list=new ArrayList<>();
        for(int i=0;i<n+1;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v= sc.nextInt();
            long w=sc.nextLong();

            list.get(u).add(new pair(v,w));
            list.get(v).add(new pair(u,w));
        }

        distance[1]=0;
        PriorityQueue<pair> pq=new PriorityQueue<>((a, b)->Long.compare(a.dist,b.dist));
        pq.offer(new pair(1,0));

        while(!pq.isEmpty()){
            pair curr=pq.poll();
            int node= curr.node;
            long dis=curr.dist;

            if(dis>distance[node]) continue;

            for(pair p:list.get(node)){
                int u=p.node;
                long cost=p.dist;

                if(distance[u]>distance[node]+cost){
                    distance[u]=distance[node]+cost;
                    pq.offer(new pair(u,distance[u]));
                    parent[u]=node;
                }
            }
        }
        if(distance[n]==(int)1e9){
            System.out.println(-1);
            return;
        }

        ArrayList<Integer>path=new ArrayList<>();

        for(int i=n;i!=-1;i=parent[i]){
            path.add(i);
        }
        Collections.reverse(path);
        for(int na:path){
            System.out.print(na+ " ");
        }
    }
}

//import java.io.*;
//import java.util.*;
//
//public class Dijkstra {
//
//    static class Pair {
//        int node;
//        long dist;
//
//        Pair(int node, long dist) {
//            this.node = node;
//            this.dist = dist;
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter out = new PrintWriter(System.out);
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
//        for (int i = 0; i <= n; i++) {
//            adj.add(new ArrayList<>());
//        }
//
//        for (int i = 0; i < m; i++) {
//            st = new StringTokenizer(br.readLine());
//            int u = Integer.parseInt(st.nextToken());
//            int v = Integer.parseInt(st.nextToken());
//            long w = Long.parseLong(st.nextToken());
//
//            adj.get(u).add(new Pair(v, w));
//            adj.get(v).add(new Pair(u, w));   // remove if graph is directed
//        }
//
//        long INF = (long) 1e18;   // proper long infinity
//        long[] dist = new long[n + 1];
//        int[] parent = new int[n + 1];
//
//        Arrays.fill(dist, INF);
//        Arrays.fill(parent, -1);
//
//        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(a.dist, b.dist));
//
//        dist[1] = 0;
//        pq.offer(new Pair(1, 0));
//
//        while (!pq.isEmpty()) {
//            Pair curr = pq.poll();
//            int node = curr.node;
//            long d = curr.dist;
//
//            if (d > dist[node]) continue;
//
//            for (Pair next : adj.get(node)) {
//                int neigh = next.node;
//                long weight = next.dist;
//
//                if (dist[neigh] > dist[node] + weight) {
//                    dist[neigh] = dist[node] + weight;
//                    parent[neigh] = node;
//                    pq.offer(new Pair(neigh, dist[neigh]));
//                }
//            }
//        }
//
//        if (dist[n] == INF) {
//            out.println(-1);
//        } else {
//            ArrayList<Integer> path = new ArrayList<>();
//            for (int v = n; v != -1; v = parent[v]) {
//                path.add(v);
//            }
//            Collections.reverse(path);
//
//            for (int v : path) {
//                out.print(v + " ");
//            }
//        }
//
//        out.flush();
//    }
//}