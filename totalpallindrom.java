public class totalpallindrom{
    public static void main(String []args){
        String str="abacded";
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String s=str.substring(i,j+1);
                StringBuilder st=new StringBuilder(s);
                if((st.reverse().toString()).equals(s) && st.length()>1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}