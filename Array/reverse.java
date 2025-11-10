package Array;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        recursive(0,arr,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void recursive(int i,int arr[],int len){
        if(i>len){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[len];
        arr[len]=temp;
        recursive(i+1,arr,len-1);
    }
}
