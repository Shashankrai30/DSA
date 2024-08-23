import java.util.Scanner;
public class addingmatrix2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.print("Enter the number of rows : ");
        x=sc.nextInt();
        System.out.print("Enter the number of columns : ");
        y=sc.nextInt();
        int arr[][]=new int[x][y];
        int arr1[][]=new int[x][y];
        System.out.println("Matrix 1 : ");
        for(int i=0;i<x;i++){
            System.out.println("Row "+(i+1)+": ");
            for(int j=0;j<y;j++){
                System.out.print("Enter the value : ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 2 : ");
        for(int i=0;i<x;i++){
            System.out.println("Row "+(i+1)+": ");
            for(int j=0;j<y;j++){
                System.out.print("Enter the value : ");
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("Updated Matrix after Addition : ");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(arr[i][j]+"  ");
                }
                System.out.println();
        }
        sc.close();
    }
}