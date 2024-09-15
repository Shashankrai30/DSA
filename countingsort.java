import java.util.Scanner;

public class countingsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter the size of array ");
        x=sc.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the array ");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<x;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int count[]=new int[largest+1];
        for(int j=0;j<x;j++){
            count[arr[j]]++;
        }
        int a=0;
        for(int j=0;j<largest+1;j++){
            while(count[j]>0){
                arr[a]=j;
                a++;
                count[j]--;
            }
        }
        // for(int i=0;i<5;i++){
        //     for(int j=i+1;j<5;j++){
        //         if(arr[i]>arr[j]){
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //         }
        // }
        // for(int i=0;i<5;i++){
        //     int min=i;
        //     for(int j=i+1;j<5;j++){
        //         if(arr[min]>arr[j]){
        //             min=j;
        //         }
        //     }
        //     int temp=arr[min];
        //     arr[min]=arr[i];
        //     arr[i]=temp;
        // }
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<=i;j++){
        //         if(arr[i+1]<arr[j]){
        //             int temp=arr[i+1];
        //             arr[i+1]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        for(int i=0;i<x;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
