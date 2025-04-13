package Searching;
import java.util.*;
public class ceilingofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int []arr=new int[x];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=arr.length-1;
        int tar=sc.nextInt();
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==tar){
                System.out.println(arr[mid]);
            }
             else if (arr[mid]<tar) {
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        System.out.println(arr[i]);
    }
}
