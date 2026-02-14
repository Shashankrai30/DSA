//package Graph;
//
//import java.io.*;
//import java.util.*;
//
//public class LongestFlighRoute {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st=new StringTokenizer(br.readLine());
//        int n=Integer.parseInt(st.nextToken());
//        int m=Integer.parseInt(st.nextToken());
//
//        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
//
//        for(int i=0;i<=n;i++){
//            list.add(new ArrayList<>());
//        }
//        int parent[]=new int[n+1];
//        int count[]=new int[n+1];
////        int indegree[]=new int[n+1];
//
//        Arrays.fill(count,0);
//        Arrays.fill(parent,-1);
//        count[1]=1;
//
//        for(int i=0;i<m;i++){
//            st=new StringTokenizer(br.readLine());
//            int u=Integer.parseInt(st.nextToken());
//            int v=Integer.parseInt(st.nextToken());
//
//            list.get(u).add(v);
////            indegree[v]++;
//        }
//        Queue<Integer> q=new LinkedList<>();
////        for (int i=1;i<n+1;i++){
////            if(indegree[i]==0){
////                q.offer(i);
////            }
////        }
//        boolean visited[]=new boolean[n+1];
//        q.offer(1);
//        visited[1]=true;
//
//        while(!q.isEmpty()){
//            int node=q.poll();
//            for(int neighbour:list.get(node)){
//                if(count[node]>0 && count[node]+1>count[neighbour]){
//                    count[neighbour]=count[node]+1;
//                    parent[neighbour]=node;
//                }
////                indegree[neighbour]--;
////                if(indegree[neighbour]==0){
//                    if(!visited[neighbour]){
//                        q.offer(neighbour);
//                    }
////                }
//            }
//        }
//
//        if(parent[n]==-1){
//            System.out.println("IMPOSSIBLE");
//            return;
//        }
//
//        ArrayList<Integer>path=new ArrayList<>();
//
//        for(int curr=n;curr!=-1;curr=parent[curr]){
//            path.add(curr);
//        }
//        Collections.reverse(path);
//
//        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(path.size()+"\n");
//        for(int val:path){
//            bw.write(val+" ");
//        }
//        bw.flush();
//    }
//}
package Graph;

import java.util.*;

public class LongestFlighRoute{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int parent[]=new int[n+1];
        Arrays.fill(parent,-1);
        int count[]=new int[n+1];
        int indegree[]=new int[n+1];

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<n+1;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            list.get(u).add(v);
            indegree[v]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }
        count[1]=1;

        while(!q.isEmpty()){
            int node=q.poll();

            for(int neighbour:list.get(node)){
                if(count[node]>0 && count[neighbour]<count[node]+1){
                    count[neighbour]=count[node]+1;
                    parent[neighbour]=node;
                }
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    q.offer(neighbour);
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=n;i!=-1;i=parent[i]){
            ans.add(i);
        }
        Collections.reverse(ans);
        System.out.println(ans.size());
        System.out.println(ans.toString());
    }
}