package Recursion;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans=reverse(str,0);
        if (str.equals(ans)) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }
    public static String reverse(String str,int a){
        if(a>=str.length()){
            return "";
        }
        String ans=reverse(str,a+1);
        char chr =str.charAt(a);
        return ans+chr;
    }
}
