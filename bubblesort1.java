import  java.util.ArrayList;
import java.util.Scanner;
public class bubblesort1 {
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter how many elements you want to add : ");
        x=sc.nextInt();
        System.out.println("Enter the array :-> ");
        for(int i=0;i<x;i++){
            int v;
            v=sc.nextInt();
            li.add(i, v);
        }
        System.out.println(li);
        for(int j=1;j<=(x-1);j++){
            int k=0;
            for(int l=1;l<=(x-j);l++){
                if(li.get(k)>li.get(l)){
                    int c=li.get(k);
                    li.set(k,li.get(l));
                    li.set(l,c);  
                }
                k++;
            }
        }
        System.out.println(li);
        sc.close();
    }
}
