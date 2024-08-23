import java.util.Scanner;
public class spiral{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.println("Enter the row and columns : ");
        r=sc.nextInt();
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the matrix :-> ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix :-> ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Spiral form :-> ");
        int count=r*c;
        int rmax,rmin,cmax,cmin;
        rmax=r-1;
        rmin=0;
        cmax=c-1;
        cmin=0;
        while(count>0){
            for(int i=cmin;i<=cmax;i++){
                System.out.print(arr[rmin][i]+" ");
                count--;
                if(count==0){
                    break;
                }
            }
            rmin++;
            for(int j=rmin;j<=rmax;j++){
                System.out.print(arr[j][cmax]+" ");
                count--;
                if(count==0){
                    break;
                }
            }
            cmax--;
            for(int k=cmax;k>=cmin;k--){
                System.out.print(arr[rmax][k]+" ");
                count--;
                if(count==0){
                    break;
                }
            }
            rmax--;
            for(int l=rmax;l>=rmin;l--){
                System.out.print(arr[l][cmin]+" ");
                count--;
                if(count==0){
                    break;
                }
            }
            cmin++;
        }
        sc.close();
    }
}
