package Array;

import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        ArrayList<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<x;i++){
            List<Integer> arr1=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    arr1.add(1);
                }
                else{
                    int a=arr.get(i-1).get(j-1)+arr.get(i-1).get(j);
                    arr1.add(a);
                }
            }
            arr.add(arr1);
        }
        System.out.println(arr);
    }
}
