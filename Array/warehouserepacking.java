package Array;

public class warehouserepacking {
    public static void main(String[] args) {
        int arr[]=new int[]{1, 5, 8, 9};
        int n=4;
        int i=0;
        int j=arr.length-1;
        int max=0;
        while(i<=j){
            if(i+1+j+1<=n){
                int temp=arr[i]+arr[j];
                max=Math.max(max,temp);
                j--;
                i++;
            }
            else{
                j--;
            }

        }
        System.out.println(max);
    }
}
