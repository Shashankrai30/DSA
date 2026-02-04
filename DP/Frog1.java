package DP;

public class Frog1 {
    public static void main(String[] args) {
        int stones[]=new int[]{10,30,40,20};
        Integer dp[]=new Integer[stones.length];
        System.out.println(helper(0,stones,dp));
    }
    public static int helper(int i, int stones[],Integer dp[]){
        if(i==stones.length-1)return 0;
        if(i>=stones.length)return Integer.MAX_VALUE/2;

        if(dp[i]!=null)return dp[i];

        int one=Math.abs(stones[i]-stones[i+1])+helper(i+1,stones,dp);
        int two=Integer.MAX_VALUE;
        if((i+2)<stones.length){
            two=Math.abs(stones[i]-stones[i+2])+helper(i+2,stones,dp);
        }
        return dp[i]= Math.min(one,two);
    }
}
