import java.util.Scanner;
public class target2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter the number of element : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the element : ");
            arr[i]=sc.nextInt();
        }
        int sum;
        System.out.print("Enter the target element : ");
        sum=sc.nextInt();
        for(int i=0;i<x;i++){
            for(int j=i;j<x;j++){
                for(int k=j;k<x;k++){
                    if(arr[i]+arr[j]+arr[k]==sum){
                        System.out.println(arr[i]+" - "+arr[j]+" - "+arr[k]);
                    }
                }
            }
        }
        sc.close();
    }
}
