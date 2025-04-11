package Recursion;

import java.util.*;

public class removeduplicate {
    public static void main(String[] args) {
        String a="aabbccd";
//        Set<Object> ans=new HashSet<>();
//        for(char c:a.toCharArray()){
//            ans.add(c);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (Object c : ans) {
//            sb.append(c);
//        }
//        System.out.println(sb.toString());
        StringBuilder str=new StringBuilder();
        str= new StringBuilder(a);
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    str.deleteCharAt(j);
                }
            }
        }
        System.out.println(str);
    }
}
