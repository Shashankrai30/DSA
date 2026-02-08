package Graph;



public class Grid {
    static int dr[]={-1,1,0,0};
    static int dc[]={0,0,-1,1};
    static int rowl;
    static int coll;
    public static void main(String[] args) {
        int[][]grid={{1,1,0,0},{1,1,0,0},{0,0,1,1},{0,0,1,1}};
        rowl=grid.length;
        coll=grid[0].length;

        boolean visited[][]=new boolean[rowl][coll];
        int component=0;
        for(int i=0;i<rowl;i++){
            for(int j=0;j<coll;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    dfs(i,j,visited,grid);
                    component++;
                }
            }
        }
        System.out.println(component);
    }
    public static void dfs(int r,int c,boolean visited[][],int grid[][]){
       if(r<0 || c<0 || r>=rowl || c>=coll || grid[r][c]==0) {
           return;
       }
       if(visited[r][c]){
           return;
       }
       visited[r][c]=true;
       dfs(r-1,c,visited,grid);// up
       dfs(r,c+1,visited,grid);// Right
       dfs(r+1,c,visited,grid);// down
       dfs(r,c-1,visited,grid);// left

//      for(int i=0;i<4;i++){
//          dfs(r+dr[i],c+dc[i],visited,grid);
//      }

    }
}
