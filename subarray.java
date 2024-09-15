//sub array [1,2,3,4,5,6]
//(1) (1,2) (1,2,3) (1,2,3,4 ) (1,2,3,4,5) (1,2,3,4,5,6)
import java.util.*;
public class subarray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter the size of array ");
        x=sc.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the array ");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++){
           for (int j=i; j<x; j++) {
            System.out.print("(");
               for (int k =i; k <=j; k++) {
                   System.out.print(arr[k]+" ");
               }
               System.out.print(")");
           }
           System.out.println();
        }
    }
}