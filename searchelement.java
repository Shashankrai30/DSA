import java.util.Scanner;
public class searchelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z=0;
        System.out.print("Enter how many elements you want to store : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the number : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element you want to search : ");
        y=sc.nextInt();
        for(int i=0;i<x;i++){
            if(arr[i]==y){
                System.out.print("The element is found and its index is "+i);
                z++;
            }
        }
        if(z==0){
            System.out.print("The element is not present in the array ");
        }
        sc.close();
    }
    
}
