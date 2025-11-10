package String;

public class reversestring {
    public static void main(String[] args) {
        String str="abcde";
        System.out.println(reverse(str,""));
    }
    public static String reverse(String str,String ans){
        if(str.length()==0) {
            return ans;
        }
        ans=ans+str.charAt(str.length()-1);
        return reverse(str.substring(0,str.length()-1),ans);
    }
}
