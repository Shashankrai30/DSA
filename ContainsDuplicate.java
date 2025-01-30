package Array;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr=new int[x];

        for(int i=0;i<x;i++){
            arr[i]= sc.nextInt();
        }

        int c=0;
        Arrays.sort(arr);

        for(int i=0;i<x-1 & c==0;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("True");
                c++;
            }
        }

       if(c==0){
           System.out.println("False");
       }
    }
}
