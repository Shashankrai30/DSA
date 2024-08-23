import java.util.Scanner;
public class basic2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,num;
        System.out.print("Enter the number of rows :-> ");
        x=sc.nextInt();
        System.out.print("Enter the number of columns :-> ");
        y=sc.nextInt();
        System.out.print("Enter the number to be filled on each indices :-> ");
        num=sc.nextInt();
        int arr[][]=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[i][j]=num;
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();


    }
}
