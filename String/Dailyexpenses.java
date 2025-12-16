package String;
import java.util.*;
public class Dailyexpenses {
//    public static int count=0;
//    static long mod = 10000000007;

    public static void main(String[] args) {
        int arr[]=new int[]{5, 2, 3, 10, 6, 8};
        int target=10;
        Integer dp[][]=new Integer[arr.length][target+1];
        System.out.println(power(arr,0,0,target,dp));
    }
    public static int power(int arr[],int ans,int i,int tar,Integer dp[][]){
        if(ans==tar){
            return 1;
        }

        if(i==arr.length || ans>tar){
            return 0;
        }
        if(dp[i][ans]!=null)return dp[i][ans];
        int n=arr[i];
        int skip=power(arr,ans,i+1,tar,dp);
        int take=power(arr,ans+n,i+1,tar,dp);
        return dp[i][ans]=take+skip;
    }
}
