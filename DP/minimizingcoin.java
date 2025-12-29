package DP;

public class minimizingcoin {
    public static void main(String[] args) {
        int coins[]=new int[]{1,5,7};
        int target=11;
        Integer dp[]=new Integer[target+1];
        System.out.println(helper(coins,target,dp));
    }
    public static int helper(int coins[],int target,Integer dp[]){
        if(target==0)return 0;

        if(target<0 )return 1000;
        if(dp[target]!=null) return dp[target];
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<coins.length;j++){
            ans=Math.min(ans,1+helper(coins,target-coins[j],dp));
        }
        if(ans==Integer.MAX_VALUE)return dp[target]=-1;
        return dp[target]=ans;
    }
}
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//import java.util.Arrays;
//
//public class minimizingcoin {
//
//    static final int INF = (int) 1e9;
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int n = Integer.parseInt(st.nextToken());
//        int x = Integer.parseInt(st.nextToken());
//
//        int coins[] = new int[n];
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            coins[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int dp[] = new int[x + 1];
//        Arrays.fill(dp, INF);
//        dp[0] = 0;
//
//        for (int sum = 1; sum <= x; sum++) {
//            for (int c : coins) {
//                if (sum - c >= 0) {
//                    dp[sum] = Math.min(dp[sum], 1 + dp[sum - c]);
//                }
//            }
//        }
//
//        System.out.println(dp[x] >= INF ? -1 : dp[x]);
//    }
//}
