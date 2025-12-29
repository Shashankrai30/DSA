package Recursion;
public class TOH {
    public static StringBuilder str=new StringBuilder();
    public static void main(String[] args) {

        toh(2,1,2,3);
        System.out.println(str.length()/2);
        for(int i=0;i<str.length();i=i+2){
            System.out.print(str.charAt(i)+" ");
            System.out.println(str.charAt(i+1));
        }
    }
    public static void toh(int n,int S,int H,int D){
        if(n==1){
            str.append(S);
            str.append(D);
            return;
        }
        toh(n-1,S,D,H);
        str.append(S);
        str.append(D);
        toh(n-1,H,S,D);
    }
}
