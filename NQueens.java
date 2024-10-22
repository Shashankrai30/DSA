import java.util.*;
public class NQueens {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }
        ArrayList<ArrayList<String>> solveNQueens=new ArrayList<>();
        nQuens(arr,solveNQueens,0);
        System.out.println(solveNQueens);
    }
    public static void nQuens(char arr[][],ArrayList<ArrayList<String>> solveNQueens,int row){
        int n=arr.length;
        if(row==n){
            ArrayList<String> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    str=str+arr[i][j];
                }
                ans.add(str);
            }
            solveNQueens.add(ans);
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(arr,row,j)){
                arr[row][j]='Q';
                nQuens(arr,solveNQueens,row+1);
                arr[row][j]='.';
            }
        }
    }
    public static boolean isSafe(char arr[][],int row,int col){
        int n=arr.length;
        for(int i=0;i<row;i++){
            if(arr[i][col]=='Q') return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
         return true;
    }
}