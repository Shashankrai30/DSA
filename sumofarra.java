import java.util.Scanner;
public class sumofarra{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,sum=0;
        System.out.print("Enter how many elements you want to store : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the number : ");
            arr[i]=sc.nextInt();
        }
        for(int item:arr){
            sum=sum+item;
        }
        System.out.println("The sum of all elements of the array is - > "+sum);
        sc.close();
    }
}
