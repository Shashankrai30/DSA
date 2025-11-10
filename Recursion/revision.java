package Recursion;

import java.util.ArrayList;
import java.util.*;

public class revision {
    public static void main(String[] args) {
       String str="abc";
       ArrayList<String> arr=new ArrayList<>();
       subset(arr,"",str);
        System.out.println(arr.toString());
    }

    private static void subset(ArrayList<String> arr, String s, String str) {
        if(str.isEmpty()){
            arr.add(s);
            return;
        }
        char ch=str.charAt(0);
        subset(arr,s+ch,str.substring(1));
        subset(arr,s,str.substring(1));
    }

}
