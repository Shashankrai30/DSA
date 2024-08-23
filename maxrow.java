import java.util.Scanner;
public class maxrow{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.print("Enter the number of rows : ");
        x=sc.nextInt();        
        System.out.print("Enter the number of columns : ");
        y=sc.nextInt();
        int arr[][]=new int[x][y];
        for(int i=0;i<x;i++){
            System.out.println("Row "+(i+1)+" :-> ");
            for(int j=0;j<y;j++){
                System.out.print("Column "+(j+1)+" : ");
                arr[i][j]=sc.nextInt();
            }
        }
        int r=0;
        int row=0;
        for(int i=0;i<x;i++){
           int sum=0;
            for(int j=0;j<y;j++){
                sum=sum+arr[i][j];
            }
            if(sum>r){
                r=sum;
                row=(i+1);
            }
        }
        System.out.println(row+" row has the maximum sum");
        sc.close();
    }
}