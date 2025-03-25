package Recursion;
import java.util.*;

public class GCD {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        hcf(a,b,1,1);
//    }
//    public static void hcf(int a,int b,int c,int d){
//        if(a%d==0 && b%d==0){
//            c=d;
//        }
//        if(d==a || d==b){
//            System.out.println(c);
//            return;
//        }
//
//        hcf(a,b,c,d+1);
//
//        return;
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b>a) {
            hcf(a, b,a);
        }
        else{
            hcf(a,b,b);
        }
    }
        public static void hcf(int a,int b,int c){
            if((a%c==0 && b%c==0) || c==1){
                System.out.println(c);
                return;
            }
            hcf(a,b,c-1);

            return;
        }
}
