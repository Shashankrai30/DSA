package Array;

import java.util.*;

public class PlusOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<x;i++){
            int a=sc.nextInt();
            arr.add(a);
        }
        int c=0;
        for(int i=x-1;i>=0;i--){
            if(arr.get(i)==9){
                arr.set(i,0);
            }
            else{
                arr.set(i,arr.get(i)+1);
                c++;
                break;
            }
        }
        if(c==0){
            arr.set(0,1);
            arr.add(0);
        }
        System.out.println(arr);
    }
}
