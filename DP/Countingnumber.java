package DP;

import java.io.*;
import java.util.*;

public class Countingnumber {

    static String s;
    static long[][][][] dp;
    static boolean[][][][] vis;

    static long dfs(int pos, int prev, int tight, int started) {
        if (pos == s.length()) {
            return 1;
        }

        int p = prev + 1; // shift -1 → 0, 0–9 → 1–10

        if (vis[pos][p][tight][started]) {
            return dp[pos][p][tight][started];
        }

        vis[pos][p][tight][started] = true;
        long res = 0;

        int limit = tight == 1 ? s.charAt(pos) - '0' : 9;

        for (int d = 0; d <= limit; d++) {
            int newTight = (tight == 1 && d == limit) ? 1 : 0;

            if (started == 0 && d == 0) {
                // still leading zeros
                res += dfs(pos + 1, -1, newTight, 0);
            } else {
                // number has started
                if (started == 0 || d != prev) {
                    res += dfs(pos + 1, d, newTight, 1);
                }
            }
        }

        dp[pos][p][tight][started] = res;
        return res;
    }

    static long count(long x) {
        if (x < 0) return 0;

        s = Long.toString(x);
        int n = s.length();

        dp = new long[n][11][2][2];
        vis = new boolean[n][11][2][2];

        return dfs(0, -1, 1, 0);
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        long a = fs.nextLong();
        long b = fs.nextLong();

        long ans = count(b) - count(a - 1);
        System.out.println(ans);
    }

    // Fast input
    static class FastScanner {
        byte[] buffer = new byte[1 << 16];
        int ptr = 0, len = 0;
        InputStream in;

        FastScanner(InputStream in) {
            this.in = in;
        }

        int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            boolean neg = false;
            if (c == '-') {
                neg = true;
                c = read();
            }

            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return neg ? -val : val;
        }
    }
}
