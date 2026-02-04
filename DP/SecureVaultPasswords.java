package DP;

public class SecureVaultPasswords {
    public static void main(String[] args) {
        int num1=1;
        int num2=100;
        int k=3;
        num1=num1-1;
        String s1=String.valueOf(num1);
        String s2=String.valueOf(num2);
        Integer dp1[][][][]=new Integer[s1.length()][2][2][11];
        Integer dp2[][][][]=new Integer[s2.length()][2][2][11];
        int ans=solve(s2,0,1,0,0,0,k,dp2)-solve(s1,0,1,0,0,0,k,dp1);
        System.out.println(ans);
    }
    public static int solve(String num,int idx,int tight,int start,int prev,int n,int k,Integer dp[][][][]) {
        if (idx == num.length()) {
            if (n % k == 0) {
                return 1;
            }
            return 0;
        }
        if (dp[idx][tight][start][prev] != null) return dp[idx][tight][start][prev];
        int limit = (tight == 1) ? num.charAt(idx) - '0' : 9;
        int ans = 0;
        for (int i = 0; i <= limit; i++) {
            int newtight = (tight == 1 && i == limit) ? 1 : 0;
            int updated = n * 10 + i;
            if (start == 0) {
                if (i == 0) {
                    ans = ans + solve(num, idx + 1, newtight, 0, i, updated, k, dp);
                } else {
                    ans = ans + solve(num, idx + 1, newtight, 1, i, updated, k, dp);
                }
            } else {
                if (i != prev) {
                    ans = ans + solve(num, idx + 1, newtight, 1, i, updated, k, dp);
                }
            }
        }
        return dp[idx][tight][start][prev] = ans;
    }
}
