package Recursion;

import java.util.ArrayList;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(2);
        arr.add(7);
        arr.add(5);
        arr.add(4);
        sorting(arr);
        System.out.println(arr.toString());
    }

    public static void sorting(ArrayList<Integer>arr) {
        if(arr.size()==1){
            return;
        }
        int e=arr.remove(arr.size()-1);
        sorting(arr);
        insert(arr,e);
    }
    public static void insert(ArrayList<Integer>arr,int element){
        if(arr.size()==0 || element>=arr.get(arr.size()-1)){
            arr.add(element);
            return;
        }
        int val=arr.remove(arr.size()-1);
        insert(arr,element);
        arr.add(val);
    }
}
