import java.util.Scanner;
public class unique{
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
        for(int i=0;i<x;i++){
            int c=0;
            for(int j=0;j<x;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c==1){
                System.out.println("We have Successfully find the unique element - "+arr[i]);
            }
        }
        sc.close();
    }

}