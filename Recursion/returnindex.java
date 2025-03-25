package Recursion;
import java.util.*;

public class returnindex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the array : ");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        find(arr,0,target);
    }
    public static void find(int arr[],int x,int target){
        if(x>=arr.length) {
//            System.out.println("Not Found! ");
            return;
        }
       if(arr[x]==target){
           System.out.println(x);
       }
       find(arr,x+1,target);
       return;
    }
}
