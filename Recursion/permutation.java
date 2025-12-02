package Recursion;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> ans=new ArrayList<>();
        helper(str,ans,"");
        System.out.println(ans);
    }
    public static void helper(String s,ArrayList<String>ans,String temp){
        if(s.length()==0){
            ans.add(temp);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            String comb=left+right;
            helper(comb,ans,temp+ch);
        }
    }
}
