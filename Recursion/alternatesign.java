package Recursion;
import java.util.*;

public class alternatesign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        sout(x,0,1);
    }
    public static void sout(int x,int sum,int c){
        if(c==1){
            System.out.print(c+" - ");
            sum=1;
            sout(x,sum,c+1);
        } else if (c == x) {
            if(c%2==0){
                sum=sum-c;
                System.out.print(c+" = "+sum);
            }
            else{
                sum=sum+c;
                System.out.print(c+" = "+sum);
            }
            return;
        }
        else{
            if(c%2==0){
                System.out.print(c+" + ");
                sum=sum-c;
                sout(x,sum,c+1);
            }
            else{
                System.out.print(c+" - ");
                sum=sum+c;
                sout(x,sum,c+1);
            }
        }
        return;
    }
}
