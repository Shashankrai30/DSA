package Recursion;

public class TOH {
    public static void main(String[] args) {
        toh(3,"S","H","D");
    }
    public static void toh(int n,String S,String H,String D){
        if(n==1){
            System.out.println("Trasnfer Disk "+n+" From "+S+" to "+D);
            return;
        }
        toh(n-1,S,D,H);
        System.out.println("Trasnfer Disk "+n+" From "+S+" to "+D);
        toh(n-1,H,S,D);
    }
}
