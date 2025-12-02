package Recursion;

public class path {
    public static void main(String[] args) {
        System.out.println(ways(3,3,0,0));
    }
    public static int ways(int er,int ec,int sr,int sc){
       if(sr>er || sc>ec){
           return 0;
       }
       if(sr==er && sc==ec){
           return 1;
       }
       int right=ways(er,ec,sr,sc+1);
       int down=ways(er,ec,sr+1,sc);
       return right+down;
//        if(sr>er || sc>ec){
//            return;
//        }
//        if(sr==er && sc==ec){
//            System.out.println(str);
//        }
//        ways(er,ec,sr+1,sc,str+"D");
//        ways(er,ec,sr,sc+1,str+"R");

    }
}







