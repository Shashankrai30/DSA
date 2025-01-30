package Array;

import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr=new int[x];

        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int c=0;

        if(arr[0]!=arr[1]){
            System.out.println(arr[0]);
            c++;
        }
        if(arr[x-1]!=arr[x-2]){
            System.out.println(arr[x-1]);
            c++;
        }

        for(int i=1;i<x-1 && c==0 ;i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}
