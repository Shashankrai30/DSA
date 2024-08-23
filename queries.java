import java.util.Scanner;
public class queries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.print("Enter the number of elements : ");
        x=sc.nextInt();
        System.out.print("Enter number of Queries : ");
        y=sc.nextInt();
        int arr[]=new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the element : ");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i]+" ");
        }
        while(y>0){
            int l,u;
            System.out.print("\nEnter the starting of the range : ");
            l=sc.nextInt();
            System.out.print("Enter the ending of the range : ");
            u=sc.nextInt();
            int sum=0;
            for(int i=(l-1);i<=(u-1);i++){
                sum=sum+arr[i];
            }
            System.out.println("The sum of the elements is : "+sum);
            y--;
        }
        
    }
}
