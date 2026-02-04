package DP;

public class rodcutting {
    public static void main(String[] args) {

    }
     public int cutRod(int[] price) {
       Integer dp[][]=new Integer[price.length][price.length+1];
       return solve(price.length-1,price.length,price,dp);

     }
     public static int solve(int idx,int len,int price[],Integer dp[][]){
         if(idx==0){
              return len * price[idx];
         }
         if(dp[idx][len]!=null)return dp[idx][len];
         int skip=solve(idx-1,len,price,dp);
         int take=(int)-1e9;
         if(idx+1<=len){
             take=price[idx]+solve(idx,len-(idx+1),price,dp);
         }
         return dp[idx][len]=Math.max(skip,take);
     }
}
