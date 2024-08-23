import java.util.Scanner;
public class max1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.print("Enter the number of Rows : ");
        x=sc.nextInt();
        System.out.print("Enter the number of Columns : ");
        y=sc.nextInt();
        int arr[][]=new int[x][y];
        for(int i=0;i<x;i++){
            System.out.print("Row "+(i+1)+" :-> ");
            for(int j=0;j<y;j++){
                System.out.print("Enter the Value(0 or 1) : ");
                arr[i][j]=sc.nextInt();
            }
        }
        int max=0;
        int row=0;
        for(int i=0;i<x;i++){
           int count=0;
            for(int j=0;j<y;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                row=(i+1);
            }
        }
        System.out.println(row+" has maximum numbers of 1's ");
        sc.close();
    }
}

        