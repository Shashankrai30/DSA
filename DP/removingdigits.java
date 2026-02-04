package DP;

public class removingdigits {

    public static void main(String[] args) {

        int n = 27; // example number

        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;

            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                temp /= 10;

                if (digit != 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - digit]);
                }
            }
        }

        System.out.println("Minimum steps to reduce " + n + " to 0:");
        System.out.println(dp[n]);
    }
}

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class removingdigits {
//
//    public static void main(String[] args) throws Exception {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        int[] dp = new int[n + 1];
//
//        dp[0] = 0;
//
//        for (int i = 1; i <= n; i++) {
//            dp[i] = Integer.MAX_VALUE;
//
//            int temp = i;
//            while (temp > 0) {
//                int digit = temp % 10;
//                temp /= 10;
//
//                if (digit != 0) {
//                    dp[i] = Math.min(dp[i], 1 + dp[i - digit]);
//                }
//            }
//        }
//
//        System.out.println(dp[n]);
//    }
//}
