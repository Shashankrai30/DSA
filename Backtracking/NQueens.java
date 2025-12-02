package Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        char[][] board=new char[4][4];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nQueens(board,0);
    }
    public static void nQueens(char[][]board,int row){
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
        for(int i=0;i<board[0].length;i++){
            if(isSafe(board,row,i)){
                board[row][i]='q';
                nQueens(board,row+1);
                board[row][i]='x';
            }
        }
    }
    public static boolean isSafe(char[][]board,int row,int col){
        int n=board.length;
        int c=col;
        //complete column
        for(int i=0;i<n;i++){
            if(board[i][col]=='q')return false;
        }
        //
        int r=row;
        int co=col;
        // upper left diagonal
        while(r>=0 && co>=0){
            if(board[r][co]=='q')return false;
            r--;
            co--;
        }
        //upper right diagonal
        int sr=row;
        int sc=col;
        while(sr>=0 && sc<n){
            if(board[sr][sc]=='q')return false;
            sr--;
            sc++;
        }

        return true;
    }
}
