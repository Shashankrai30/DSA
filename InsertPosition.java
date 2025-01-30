package Array;

import java.util.*;

public class InsertPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int ans=0;
        int[] arr=new int[x];
        int tar=sc.nextInt();
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<=x/2;j++){
            if(arr[j]==tar){
                ans=j;
            }
            else if (arr[arr.length-j-1]==tar) {
                ans= arr.length-j-1;
            }
        }
        int mid=x/2;
        if(tar>arr[mid]) {
            for (int i = mid + 1; i < x; i++) {
                if (tar > arr[i] && tar < arr[i + 1]) {
                    ans= i + 1;
                }
            }
        }
        if(tar<arr[mid]) {
            for (int i = 0; i < mid; i++) {
                if (tar > arr[i] && tar < arr[i + 1]) {
                    ans= i + 1;
                }
            }
        }
        System.out.println(ans);
    }
}
