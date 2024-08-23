// FOR DESCENDING ORDER
import java.util.ArrayList;
import java.util.Scanner;
public class selectionsort1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> li=new ArrayList<>();
        int x;
        System.out.println("Enter how many element you want to add : ");
        x=sc.nextInt();
        System.out.println("Enter the values :-> ");
        for (int i = 0; i < x; i++){
            int v;
            v=sc.nextInt();
            li.add(i, v);
        }
        System.out.println(li);
        for(int i=0;i<x-1;i++){
            int min=i;
            for (int j = i+1; j < x; j++) {
                if(li.get(min)<li.get(j)){
                    min=j;
                }
            }
            int temp=li.get(min);
            li.set(min,li.get(i));
            li.set(i,temp);
        }
        System.out.println(li);
        sc.close();
    }
}


















