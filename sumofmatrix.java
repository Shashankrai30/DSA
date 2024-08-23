import java.util.Scanner;
public class sumofmatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.print("Enter the number of rows : ");
        x=sc.nextInt();
        System.out.print("Enter the number of columns : ");
        y=sc.nextInt();
        int arr[][]=new int[x][y];
        System.out.println("Matrix 1 : ");
        for(int i=0;i<x;i++){
            System.out.println("Row "+(i+1)+": ");
            for(int j=0;j<y;j++){
                System.out.print("Enter the value : ");
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
               sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
