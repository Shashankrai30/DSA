package Recursion;
import java.util.*;

public class ratjump {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int arr[]={10,30,40,20};
        System.out.println(frof(arr,0));
    }
    public static int frof(int arr[],int idx){
        if(idx==arr.length-1){
            return 0;
        }
        int sum1=Math.abs(arr[idx]-arr[idx+1])+frof(arr,idx+1);
        if(idx==arr.length-2) return sum1;
        int sum2=Math.abs(arr[idx]-arr[idx+2])+frof(arr,idx+2);
        return Math.min(sum1,sum2);
    }
}
