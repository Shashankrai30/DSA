package Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int arr[]=new int[]{5,1,3,8,4,6,9,0,5};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int k=i;
            int j=i+1;
            while(k>=0){
                if(arr[k]>arr[j]){
                    int temp=arr[k];
                    arr[k]=arr[j];
                    arr[j]=temp;
                    j--;
                    k--;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
