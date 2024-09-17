import java.util.*;
public class pallindrome{
    public static boolean pallindrom(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter the String ");
        str=sc.nextLine();
        boolean s=pallindrom(str);
        System.out.println(s);
        sc.close();
    }
}