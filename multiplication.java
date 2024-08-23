import java.util.*;
public class multiplication{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1,c1;
        System.out.print("Enter the number of row of matrix 1 : ");
        r1=sc.nextInt();
        System.out.print("Enter the number of columns of matrix 1 : ");
        c1=sc.nextInt();
        int r2,c2;
        System.out.print("Enter the number of row of matrix 2 : ");
        r2=sc.nextInt();
        System.out.print("Enter the number of columns of matrix 2 : ");
        c2=sc.nextInt();
        int arr[][]=new int[r1][c1];
        int arr1[][]=new int[r2][c2];
        System.out.println("First Matrix :");
        for (int i = 0; i < r1; i++) {
            System.out.println("Enter the value for Row 1 :-> ");
            for (int j = 0; j < c1; j++) {
                System.out.print("Enter the value : ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Second Matrix :");
        for (int i = 0; i < r2; i++) {
            System.out.println("Enter the value for Row 1 :-> ");
            for (int j = 0; j < c2; j++) {
                System.out.print("Enter the value : ");
                arr1[i][j]=sc.nextInt();
            }
        }
        int arr2[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int sum=0;
                for(int k=0;k<c1;k++){
                    sum=sum+arr[i][k]*arr1[k][j];
                }
                arr2[i][j]=sum;
            }
        }
        System.out.println("Resultant Matrix -> ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}