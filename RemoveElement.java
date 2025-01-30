package Array;

import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr=new int[x];
        int tar=sc.nextInt();
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<x;i++){
            if(arr[i]!=tar){
                arr2.add(arr[i]);
            }
        }
        System.out.println(arr2);
    }
}
