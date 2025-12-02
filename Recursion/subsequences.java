package Recursion;
import java.util.*;

public class subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        subseq(str," ");
    }
    public static void subseq(String str,String ans){
        if(str.isEmpty()){
            System.out.print(ans+" ");
            return;
        }
        char ch=str.charAt(0);
        String rem=str.substring(1);
        subseq(rem,ans);
        subseq(rem,ans+ch);
    }
}
