package Recursion;

public class countvowels {
    public static void main(String[] args) {
        String str="abcdAEIOuhj";
        System.out.println(count(str));
    }
    public static int count(String str){
        if(str.isEmpty()){
            return  0;
        }
        int c=0;
        if(str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u' || str.charAt(0)=='A' || str.charAt(0)=='E' || str.charAt(0)=='I' || str.charAt(0)=='O' || str.charAt(0)=='U' ){
            c++;
        }
        return c+count(str.substring(1));
    }
}
