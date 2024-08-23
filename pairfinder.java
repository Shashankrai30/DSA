import java.util.Scanner;
public class pairfinder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,tsum;
        System.out.print("Enter the number of element : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the element : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target sum : ");
        tsum=sc.nextInt();
        for(int i=0;i<x;i++){
            for(int j=i;j<x;j++){
                if(arr[i]+arr[j]==tsum){
                    System.out.println(arr[i]+" And "+arr[j]);
                }
            }
        }
        sc.close();
    }
}
