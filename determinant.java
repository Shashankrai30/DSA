import java.util.*;
public class determinant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        if(n==1){
            System.out.println(arr[0][0]);
        }
        else if(n==2){
            System.out.println(arr[0][0]*arr[1][1]-arr[0][1]*arr[1][0]);
        }
        else{
            int det=0;
        int m=0;
        for(int i=0;i<n;i++){
            int p=0;
            for(int j=0;j<n&&j!=i;j++){
                for(int k=0;k<3&&(k!=i && k!=j);k++){
                    p=arr[m][i]*(arr[m+1][j]*arr[m+2][k]-arr[m+1][k]*arr[m+2][j]);
                    break;
                }
                break;
            }
            if(i%2==0){
                det=det+p;
            }
            else{
                det=det-p;
            }
        }
        System.out.println(det);
        }
    }
}
