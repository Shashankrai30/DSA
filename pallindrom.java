import java.util.Scanner;
public class pallindrom {
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
        int i=0,j=(x-1);
        int mid,count=0;
        if(x%2!=0){
            mid=(x-1)/2;
        }
        else{
            mid=x/2;
        }
        while(i<mid){
            if(arr[i]!=arr[j]){
                count++;
            }
            i++;j--;
        }
        if(count==0){
            System.out.println("Array is palindrome ");
        }
        else{
            System.out.println("Array is not palindrome ");
        }
        sc.close();
    }
}