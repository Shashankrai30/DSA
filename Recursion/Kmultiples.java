package Recursion;
import java.util.*;

public class Kmultiples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        table(a,b,1);
    }
    public static void table(int a,int b,int c){
        if(c>b) return;
        System.out.println(a*c);
        table(a,b,c+1);
        return;
    }
}
