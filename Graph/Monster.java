package Graph;

import java.io.*;
import java.util.*;

public class Monster {
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static char[] dir = {'U', 'D', 'L', 'R'};
    public static void main(String[] args) throws IOException{
       Scanner scan=new Scanner(System.in);
       int rowl=scan.nextInt();
       int coll=scan.nextInt();
       char grid[][]=new char[rowl][coll];
       int disM[][]=new int[rowl][coll];
       for(int[] temp:disM){
           Arrays.fill(temp,Integer.MAX_VALUE);
       }
       int disP[][]=new int[rowl][coll];
        for(int[] temp:disP){
            Arrays.fill(temp,Integer.MAX_VALUE);
        }
       boolean visitedM[][]=new boolean[rowl][coll];
       boolean visitedP[][]=new boolean[rowl][coll];
       char parent[][]=new char[rowl][coll];
       int sr=0;
       int sc=0;
       Queue<int[]>qM=new LinkedList<>();
       Queue<int[]>qP=new LinkedList<>();
       for(int i=0;i<rowl;i++){
           String temp=scan.next();
           for(int j=0;j<coll;j++){
               grid[i][j]=temp.charAt(j);
               if(temp.charAt(j)=='M'){
                   qM.offer(new int[]{i,j});
                   disM[i][j]=0;
                   visitedM[i][j]=true;
               }
               if(temp.charAt(j)=='A'){
                   sr=i;
                   sc=j;
                   qP.offer(new int[]{sr,sc});
                   disP[i][j]=0;
                   visitedP[i][j]=true;
               }
           }
       }

       while(!qM.isEmpty()){
           int arr[]=qM.poll();
           int row=arr[0];
           int col=arr[1];
           int dist=disM[row][col];

           for(int i=0;i<4;i++){
               int nrow=row+dr[i];
               int ncol=col+dc[i];
               if(nrow>=0 && ncol>=0 && nrow<rowl && ncol<coll && grid[nrow][ncol]!='#' && !visitedM[nrow][ncol]){
                   qM.offer(new int[]{nrow,ncol});
                   visitedM[nrow][ncol]=true;
                   disM[nrow][ncol]=dist+1;
               }
           }
       }
       int er=-1;
       int ec=-1;
       while(!qP.isEmpty()){
           int arr[]=qP.poll();
           int row=arr[0];
           int col=arr[1];
           int dist=disP[row][col];

           for(int i=0;i<4;i++){
               int nrow=row+dr[i];
               int ncol=col+dc[i];
               char direction=dir[i];
               if((nrow==0 || ncol==0 || nrow==rowl-1 || ncol==coll-1) && grid[nrow][ncol]=='.'){
                   er=nrow;
                   ec=ncol;
                   parent[nrow][ncol]=direction;
                   visitedP[nrow][ncol]=true;
                   break;
               }
               if(nrow>=0 && ncol>=0 && nrow<rowl && ncol<coll && !visitedP[nrow][ncol] && grid[nrow][ncol]=='.' && dist+1<disM[nrow][ncol]){
                   qP.offer(new int[]{nrow,ncol});
                   visitedP[nrow][ncol]=true;
                   disP[nrow][ncol]=dist+1;
                   parent[nrow][ncol]=direction;
               }
           }
       }
        if(!visitedP[er][ec]) {
            System.out.println("No");
            return;
        }
        ArrayList<String> ans=new ArrayList<>();
        int i=er;
        int j=ec;
        while(i!=sr || j!=sc){
            if(parent[i][j]=='U'){
                ans.add("U");
                i++;
            }
            else if(parent[i][j]=='D'){
                ans.add("D");
                i--;
            }
            else if(parent[i][j]=='R'){
                ans.add("R");
                j--;
            }
            else if(parent[i][j]=='L'){
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
//import java.io.*;
//import java.util.*;
//
//public class Monster {
//
//    static int[] dr = {-1, 1, 0, 0};
//    static int[] dc = {0, 0, -1, 1};
//    static char[] dir = {'U', 'D', 'L', 'R'};
//
//    public static void main(String[] args) throws Exception {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//
//        char[][] grid = new char[n][m];
//        int[][] distM = new int[n][m];
//        int[][] distP = new int[n][m];
//
//        for (int[] row : distM) Arrays.fill(row, Integer.MAX_VALUE);
//        for (int[] row : distP) Arrays.fill(row, Integer.MAX_VALUE);
//
//        Queue<int[]> qM = new LinkedList<>();
//        Queue<int[]> qP = new LinkedList<>();
//
//        int sr = 0, sc = 0;
//
//        for (int i = 0; i < n; i++) {
//            String line = br.readLine();
//            for (int j = 0; j < m; j++) {
//                grid[i][j] = line.charAt(j);
//
//                if (grid[i][j] == 'M') {
//                    qM.offer(new int[]{i, j});
//                    distM[i][j] = 0;
//                }
//
//                if (grid[i][j] == 'A') {
//                    sr = i;
//                    sc = j;
//                    qP.offer(new int[]{i, j});
//                    distP[i][j] = 0;
//                }
//            }
//        }
//
//        // 1️⃣ Monster BFS
//        while (!qM.isEmpty()) {
//            int[] cur = qM.poll();
//            int r = cur[0], c = cur[1];
//
//            for (int i = 0; i < 4; i++) {
//                int nr = r + dr[i];
//                int nc = c + dc[i];
//
//                if (nr >= 0 && nc >= 0 && nr < n && nc < m
//                        && grid[nr][nc] != '#'
//                        && distM[nr][nc] == Integer.MAX_VALUE) {
//
//                    distM[nr][nc] = distM[r][c] + 1;
//                    qM.offer(new int[]{nr, nc});
//                }
//            }
//        }
//
//        // 2️⃣ Player BFS
//        char[][] parent = new char[n][m];
//
//        // If already on boundary
//        if (sr == 0 || sc == 0 || sr == n - 1 || sc == m - 1) {
//            System.out.println("YES");
//            System.out.println(0);
//            System.out.println("");
//            return;
//        }
//
//        int er = -1, ec = -1;
//
//        while (!qP.isEmpty()) {
//            int[] cur = qP.poll();
//            int r = cur[0], c = cur[1];
//
//            for (int i = 0; i < 4; i++) {
//                int nr = r + dr[i];
//                int nc = c + dc[i];
//
//                if (nr >= 0 && nc >= 0 && nr < n && nc < m
//                        && grid[nr][nc] == '.'
//                        && distP[nr][nc] == Integer.MAX_VALUE
//                        && distP[r][c] + 1 < distM[nr][nc]) {
//
//                    distP[nr][nc] = distP[r][c] + 1;
//                    parent[nr][nc] = dir[i];
//                    qP.offer(new int[]{nr, nc});
//
//                    if (nr == 0 || nc == 0 || nr == n - 1 || nc == m - 1) {
//                        er = nr;
//                        ec = nc;
//                        break;
//                    }
//                }
//            }
//        }
//
//        if (er == -1) {
//            System.out.println("NO");
//            return;
//        }
//
//        // 3️⃣ Path Reconstruction
//        StringBuilder path = new StringBuilder();
//        int r = er, c = ec;
//
//        while (r != sr || c != sc) {
//            char d = parent[r][c];
//            path.append(d);
//
//            if (d == 'U') r++;
//            else if (d == 'D') r--;
//            else if (d == 'L') c++;
//            else c--;
//        }
//
//        path.reverse();
//
//        System.out.println("YES");
//        System.out.println(path.length());
//        System.out.println(path.toString());
//    }
//}