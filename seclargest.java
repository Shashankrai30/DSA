import java.util.Scanner;
public class seclargest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,max,max2;
        System.out.print("Enter the number of element : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the element : ");
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        for(int i=0;i<x;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        max2=0;
        for(int i=0;i<x;i++){
            if(arr[i]<max){
                max2=arr[i];
            }
        }
        for(int i=0;i<x;i++){
            if(arr[i]<max && arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println(max2);
        sc.close();
    }

}
