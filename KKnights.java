import java.util.*;
public class KKnights{
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
        nQueens(arr,solveNQueens,0);
        System.out.println(solveNQueens.size());
    }
    public static void nQueens(char arr[][],ArrayList<ArrayList<String>> solveNQueens,int row){
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
                arr[row][j]='K';
                nQueens(arr,solveNQueens,row+1);
                arr[row][j]='.';
            }
        }
    }
    public static boolean isSafe(char arr[][],int row,int col){
        int n=arr.length;
        //up and right
        int i=row-2;
        int j=col+1;
        if(i>=0 && j<n && arr[i][j]=='K') return false;
        //up and left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && arr[i][j]=='K') return false;
        // right and up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && arr[i][j]=='K') return false;
        // right and down
        i=row+1;
        j=col+2;
        if(i<n && j<n && arr[i][j]=='K') return false;
        //left and up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && arr[i][j]=='K') return false;
        //left and down
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && arr[i][j]=='K') return false;
        //down and right
        i=row+2;
        j=col+1;
        if(i<n && j<n && arr[i][j]=='K') return false;
        //down and left
        i=row+2;
        j=col-1;
        if(j>=0 && i<n && arr[i][j]=='K') return false;
        return true;
    }
}
