package DP;

// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         Integer dp[][]=new Integer[nums.length][nums.length+1];
//        return helper(0,-1,nums,dp);
//     }
//     public static int helper(int i,int prev,int nums[],Integer dp[][]){
//         if(i==nums.length)return 0;

//         if(dp[i][prev+1]!=null)return dp[i][prev+1];
//         int skip=helper(i+1,prev,nums,dp);
//         int take=0;
//         if(prev==-1 || nums[i]>nums[prev]){
//             take=1+helper(i+1,i,nums,dp);
//         }
//         return dp[i][prev+1]= Math.max(take,skip);
//     }
// }
// //  Tabular
public class lis {
    public static void main(String[] args) {
        int num[]=new int[]{};
        System.out.println( lengthOfLIS(num));
    }
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n + 1][n + 1];

        for (int i = n - 1; i >= 0; i--) {
            for (int prev = i - 1; prev >= -1; prev--) {

                int skip = dp[i + 1][prev + 1];
                int take = 0;

                if (prev == -1 || nums[i] > nums[prev]) {
                    take = 1 + dp[i + 1][i + 1];
                }

                dp[i][prev + 1] = Math.max(take, skip);
            }
        }

        return dp[0][0];
    }
}

// | Method      | Time  | Space |
// | Memoization | O(n²) | O(n²) |
// | Tabulation  | O(n²) | O(n²) |


