import java.util.*;
public class stringcompress{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        String st="";
        System.out.println("Enter the String ");
        str=sc.nextLine();
        int i=0;
        int j=0;
        while(i<str.length()){
            Integer count=0;
            while(i<str.length() && str.charAt(j)==str.charAt(i)){
                count++;
                i++;
            }
            if(count>1){
                st=st+str.charAt(j);
                st=st+count;
               }
               else{
                st=st+str.charAt(j);
               }
            j=j+count;
        }
        System.out.println(st);
        sc.close();
    }
}