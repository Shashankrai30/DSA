import java.util.Scanner;
public class markstore{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,num;
        System.out.print("Enter the total number of students : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the marks of roll number "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the marks to filter : ");
        num=sc.nextInt();
        for(int i=0;i<x;i++){
            if(arr[i]>=num){
                System.out.print("Roll no. -> "+(i+1)+"\n");
            }
        }
        sc.close();
    }
}