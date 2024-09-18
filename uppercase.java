import java.util.*;
public class uppercase{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.print("Enter the string ");
        str=sc.nextLine();
        StringBuilder s=new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                s.append(str.charAt(i));
            }
            else{
                char v =Character.toUpperCase(str.charAt(i));
                s.append(v);
            }
        }
        String p=s.toString();
        System.out.println(p);
        sc.close();
    }
}