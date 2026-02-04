package DP;

public class knapsack1 {
    public static void main(String[] args) {
        int weight[]=new int[]{3,4,5};
        int value[]=new int[]{30,50,60};
        int target=8;

        Integer  dp[][]=new Integer[weight.length][target+1];
        System.out.println(helper(0,weight,value,target,dp));
    }
    public static int helper(int i,int weight[],int value[],int target,Integer dp[][]){
        if(i== weight.length)return 0;

        if(target==0)return 0;

        if(dp[i][target]!=null)return dp[i][target];
        int skip=helper(i+1,weight,value,target,dp);
        int take=Integer.MIN_VALUE;
        if(weight[i]<=target) {
            take = value[i] + helper(i + 1, weight, value, target - weight[i],dp);
        }
        return dp[i][target]=Math.max(skip,take);
    }
}
