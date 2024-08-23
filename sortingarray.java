import java.util.Scanner;
public class sortingarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter the number of elements : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the value(0 or 1): ");
            arr[i]=sc.nextInt();
        }int count=0;
        for(int i=0;i<x;i++){
            if(arr[i]==0){
                count++;
            }
        }
        int i=0;
        while(count>0){
            arr[i]=0;
            i++;
            count--;
        }
        while(i<x){
            arr[i]=1;
            i++;
        }
        for (int j = 0; j < x; j++) {
            System.out.print(arr[j]+" ");
        }
        sc.close();
    }
}
