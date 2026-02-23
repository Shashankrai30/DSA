package DisjointSet;

import java.util.PriorityQueue;
import java.util.Scanner;

public class roadreparation {
    public static class pair{
        int u;
        int v;
        int c;
        public  pair(int u,int v,int c){
            this.u=u;
            this.v=v;
            this.c=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int parent[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            parent[i]=i;
        }
        int rank[]=new int[n+1];
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.c,b.c));

        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
            pq.offer(new pair(u,v,w));
        }
        int weight=0;
        while(!pq.isEmpty()){
            pair curr=pq.poll();

            if(union(curr.u,curr.v,parent,rank)){
                weight=weight+curr.c;
            }
        }
        int count=0;
        for(int i=1;i<n+1;i++){
            if(i==parent[i]) count++;
        }
        if(count==1){
            System.out.println(weight);
        }
        else{
            System.out.println("Impossible");
        }
    }
    public static boolean union(int x,int y,int parent[],int rank[]){
        int p_x=find(x,parent);
        int p_y=find(y,parent);

        if(p_x==p_y){
            return false;
        }
        if(rank[p_x]>rank[p_y]){
            parent[p_y]=p_x;
        }
        else if(rank[p_y]>rank[p_x]){
            parent[p_x]=p_y;
        }
        else {
            parent[p_x]=p_y;
            rank[p_y]++;
        }
        return true;
    }
    public static int find(int x,int parent[]){
        if(x==parent[x])return x;
        return find(parent[x],parent);
    }
}
