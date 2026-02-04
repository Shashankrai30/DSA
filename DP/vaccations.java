package DP;

public class vaccations {
    public static void main(String[] args) {
        int reward[][]=new int[][]{{10, 40, 70},{20,50,80},{30,60,90}};

        Integer dp[][]=new Integer[reward.length][3];

        int ans=Math.max(reward[0][0]+helper(1,0,reward,dp),Math.max(reward[0][1]+helper(1,1,reward,dp),reward[0][2]+helper(1,2,reward,dp)));
        System.out.println(ans);
    }
    public static int helper(int i,int j,int reward[][],Integer dp[][]){
        if(i==reward.length)return 0;

        if(dp[i][j]!=null)return dp[i][j];
        int ans=0;
        if(j!=0){
            ans=Math.max(ans,reward[i][0]+helper(i+1,0,reward,dp));
        }
        if(j!=1){
            ans=Math.max(ans,reward[i][1]+helper(i+1,1,reward,dp));
        }
        if(j!=2){
            ans=Math.max(ans,reward[i][2]+helper(i+1,2,reward,dp));
        }
        return dp[i][j]=ans;
    }
}
