import java.util.*;
public class Shortestpath{
    public static double sort(String str){
        int v=0;
        int h=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e' || str.charAt(i)=='E'){
                v=v+1;
            }
            else if(str.charAt(i)=='w' || str.charAt(i)=='W'){
                v=v-1;
            }
            else if(str.charAt(i)=='n' || str.charAt(i)=='N'){
                h=h+1;
            }
            else{
                h=h-1;
            }
        }
        return  Math.sqrt((v*v)+(h*h));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter The String ");
        str=sc.nextLine();
        System.out.println(sort(str));
        sc.close();
    }
}