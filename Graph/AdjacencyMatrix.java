package Graph;
import java.util.*;

public class AdjacencyMatrix {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int V=sc.nextInt();
        int e=sc.nextInt();

        int arr[][]=new int[V+1][V+1];

        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();

            arr[s][d]=1;
            arr[d][s]=1;
        }
        for(int i=1;i<=V;i++){
            for(int j=1;j<=V;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }

}
