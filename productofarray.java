import java.util.Scanner;
public class productofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,product=1;
        System.out.print("Enter the number of elements : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the element : ");
            arr[i]=sc.nextInt();
            product=product*arr[i];
        }
        System.out.println("The product of all element of array is "+product);
        sc.close();
    }
}
