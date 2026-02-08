package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Labyrinth {
    static int rowl;
    static int coll;
    static int dr[]={1,-1,0,0};
    static int dc[]={0,0,1,-1};
    static char symbol[]={'D','U','R','L'};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][] grid = {
                {'#','#','#','#','#','#','#','#'},
                {'#','.','A','#','.','.','.','#'},
                {'#','.','#','#','.','#','B','#'},
                {'#','.','.','.','.','.','.','#'},
                {'#','#','#','#','#','#','#','#'}
        };
        rowl=grid.length;
        coll=grid[0].length;
        boolean answer=false;
        for(int i=0;i<rowl;i++){
            for(int j=0;j<coll;j++){
                if(grid[i][j]=='A'){
                   answer= bfs(i,j,grid);
                }
            }
        }
        if(!answer){
            System.out.println("False");
        }
    }
    static boolean bfs(int row,int col,char[][]grid){
        Queue<Object[]> q=new LinkedList<>();
        q.offer(new Object[]{row,col,""});

        while(!q.isEmpty()){
            Object arr[]=q.poll();

            for(int i=0;i<4;i++){
                int nrow=(int)arr[0]+dr[i];
                int ncol=(int)arr[1]+dc[i];
                String dir=(String)arr[2]+symbol[i];

                if(nrow>=0 && ncol>=0 && nrow<rowl && ncol<coll && grid[nrow][ncol]!='#' && grid[nrow][ncol]!='A'){
                    if(grid[nrow][ncol]=='B'){
                        System.out.println("True");
                        System.out.println( dir.length());
                        System.out.println(dir);
                        return true;
                    }
                    else{
                        q.offer(new Object[]{nrow,ncol,dir});
                        grid[nrow][ncol]='#';
                    }
                }
            }
        }
        return false;
    }
}
