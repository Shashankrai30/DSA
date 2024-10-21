public class ratindeadmaze{
    public static void main(String []args){
        int row =4;
        int col=6;
        int arr[][]={{1,1,0,1,1,1},
                     {1,1,1,1,1,0},
                     {1,0,1,0,1,1},
                     {1,1,0,1,1,1}};
        maze(0,0,row-1,col-1,arr,"");
    }
    public static void maze(int sr,int sc,int er,int ec,int arr[][],String str){
        if(sr<0 ||sc<0) return;
        if(sr>er || sc>ec) return ;
        if(sr==er && sc==ec){
            System.out.println(str);
        }
        if(arr[sr][sc]<1) return;
        arr[sr][sc]=-1;
        maze(sr,sc+1,er,ec,arr,str+"R");
        maze(sr+1,sc,er,ec,arr,str+"D");
        maze(sr,sc-1,er,ec,arr,str+"L");
        maze(sr-1,sc,er,ec,arr,str+"U");
        arr[sr][sc]=1;
    }
}