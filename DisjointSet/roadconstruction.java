package DisjointSet;

import java.util.*;

public class roadconstruction {
    public static class pair{
        int u;
        int v;
        public  pair(int u,int v){
            this.u=u;
            this.v=v;
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
        int size[]=new int[n+1];
        Arrays.fill(size,1);
        Queue<pair> pq=new LinkedList<>();

        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            pq.offer(new pair(u,v));
        }
        int component=n;
        while(!pq.isEmpty()){
            pair curr=pq.poll();

            if(union(curr.u,curr.v,parent,size)){
                component--;
            }
            System.out.print(component+" ");
            int max=0;
            for(int i=1;i<n+1;i++){
                max=Math.max(max,size[i]);
            }
            System.out.println(max);
        }
    }
    public static boolean union(int x,int y,int parent[],int size[]){
        int p_x=find(x,parent);
        int p_y=find(y,parent);

        if(p_x==p_y){
            return false;
        }
        if(size[p_x]>size[p_y]){
            parent[p_y]=p_x;
            size[p_x]=size[p_y]+size[p_x];
        }
        else if(size[p_y]>size[p_x]){
            parent[p_x]=p_y;
            size[p_y]=size[p_y]+size[p_x];
        }
        else {
            parent[p_x]=p_y;
            size[p_y]=size[p_y]+size[p_x];
        }
        return true;
    }
    public static int find(int x,int parent[]){
        if(x==parent[x])return x;
        return find(parent[x],parent);
    }
}

