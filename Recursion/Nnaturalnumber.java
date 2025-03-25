package Recursion;
import java.util.*;

public class Nnaturalnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        natural(1,x);
    }
//    public static void natural(int c,int n){   normal
//        if(c>n) return;
//        System.out.println(c);
//        natural(c+1,n);
//        return;
//    }
    public static void natural(int c,int n){    //reverse
        if(c>n) return;
        natural(c+1,n);
        System.out.println(c);
        return;
    }
}
