package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class party {
    static int ans=1;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        int parent[]=new int[n+1];
        for(int i=0;i<n;i++){
            int v=Integer.parseInt(br.readLine());
            parent[i+1]=v;
            if(v==-1){
                continue;
            }
            else{
                graph.get(v).add(i+1);
            }
        }

        for(int i=1;i<=n;i++){
            if(parent[i]==-1){
                dfs(graph,i,1);
            }
        }
        System.out.println(ans);
    }
    public static void dfs(ArrayList<ArrayList<Integer>> graph,int i,int depth){

        ans=Math.max(ans,depth);
        for(int neighbour:graph.get(i)){
            dfs(graph,neighbour,depth+1);
        }
    }
//    public static void bfs( ArrayList<ArrayList<Integer>> graph,int i){
//        Queue<int[]> q=new LinkedList<>();
//        q.offer(new int[]{i,1});
//
//        while(!q.isEmpty()){
//            int arr[]=q.poll();
//
//            for(int n:graph.get(arr[0])){
//                ans=Math.max(ans,arr[1]+1);
//                q.offer(new int[]{n,arr[1]+1});
//            }
//        }
//    }
}
