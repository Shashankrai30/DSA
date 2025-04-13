package Searching;
import java.util.*;
public class Binarysearch {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(bsearch(arr,0,arr.length-1,6));
    }
   public static int bsearch(int arr[],int s,int l,int key) {
        int mid=(s+l)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(s>l){
            return -1;
        }
        else if (arr[mid]>key) {
            return bsearch(arr,s,mid-1,key);
        }
        else{
            return bsearch(arr,mid+1,l,key);
        }
   }
}
