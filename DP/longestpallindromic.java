package DP;

public class longestpallindromic {

    public static void main(String[] args) {

        String s = "babad";   // example string

        int n = s.length();
        int start = 0, maxLen = 1;

        for (int i = 0; i < n; i++) {


            int l = i, r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLen) {
                    start = l;
                    maxLen = r - l + 1;
                }
                l--;
                r++;
            }

            l = i;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLen) {
                    start = l;
                    maxLen = r - l + 1;
                }
                l--;
                r++;
            }
        }

        System.out.println("Longest Palindromic Substring:");
        System.out.println(s.substring(start, start + maxLen));
    }
}

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class longestpallindromic {
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//
//        int n = s.length();
//        if (n == 1) {
//            System.out.println(s);
//            return;
//        }
//
//        int start = 0, maxLen = 1;
//
//        for (int i = 0; i < n; i++) {
//            // odd length palindrome
//            int l = i, r = i;
//            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
//                if (r - l + 1 > maxLen) {
//                    start = l;
//                    maxLen = r - l + 1;
//                }
//                l--;
//                r++;
//            }
//
//            // even length palindrome
//            l = i;
//            r = i + 1;
//            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
//                if (r - l + 1 > maxLen) {
//                    start = l;
//                    maxLen = r - l + 1;
//                }
//                l--;
//                r++;
//            }
//        }
//
//        System.out.println(s.substring(start, start + maxLen));
//    }
//}
