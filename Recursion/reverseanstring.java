package Recursion;
import java.util.*;

public class reverseanstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans=reverse(str,0);
        System.out.println(ans);
    }
    public static String reverse(String str,int a){
       if(a==str.length()){
           return "";
       }
       String ans=reverse(str,a+1);
       char ch=str.charAt(a);
       return ans+ch;
    }
}
