import java.util.Scanner;
public class maxofarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter how many elements you want to store : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the number : ");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<x;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum of all the elements is -> "+max);
        sc.close();
    }

}
