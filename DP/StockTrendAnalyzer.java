package DP;

import java.util.ArrayList;
import java.util.Collections;

public class StockTrendAnalyzer {
    public static void main(String[] args) {
        int arr[]=new int[]{10,22,9,33,21,50};
        ArrayList<Integer> ans = getLIS(arr);
        System.out.println(ans);
    }
    public static ArrayList<Integer> getLIS(int arr[]) {
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        int dp[]=new int[n];
        int parent[]=new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            parent[i] = -1;
        }

        int max=1;

        for(int cur=1;cur<n;cur++){
            for(int prev=0;prev<cur;prev++){
                if(arr[cur]>arr[prev] && dp[cur]<dp[prev]+1){
                    dp[cur]=dp[prev]+1;
                    max=Math.max(dp[cur],max);
                    parent[cur]=prev;
                }
            }
        }
        int last=0;

        for(int i=0;i<n;i++){
            if(dp[i]==max){
                last=i;
                break;
            }
        }
        for(int i=last;i!=-1;i=parent[i]){
            ans.add(arr[i]);
        }
        Collections.sort(ans);
        return ans;
    }
}
