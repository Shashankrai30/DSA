package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class arraydistribution {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 4, 2, 5, 2, 3};
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                first.add(arr[i]);
            } else if (i == 1) {
                second.add(arr[i]);
            } else {
                int gif = 0;
                for (int x : first) {
                    if (x > arr[i]) {
                        gif++;
                    }
                }
                int gis = 0;
                for (int x : second) {
                    if (x > arr[i]) {
                        gis++;
                    }
                }
                if (gif > gis) {
                    first.add(arr[i]);
                } else if (gis > gif) {
                    second.add(arr[i]);
                } else {
                    if (first.size() > second.size()) {
                        second.add(arr[i]);
                    } else {
                        first.add(arr[i]);
                    }
                }
            }
        }
        int ans[] = new int[arr.length];
        int i = 0;
        for (int x : first) {
            ans[i++] = x;
        }
        for (int x : second) {
            ans[i++] = x;
        }
        System.out.println(Arrays.toString(ans));
    }
}
