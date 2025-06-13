package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int arr[]=new int[]{5,1,3,8,4,6,9,0,5};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int k=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[k]){
                    k=j;
                }
            }
            int temp=arr[k];
            arr[k]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
