package Recursion;
import java.util.*;

import java.util.Scanner;

public class returnindexinarray {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt();
//        int arr[]=new int[x];
//        System.out.println("Enter the array : ");
//        for(int i=0;i<x;i++){
//            arr[i]=sc.nextInt();
//        }
//        int target=sc.nextInt();
//        ArrayList<Integer> arrl=new ArrayList<>();
//        find(arr,0,target,arrl);
//    }
//    public static void find(int arr[],int x,int target,ArrayList<Integer>arrl){
//        if(x>=arr.length) {
////            System.out.println("Not Found! ");
//            System.out.println(arrl);
//            return;
//        }
//        if(arr[x]==target){
//            arrl.add(x);
//        }
//        find(arr,x+1,target,arrl);
//        return;
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the array : ");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        ArrayList<Integer> arrl=new ArrayList<>();
        arrl=find(arr,0,target);
        System.out.println(arrl);
    }
    public static ArrayList<Integer> find(int arr[],int s,int target){
        if(s>=arr.length){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer>New=new ArrayList<>();
        if(arr[s]==target){
            New.add(s);
        }
        New.addAll(find(arr,s+1,target));
        return New;
    }
}
