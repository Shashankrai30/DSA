package DP;

import java.util.Scanner;

public class TheChronologicalLibrarian {
    public static void main(String[] args) {
      int arr[]=new int[]{6,10,9,2,5,3,7};

       Integer dp[][]=new Integer[arr.length][arr.length+1];

        System.out.println(solve(arr,0,-1,dp));
    }
    public static int solve(int arr[],int idx,int prev,Integer dp[][]){
        if(idx==arr.length){
            return 0;
        }
        if(dp[idx][prev+1]!=null)return dp[idx][prev+1];

        int skip=solve(arr,idx+1,prev,dp);

        int ans=0;
        if(prev==-1 || arr[idx]>arr[prev]){
            ans=1+solve(arr,idx+1,idx,dp);
        }
        return dp[idx][prev+1]=Math.max(skip,ans);
    }

}
