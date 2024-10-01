import java.util.*;
public class toggle{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        StringBuilder str=new StringBuilder(st);
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                char s=Character.toLowerCase(str.charAt(i));
                str.setCharAt(i, s);
            }
            else{
                char s=Character.toUpperCase(str.charAt(i));
                str.setCharAt(i, s);
            }
        }
        System.out.println(str);
    }
}