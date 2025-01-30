package Array;

import java.util.*;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int[]arr=new int[x+y];
        int[]arr1=new int[y];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<y;j++){
            arr1[j]=sc.nextInt();
        }
        int k=0;
        for(int i=x;i<x+y;i++){
            arr[i]=arr1[k];
            k++;
        }
        for(int i=0;i<x+y-1;i++){
            for(int j=i+1;j<x+y;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<x+y;i++){
            System.out.println(arr[i]);
        }
    }
}
