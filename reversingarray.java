import java.util.Scanner;
public class reversingarray{
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
        int i=0,j=(x-1);
        int mid;
        if(x%2!=0){
            mid=(x-1)/2;
        }
        else{
            mid=x/2;
        }
        while(i<mid){
            int c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
            i++;j--;
        }
        System.out.println("Updated array is : ");
        for(int k=0;k<x;k++){
            System.out.println(arr[k]);
        }
        sc.close();
    }
}