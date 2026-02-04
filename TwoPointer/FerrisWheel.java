package TwoPointer;

import java.util.Arrays;

public class FerrisWheel {
    public static void main(String[] args) {
        int maxweight=10;
        int children[]=new int[]{7,2,3,9};
        Arrays.sort(children);
        int count=0;
        int i=0;
        int j=children.length-1;
        while(i<=j){
            if(children[i]+children[j]<=maxweight){
                i++;
                j--;
            }
            else{
                j--;
            }
            count++;
        }

        System.out.println(count);
    }
}
//import java.io.*;
//import java.util.*;
//
//public class FerrisWheel{
//    public static void main(String[] args) throws Exception {
//        FastScanner fs = new FastScanner(System.in);
//
//        int n = fs.nextInt();
//        int maxweight = fs.nextInt();
//
//        int[] children = new int[n];
//        for (int i = 0; i < n; i++) {
//            children[i] = fs.nextInt();
//        }
//
//        Arrays.sort(children);
//
//        int count = 0;
//        int i = 0, j = n - 1;
//
//        while (i <= j) {
//            if (children[i] + children[j] <= maxweight) {
//                i++;
//                j--;
//            } else {
//                j--;
//            }
//            count++;
//        }
//
//        System.out.println(count);
//    }
//
//    // -------- Fast Scanner --------
//    static class FastScanner {
//        private final byte[] buffer = new byte[1 << 16];
//        private int ptr = 0, len = 0;
//        private final InputStream in;
//
//        FastScanner(InputStream in) {
//            this.in = in;
//        }
//
//        private int readByte() throws IOException {
//            if (ptr >= len) {
//                len = in.read(buffer);
//                ptr = 0;
//                if (len <= 0) return -1;
//            }
//            return buffer[ptr++];
//        }
//
//        int nextInt() throws IOException {
//            int c;
//            while ((c = readByte()) <= ' ') ;
//            boolean neg = false;
//            if (c == '-') {
//                neg = true;
//                c = readByte();
//            }
//            int val = 0;
//            while (c > ' ') {
//                val = val * 10 + (c - '0');
//                c = readByte();
//            }
//            return neg ? -val : val;
//        }
//    }
//}
