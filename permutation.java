import java.util.ArrayList;
public class permutation {
    public static void printM(String sc,String t,ArrayList<String> str) {
        if(sc.equals("")){
            str.add(t);
        }
        for(int i=0;i<sc.length();i++){
            char ch=sc.charAt(i);
            String rem=sc.substring(0,i)+sc.substring(i+1);
            printM(rem,t+ch,str);
        }
    }
    public static void main(String[] args) {
        String sc="abc";
        ArrayList<String> str=new ArrayList<>();
        printM(sc,"",str);
        for(String c:str){
            System.out.println(c);
        }
    }
}
