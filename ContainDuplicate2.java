package Array;

import java.util.*;

public class ContainDuplicate2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr=new int[x];
        int k= sc.nextInt();

        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }

        int c=0;

        for(int i=0;i<x-1 && c==0;i++){
            for(int j=i+1;j<x && j<=i+k;j++){
                if(arr[i]==arr[j] && (i-j>=-k && i-j<=k)){
                    System.out.println("True");
                    c++;
                }
            }
        }

        if(c==0){
            System.out.println("False");
        }
    }
}
