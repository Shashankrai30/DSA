package DP;

import java.util.*;

public class longestcommonsubsequence {

    static String[][] dp;

    public static void main(String[] args) {

        String str1="axyb";
        String str2="abyxb";
        dp = new String[str1.length()][str2.length()];

        String ans = helper(0, 0, str1, str2);

        System.out.println(ans.length());
        System.out.println(ans);
    }

    public static String helper(int i, int j, String str1, String str2) {

        if (i == str1.length() || j == str2.length()) {
            return "";
        }

        if (dp[i][j] != null) return dp[i][j];


        if (str1.charAt(i) == str2.charAt(j)) {
            String temp="";
            temp=temp+str1.charAt(i);
            temp=temp+(helper(i + 1, j + 1, str1, str2));
            return dp[i][j] = temp;
        }


        String skip1 = helper(i + 1, j, str1, str2);
        String skip2 = helper(i, j + 1, str1, str2);


        if (skip1.length() >= skip2.length()) {
            return dp[i][j] = skip1;
        } else {
            return dp[i][j] = skip2;
        }
    }
}
//public class longestcommonsubsequence {
//
//    public static void main(String[] args) {
//
//        String str1 = "axyb";
//        String str2 = "abyxb";
//        int n = str1.length();
//        int m = str2.length();
//
//        int[][] dp = new int[n + 1][m + 1];
//
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= m; j++) {
//                dp[i][j] = 0;
//            }
//        }
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//
//                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
//                    dp[i][j] = dp[i - 1][j - 1] + 1;
//                } else {
//                    if (dp[i - 1][j]>= dp[i][j - 1]) {
//                        dp[i][j] = dp[i - 1][j];
//                    } else {
//                        dp[i][j] = dp[i][j - 1];
//                    }
//                }
//            }
//        }
//
//        System.out.println(dp[n][m]);
//    }
//}

