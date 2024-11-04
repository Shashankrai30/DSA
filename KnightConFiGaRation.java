public class KnightConFiGaRation {
    static boolean helper(int[][] grid,int row,int col,int num){
        int n=grid.length;
        if (num==n*n-1) return true;
        //up and right
        int i=row-2;
        int j=col+1;
        if(i>=0 && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        //up and left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        // right and up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        // right and down
        i=row+1;
        j=col+2;
        if(i<n && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        //left and up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        //left and down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        //down and right
        i=row+2;
        j=col+1;
        if(i<n && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        //down and left
        i=row+2;
        j=col-1;
        if(j>=0 && i<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        return false;
    }
    public static boolean checkValidGrid(String [] args) {
        int[][] grid={{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};

        if(grid[0][0]!=0) return false;
        return helper(grid,0,0,0);
    }
}