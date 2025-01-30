package Array;

import java.util.*;

public class BuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[]arr=new int[x];

        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }

        int profit=0;

        for(int i=0;i<x-1;i++){
            for(int j=i+1;j<x;j++){
                if(arr[i]<arr[j]){
                    int diff=arr[j]-arr[i];
                    if(diff>profit){
                        profit=diff;
                    }
                }
            }
        }
        System.out.println(profit);
    }
}
