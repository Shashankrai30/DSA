import java.util.Scanner;
public class maximumelement {
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
                System.out.print("Enter the element : ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int max=arr[0][0];
        int index=0,count=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                count++;
                if(arr[i][j]>max){
                    max=arr[i][j];
                    index=count;
                }
            }
        }
        System.out.print("The maximum element is "+max+" and its index is "+index);
        sc.close();
    }
}
