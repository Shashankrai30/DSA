package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Buildingroads {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int E=sc.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        for(int i=0;i<V+1;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<E;i++){
            int s=sc.nextInt();
            int e=sc.nextInt();
            list.get(s).add(e);
            list.get(e).add(s);
        }
        boolean visited[]=new boolean[V+1];
        ArrayList<Integer > ans=new ArrayList<>();
        for(int i=1;i<=V;i++){
            if(!visited[i]){
                dfs(i,visited,list);
                ans.add(i);
            }
        }
        System.out.println(ans.size()-1);
        for(int i=0;i<ans.size()-1;i++){
            System.out.println(ans.get(i)+" "+(ans.get(i+1)));
        }
    }
    static void dfs(int i,boolean visited[],ArrayList<ArrayList<Integer>> list){
        visited[i]=true;

        for(int n:list.get(i)){
            if(!visited[n]){
                dfs(n,visited,list);
            }
        }
    }
}
