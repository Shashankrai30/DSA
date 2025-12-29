package TwoPointer;

import java.util.Arrays;

public class numberofpairs {
    public static void main(String[] args) {
        int l=9;
        int r=13;
        long arr[]=new long[]{2,5,5,1,1};
        Arrays.sort(arr);
        System.out.println(count(arr,r)-count(arr,l-1));
    }
    static long count(long[] arr, long x) {
        int i = 0, j = arr.length - 1;
        long cnt = 0;

        while (i < j) {
            if (arr[i] + arr[j] <= x) {
                cnt += (j - i);
                i++;
            } else {
                j--;
            }
        }
        return cnt;
    }
}
