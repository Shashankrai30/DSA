import java.util.Scanner;
public class minimumofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,min;
        System.out.print("Enter the total number of elements : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the number : ");
            arr[i]=sc.nextInt();
        }
        min=arr[0];
        for(int i=0;i<x;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum of all element is "+min);
        sc.close();
    }
    
}
