package String;

public class permutaion {
    public static void main(String[] args) {
        String str="abc";
        permu(str,"");
//        System.out.println(str.substring(1));
    }
    public static void permu(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String s=str.substring(0,i)+str.substring(i+1);
            permu(s,ans+ch);
        }
    }
}
