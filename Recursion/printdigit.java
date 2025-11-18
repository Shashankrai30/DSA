package Recursion;

public class printdigit {
    public static void main(String[] args) {
        System.out.println(digit(1236));
    }
    public static int digit(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem+digit(n/10);
    }
}
