package Recursion;

import java.util.*;
public class sumofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int x=sc.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the array : ");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr,x-1,0));
    }
    public static int sum(int[] arr,int c,int sum){
        if(c<0){
            return sum;
        }
        sum=sum+arr[c];
        return sum(arr,c-1,sum);
    }
}
