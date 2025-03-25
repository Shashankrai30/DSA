package Recursion;
import java.util.*;
public class faboniccaseries {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for (int i=0;i<x;i++){
            arr.add(fabonicca(i));
        }
        System.out.println(arr);
        System.out.println(fabonicca(x-1));
    }
    public static int fabonicca(int i){
        if(i==0) return 0;
        if(i==1) return 1;
        else return fabonicca(i-1)+fabonicca(i-2);
    }

}
