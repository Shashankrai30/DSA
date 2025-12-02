package Backtracking;

public class kknights {
    public static void main(String[] args) {
        int n=3;
        char[][] board=new char[3][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        Kknight(board,0,0);
    }
    public static void Kknight(char[][]board,int row,int col){
        int n= board.length;
        if(row==board.length){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        int nextRow = row;
        int nextCol = col+1;

        if(nextCol==n){
            nextCol=0;
            nextRow++;
        }

        // place knight
        if(isSafe(board,row,col)){
            board[row][col]='q';
            Kknight(board,nextRow,nextCol);
            board[row][col]='x';
        }

        // don't place
        Kknight(board,nextRow,nextCol);

    }
    public static boolean isSafe(char[][]grid,int row,int col){
        int l=grid.length;
        //2 down 1 right
        if(row+2<l && col+1<l){
            if(grid[row+2][col+1]=='q'){
                return false;
            }
        }
        //1 down 2 right
        if(row+1<l && col+2<l){
            if(grid[row+1][col+2]=='q'){
                return false;
            }
        }
        //2 up 1 left
        if(row-2>=0 && col-1>=0){
            if(grid[row-2][col-1]=='q'){
                return false;
            }
        }
        // 1 up 2 right
        if(row-1>=0 && col+2<l){
            if(grid[row-1][col+2]=='q'){
                return false;
            }
        }
        //2 up 1 right
        if(row-2>=0 && col+1<l){
            if(grid[row-2][col+1]=='q'){
                return false;
            }
        }
        //1 up 2 left
        if(row-1>=0 && col-2>=0){
            if(grid[row-1][col-2]=='q'){
                return false;
            }
        }
        //1 down 2 left
        if(row+1<l && col-2>=0){
            if(grid[row+1][col-2]=='q'){
                return false;
            }
        }
        //2 down 1 left
        if(row+2<l && col-1>=0){
            if(grid[row+2][col-1]=='q'){
                return false;
            }
        }
        return true;
    }
}
