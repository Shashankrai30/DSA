package Recursion;
import java.util.*
        ;
public class sumofdigits {
//    METHOD 1

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt();
//        System.out.println(sum(x));
//    }
//    public static int sum(int x){
//        if(x==0) return 0;
//        int a=x%10+sum(x/10);
//        return a;
//    }

//    METHOD 2

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(sum(x,0));
    }
    public static int sum(int x,int a){
        if(x==0) return a;
        a=a+x%10;
        return sum(x/10,a);
    }
}
