package DP;

import java.util.*;

public class Luckycommonsubsequence {

    static String s, p, t;
    static int n, m;
    static HashMap<String, String> dp = new HashMap<>();

    public static void main(String[] args) {


        s = "AJKEQSLOBSROFGZ";
        p = "OVGURWZLWVLUXTH";
        t = "OZ";

        n = s.length();
        m = p.length();

        String ans = solve(0, 0, "");

        if (ans.length() == 0)
            System.out.println("0");
        else
            System.out.println(ans);
    }

    static String solve(int i, int j, String temp) {


        if (temp.contains(t)) return "";


        if (i == n || j == m) return temp;


        String lastFew;
        if (temp.length() > t.length()) {
            lastFew = temp.substring(temp.length() - t.length());
        } else {
            lastFew = temp;
        }


        String key = i + "|" + j + "|" + lastFew;

        if (dp.containsKey(key))
            return dp.get(key);


        String skipS = solve(i + 1, j, temp);


        String skipP = solve(i, j + 1, temp);

        String best = skipS.length() >= skipP.length() ? skipS : skipP;


        if (s.charAt(i) == p.charAt(j)) {
            String take = solve(i + 1, j + 1, temp + s.charAt(i));
            if (take.length() > best.length()) {
                best = take;
            }
        }

        dp.put(key, best);
        return best;
    }
}
