// * * * * * * * *
// * LEETCODE-48 *
// * * * * * * * *
import java.util.Scanner;
public class rotate90 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.print("Enter the number of Rows : ");
        x=sc.nextInt();
        System.out.print("Enter the number of Columns : ");
        y=sc.nextInt();
        int arr[][]=new int[x][y];
        int arr1[][]=new int[y][x];
        for(int i=0;i<x;i++){
            System.out.println("Row "+(i+1)+" :-> ");
            for(int j=0;j<y;j++){
                System.out.print("Enter the Value : ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr1[j][i]=arr[i][j];
            }
        }
        System.out.println("Original Matrix :-> ");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<y;i++){
            int j=0;
            int k=(x-1);
            while(k>j){
                int c;
                c=arr1[i][j];
                arr1[i][j]=arr1[i][k];
                arr1[i][k]=c;
                j++;
                k--;
            }
        }
        System.out.println("Transpose of the Matrix :-> ");
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
