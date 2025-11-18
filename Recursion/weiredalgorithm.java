package Recursion;

import java.util.Scanner;

public class weiredalgorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        algo(n);
    }
    public static void algo(long n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        if(n%2==0){
            n=n/2;
            algo(n);
        }
        else{
            n=n*3+1;
            algo(n);
        }
    }
}
