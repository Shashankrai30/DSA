import java.util.*;
public class diagonal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the size of array ");
        x=sc.nextInt();
        y=sc.nextInt();
        int arr[][]=new int[x][y];
        System.out.println("Enter the array ");
        for(int i=0;i<x;i++){
            for (int j = 0; j < y; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(i==j || i+j==(x-1)){
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}