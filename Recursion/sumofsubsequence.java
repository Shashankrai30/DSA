package Recursion;

import java.util.*;

public class sumofsubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3};
        sumsub(arr,0,0);
    }
    public static void sumsub(int arr[],int idx,int sum){
        if(idx==arr.length){
            System.out.println(sum);
            return;
        }
        sumsub(arr,idx+1,sum);
        sumsub(arr,idx+1,sum+arr[idx]);
    }
}
