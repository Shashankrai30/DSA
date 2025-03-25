package Recursion;
import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base : ");
        int x=sc.nextInt();
        System.out.println("Enter power : ");
        int y=sc.nextInt();
        System.out.println(pow(x,y));
    }
    public static int pow(int x,int y){
        if(y==0) return 1;
        return x*pow(x,y-1);
    }
}
