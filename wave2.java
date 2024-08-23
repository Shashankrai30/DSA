import java.util.Scanner;
public class wave2 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.print("Enter the Number of Rows : ");
        x=sc.nextInt();
        System.out.print("Enter the Number of Columns : ");
        y=sc.nextInt();
        int arr[][]=new int[x][y];
        for(int i=0;i<x;i++){
            System.out.println("Row "+i+" :-> ");
            for(int j=0;j<y;j++){
                System.out.print("Enter the value : ");
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Original form : ");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int arr1[][]=new int[y][x];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr1[j][i]=arr[i][j];
            }
        }
        System.out.println("Wave form : ");
        for(int i=0;i<y;i++){
            if(i%2==0){
                for(int j=(x-1);j>=0;j--){
                    System.out.print(arr1[i][j]+" ");
                }
            }
            else{
                for(int j=0;j<x;j++){
                    System.out.print(arr1[i][j]+" ");
                }
            }
        }
        sc.close();
    } 
}
