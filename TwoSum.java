package Array;

import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int tar=sc.nextInt();
        int[] arr = new int[x];
        for(int i = 0; i<x; i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<x-1;i++){
            for(int j=i+1;j<x;j++){
                if(arr[i]+arr[j]==tar){
                    arr2.add(arr[i]);
                    arr2.add(arr[j]);
                }
            }
        }
        System.out.println(arr2);
    }
}
