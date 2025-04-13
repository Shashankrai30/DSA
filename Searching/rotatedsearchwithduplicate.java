package Searching;
import java.util.*;
public class rotatedsearchwithduplicate {
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,4,0,1};
        int j=0;
        int l=arr.length-1;
        int p=-1;
        if (arr.length != 1) {
            while (j <= l) {
                int mid = j + (l - j) / 2;
                if ((mid < (arr.length - 1)) && (arr[mid] > arr[mid + 1])) {
                    p = arr[mid];
                    break;
                }

                // Pivot check: arr[mid - 1] > arr[mid]
                if (mid > 0 && arr[mid - 1] > arr[mid]) {
                    p = arr[mid - 1];
                    break;
                }
                if (arr[j] == arr[mid] && arr[mid] == arr[l]) {
                    if (l<arr.length-1 && arr[j] > arr[j + 1]) {
                        p = arr[j];
                        break;
                    }
                    j++;
                    if (j>0 && arr[l] < arr[l - 1]) {
                        p = arr[l - 1];
                        break;
                    }
                    l--;
                } else if (arr[j] < arr[mid] || arr[j] == arr[mid] && arr[mid] > arr[l]) {
                    j = mid + 1;
                } else {
                    l = mid - 1;
                }
            }
            System.out.println(p);
        } else {
            System.out.println(arr[0]);
            return;
        }
    }
}
