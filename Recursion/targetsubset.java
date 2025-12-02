package Recursion;

public class targetsubset {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(count(arr,0,7,0));
    }
    public static int count(int[] nums,int i,int tar,int sum){
        if(i==nums.length){
            if(sum==tar){
                return 1;
            }
            else{
                return 0;
            }
        }
        int inc=count(nums,i+1,tar,sum+nums[i]);
        int exc=count(nums,i+1,tar,sum);
        return inc+exc;
    }
}
