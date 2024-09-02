import java.util.*;
public class binarysearch{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter the size of array ");
        x=sc.nextInt();
        int num;
        System.out.println("Enter the required number ");
        num=sc.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the array ");
        for (int i = 0; i < x; i++) {
            arr[i]=sc.nextInt();
        }
        int init=0;
        int end=x-1;
        int index=0;
        while(init<=end){
            int mid=(init+end)/2;
            if(arr[mid]==num){
                index=mid;
                break;
            }
            else{
                if(arr[mid]<num){
                    init=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        System.out.println("Index : "+index);
    }
}