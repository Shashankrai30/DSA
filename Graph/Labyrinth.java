package Graph;

import java.io.*;
import java.util.*;

public class Labyrinth {
    static int rowl;
    static int coll;
    static int dr[]={1,-1,0,0};
    static int dc[]={0,0,1,-1};
    static String direction[]={"D","U","R","L"};
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        rowl=n;
        int m=scan.nextInt();
        coll=m;
        boolean visited[][]=new boolean[rowl][coll];
        char grid[][]=new char[rowl][coll];
        int sr=0;
        int sc=0;
        int er=-1;
        int ec=-1;
        for(int i=0;i<rowl;i++){
            String s=scan.next();
            for(int j=0;j<coll;j++){
                grid[i][j]=s.charAt(j);
                if(s.charAt(j)=='A'){
                    sr=i;
                    sc=j;
                }
                if(s.charAt(j)=='B'){
                    er=i;
                    ec=j;
                }
            }
        }

        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{sr,sc});
        visited[sr][sc]=true;

        String parent[][]=new String[rowl][coll];

        while(!q.isEmpty()){
            int arr[]=q.poll();
            int r=arr[0];
            int c=arr[1];

            for(int i=0;i<4;i++){
                int nrow=r+dr[i];
                int ncol=c+dc[i];
                String d=direction[i];
                if(nrow==er && ncol==ec && !visited[nrow][ncol]){
                    parent[nrow][ncol]=d;
                    visited[nrow][ncol]=true;
                    break;
                }
                if(nrow>=0 && ncol>=0 && nrow<rowl && ncol<coll && !visited[nrow][ncol] && grid[nrow][ncol]=='.'){
                    visited[nrow][ncol]=true;
                    parent[nrow][ncol]=d;
                    q.offer(new int[]{nrow,ncol});
                }
            }
        }
//        for(int i=0;i<rowl;i++){
//            for(int j=0;j<coll;j++){
//                System.out.print(parent[i][j]+ " ");
//            }
//            System.out.println();
//        }
        if(!visited[er][ec]) {
            System.out.println("No");
            return;
        }
        ArrayList<String> ans=new ArrayList<>();
        int i=er;
        int j=ec;
        while(i!=sr || j!=sc){
            if(parent[i][j]=="U"){
                ans.add("U");
                i++;
            }
            else if(parent[i][j]=="D"){
                ans.add("D");
                i--;
            }
            else if(parent[i][j]=="R"){
                ans.add("R");
                j--;
            }
            else if(parent[i][j]=="L"){
                ans.add("L");
                j++;
            }
        }
        Collections.reverse(ans);
        System.out.println("Yes");
        System.out.println(ans.size());
        System.out.println(ans);

    }
}
