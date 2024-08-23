// 1 2 3 4 5 ->  2 times rotate
// 4 5 1 2 3

import java.util.Scanner;
public class rotatearray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter the number of elements : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the value : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array -> ");
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
        int rotate;
        System.out.println();
        System.out.print("Enter how many times you want to rotate : ");
        rotate=sc.nextInt();
        int arr2[]=new int[x];
        int j=x-rotate;
        int i=0;
        while(j<x){
            arr2[i]=arr[j];
            j++;
            i++;
        }
        int k=rotate;
        int l=0;
        while(l<x-rotate){
            arr2[k]=arr[l];
            k++;
            l++;
        }
        
        System.out.println("Rotated array ");
        for(int m=0;m<x;m++){
            System.out.print(arr2[m]+" ");
        }
        sc.close();
    }
}
