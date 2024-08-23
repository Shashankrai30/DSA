import java.util.Scanner;
public class reverserow{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.print("Enter the number of row : ");
        r=sc.nextInt();
        System.out.print("Enter the number of columns : ");
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        for (int i = 0; i < r ;i++){
            System.out.println("Enter the value for Row "+i);
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the value : ");
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            int a=0;
            int b=(c-1);
            while(a<=b){
                int x = arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=x;
                a++;b--;
            }
        }
        for (int i = 0; i < r; i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

