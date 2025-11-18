package Recursion;

public class alternatesum {
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(521));
    }
    public static int alternateDigitSum(int n) {
        int num=0;
        while(n>0){
            num=num*10+n%10;
            n=n/10;
        }
        System.out.println(num);
        int c=0;
        int sum=0;
        while(num>0){
            if(c%2==0){
                sum=sum+num%10;
            }
            else{
                sum=sum-num%10;
            }
            c++;
            num=num/2;
        }
        return sum;
    }
}
