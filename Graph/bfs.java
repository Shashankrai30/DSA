package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int V=sc.nextInt();
        int e=sc.nextInt();

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        for(int i=0;i<=V;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            list.get(u).add(v);
            list.get(v).add(u);
        }


        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+ " ");
            }
            System.out.println();
        }
        boolean visited[]=new boolean[list.size()];
        for(int i=0;i<=V;i++){
            if(!visited[i]){
                Bfs(visited,list,i);
            }
        }
    }

    private static void Bfs(boolean[] visited, ArrayList<ArrayList<Integer>> list, int i) {


        Queue<Integer> q=new LinkedList<>();

        q.offer(i);
        visited[i]=true;

        while(!q.isEmpty()){
            int node=q.poll();

            System.out.println(node+ " ");

            for(int neighbour: list.get(node)){
                if(!visited[neighbour]){
                    q.offer(neighbour);
                    visited[neighbour]=true;
                }
            }
        }
    }
}
