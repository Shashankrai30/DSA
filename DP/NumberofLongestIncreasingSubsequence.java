package DP;

public class NumberofLongestIncreasingSubsequence {
    public static void main(String[] args) {
        int nums[]=new int[]{1,3,5,4,7};
        System.out.println(findNumberOfLIS(nums));
    }
    public static int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        int count[]=new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            count[i] = 1;
        }

        int max=1;
        for(int cur=1;cur<n;cur++){
            for(int prev=0;prev<cur;prev++){
                if(nums[cur]>nums[prev] && dp[cur]<dp[prev]+1){
                    dp[cur]=dp[prev]+1;
                    count[cur]=count[prev];
                    max=Math.max(dp[cur],max);
                }
                else if(nums[cur]>nums[prev]&& dp[cur]==dp[prev]+1){
                    count[cur]+=count[prev];
                }
                max=Math.max(max,dp[cur]);
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(dp[i]==max)c=c+count[i];
        }
        return c;
    }
}

// | Method      | Time  | Space |
// | Tabulation  | O(n²) | O(n) |