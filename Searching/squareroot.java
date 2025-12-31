package Searching;

public class squareroot {
    public static void main(String[] args) {
        System.out.println(1);
        int n=10;
        int i=0;
        int j=n;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(mid*mid==n){
                System.out.println(mid);
                return;
            }
            else if(mid*mid<n){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        System.out.println(j);
    }
}
