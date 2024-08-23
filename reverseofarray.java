import java.util.Scanner;
public class reverseofarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter the number of elements : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the element : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Our original array is : ");
        for(int i=0;i<x;i++){
            System.out.println(arr[i]);
        }
        int arr2[]=new int[x];
        int i=0,j=(x-1);
        while(j>=0){
            arr2[j]=arr[i];
            j--;
            i++;
        }       
        System.out.println("Updated array is : ");
        for(int k=0;k<x;k++){
            System.out.println(arr2[k]);
        }
        sc.close();
    }
}