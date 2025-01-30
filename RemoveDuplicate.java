package Array;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<x-1;i++){
            int c=0;
            for (Integer integer : arr2) {
                if (arr[i] == integer) {
                    c++;
                }
            }
           if(c==0){
               arr2.add(arr[i]);
           }
        }
        System.out.println(arr2);
    }
}
