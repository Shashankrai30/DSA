package Recursion;

public class ntoone {
    public static void main(String[] args) {
        recursion(10);
    }
    public static void recursion(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        recursion(n-1);
    }
}

