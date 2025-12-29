package TwoPointer;

import java.util.Arrays;

import java.util.*;

public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tar = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = check(arr, tar);

        if (ans[0] == -1) {
            System.out.println(-1);
        } else {
            System.out.println(ans[0] + " " + ans[1]);
        }
    }

    private static int[] check(int[] arr, int tar) {
        int[] temp = arr.clone();
        Arrays.sort(temp);

        int i = 0, j = temp.length - 1;
        int x = -1, y = -1;


        while (i < j) {
            int sum = temp[i] + temp[j];
            if (sum == tar) {
                x = temp[i];
                y = temp[j];
                break;
            } else if (sum < tar) {
                i++;
            } else {
                j--;
            }
        }

        if (x == -1) return new int[]{-1, -1};

        int idx1 = -1, idx2 = -1;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == x && idx1 == -1) {
                idx1 = k + 1; // 1-based index
            } else if (arr[k] == y && idx2 == -1) {
                idx2 = k + 1;
            }
        }

        return new int[]{idx1, idx2};
    }
}
