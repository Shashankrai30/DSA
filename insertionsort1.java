import java.util.Scanner;
public class insertionsort1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter the size of array : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the value :-> ");
        for (int i = 0; i < x; i++) {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < x; i++) {
            if(i==x-1){
                break;
            }
            int j=i+1;
            int k=i;
            while(k>=0){
                if(arr[j]<arr[k]){
                    int c=arr[j];
                    arr[j]=arr[k];
                    arr[k]=c;
                    j--;
                }
                count++;
                k--;
            }
        }
        System.out.println(count);
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}