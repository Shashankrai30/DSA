import java.util.Scanner;

public class sorting2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter the number of elements : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the value: ");
            arr[i]=sc.nextInt();
        }
         int j=0;
         int k=(x-1);
         int arr2[]=new int[x];
         for(int i=0;i<x;i++){
            if(arr[i]%2==0){
                arr2[j]=arr[i];
                j++;
            }
            else{
                arr2[k]=arr[i];
                k--;
            }
         }
        for (int i = 0; i < x; i++) {
            System.out.print(arr2[i]+" ");
        }
        sc.close();
    }
}
