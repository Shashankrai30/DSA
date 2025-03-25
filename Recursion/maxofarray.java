package Recursion;
import java.util.*;

public class maxofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the array : ");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        max(arr,x-1, Integer.MIN_VALUE);
    }
    public static void max(int arr[],int x,int m){
        if(x<0){
            System.out.println(m);
            return;
        }
        if(m<arr[x]){
            m=arr[x];
        }
        max(arr,x-1,m);
        return;
    }
}
