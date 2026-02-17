package Graph;
//import java.util.*;
//public class ShortestPath1 {
//    public static class pair{
//        int node;
//        long dist;
//        public pair(int node,long distance){
//            this.node=node;
//            this.dist=distance;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m= sc.nextInt();
//        long distance[]=new long[n+1];
//        Arrays.fill(distance,Long.MAX_VALUE);
//        ArrayList<ArrayList<pair>> list=new ArrayList<>();
//        for(int i=0;i<n+1;i++){
//            list.add(new ArrayList<>());
//        }
//
//        for(int i=0;i<m;i++){
//            int u=sc.nextInt();
//            int v= sc.nextInt();
//            long w=sc.nextLong();
//
//            list.get(u).add(new pair(v,w));
//        }
//
//        distance[1]=0;
//        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->Long.compare(a.dist,b.dist));
//        pq.offer(new pair(1,0));
//
//        while(!pq.isEmpty()){
//            pair curr=pq.poll();
//            int node= curr.node;
//            long dis=curr.dist;
//
//            if(dis>distance[node]) continue;
//
//            for(pair p:list.get(node)){
//                int u=p.node;
//                long cost=p.dist;
//
//                if(distance[u]>distance[node]+cost){
//                    distance[u]=distance[node]+cost;
//                    pq.offer(new pair(u,distance[u]));
//                }
//            }
//        }
//        for (int i=1;i<distance.length;i++){
//            System.out.print(distance[i]+ " ");
//        }
//    }
//}
import java.io.*;
import java.util.*;

public class ShortestPath1 {

    static class Pair {
        int node;
        long dist;

        Pair(int node, long dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            long w = Long.parseLong(st.nextToken());

            graph.get(u).add(new Pair(v, w));
        }

        long[] distance = new long[n + 1];
        Arrays.fill(distance, Long.MAX_VALUE);

        PriorityQueue<Pair> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a.dist, b.dist));

        distance[1] = 0;
        pq.offer(new Pair(1, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();

            if (curr.dist > distance[curr.node]) continue;

            for (Pair next : graph.get(curr.node)) {
                if (distance[next.node] > distance[curr.node] + next.dist) {
                    distance[next.node] = distance[curr.node] + next.dist;
                    pq.offer(new Pair(next.node, distance[next.node]));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(distance[i]).append(" ");
        }

        System.out.println(sb);
    }
}
//public class ShortestPath1 {
//    public static class pair{
//        int node;
//        long distance;
//        public pair(int node,long dist){
//            this.node=node;
//            this.distance=dist;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        int V=sc.nextInt();
//        int E=sc.nextInt();
//
//        long dist[]=new long[V+1];
//        Arrays.fill(dist,Long.MAX_VALUE);
//        dist[1]=0;
//        ArrayList<ArrayList<pair>> list=new ArrayList<>();
//
//        for(int i=0;i<V+1;i++){
//            list.add(new ArrayList<>());
//        }
//        for(int i=0;i<E;i++){
//            int u= sc.nextInt();
//            int v= sc.nextInt();
//            long d=sc.nextLong();
//            list.get(u).add(new pair(v,d));
//        }
//        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->Long.compare(a.distance, b.distance));
//        pq.offer(new pair(1,0));
//
//        while(!pq.isEmpty()){
//            pair p=pq.poll();
//            int node=p.node;
//
//            for(pair curr:list.get(node)){
//                int n= curr.node;
//                long d= curr.distance;
//                if(dist[n]>dist[node]+d){
//                    dist[n]=dist[node]+d;
//                    pq.offer(new pair(n,dist[n]));
//                }
//            }
//        }
//        for(int i=1;i<V+1;i++){
//            System.out.print(dist[i]+" ");
//        }
//    }
//}