import java.util.*;
public class prefixsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("enter the number of element : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the value : ");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<x;i++){
            sum=arr[i]+sum;
            arr[i]=sum;
        }
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
