import java.util.ArrayList;
import java.util.Scanner;
public class bubblesort2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> li=new ArrayList<>();
        int x;
        System.out.print("Enter the Total number you want to add : ");
        x=sc.nextInt();
        System.out.println("Enter the value :-> ");
        for (int i = 0; i < x; i++) {
            int v;
            v=sc.nextInt();
            li.add(i,v);
        }
        System.out.println(li);
        int p=0;
        for (int i = 0; i < (x-1); i++) {
            int k=0;
            int count=0;
            for (int j = 1; j <= (x-1-i); j++) {
                if(li.get(k)<li.get(j)){
                    int c=li.get(k);
                    li.set(k, li.get(j));
                    li.set(j, c);
                    count++;
                    p++;
                }
                k++;
            }
            if(count==0){
                break;
            }
        }
        System.out.println(li);
        System.out.println("Total number of swapping : "+p);
    }
}