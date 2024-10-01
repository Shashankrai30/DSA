// str="abcde"  a ab abc abcd abcde b bc bcd bcde... 
import java.util.*;
public class substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        int n=str.length();
        int i=0;
        while(i<n){
            for(int j=i;j<=n;j++){
                System.out.print(str.substring(i,j)+" ");
            }
            i++;
        }
        sc.close();
    }
}
