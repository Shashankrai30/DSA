package Recursion;
import java.util.*;

public class removealloccurence {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       char ch=sc.next().charAt(0);
       String ans=remove(str,ch,0);
        System.out.println(ans);
    }
    public static String remove(String str,char ch,int a){
        if(a>=str.length()){
            return "";
        }
        String ans=remove(str,ch,a+1);
        char chr =str.charAt(a);
        if(chr!=ch){
            return chr+ans;
        }
        return ans;
    }
}
