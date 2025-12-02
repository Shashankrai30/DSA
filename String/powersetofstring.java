package String;

public class powersetofstring {
    public static void main(String[] args) {
        String str="abc";
        power(str,"",0);
    }
    public static void power(String str,String ans,int i){
        if(i==str.length()){
            System.out.print(ans+ " ");
            return;
        }
        char ch=str.charAt(i);
        power(str,ans,i+1);
        power(str,ans+ch,i+1);
        return;
    }
}
