import java.util.Scanner;
public class firstrepeating{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter the number of elements : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the value : ");
            arr[i]=sc.nextInt();
        }
        int s=-1;
        for(int i=0;i<x;i++){
            for(int j=i+1;j<x;j++){
                if(arr[i]==arr[j]){
                    s=arr[i];
                    break;
                }
                if(s!=-1){
                    break;
                }
            }
        }
        System.out.println(s);
        sc.close();
    }
}