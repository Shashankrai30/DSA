import java.util.Scanner;
public class indexwiseupdate{
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
        System.out.println("Original elements : ");
        for(int i=0;i<x;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<x;i++){
            if(i%2==0){
                arr[i]=arr[i]+10;
            }
            else{
                arr[i]=2*arr[i];
            }
        }
        System.out.println("Updated elements : ");
        for(int i=0;i<x;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
