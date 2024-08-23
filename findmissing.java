import java.util.Scanner;
public class findmissing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter the total number of elements : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the element : ");
            arr[i]=sc.nextInt();
        }
        int ll,ul;
        System.out.print("Enter the lower limit : ");
        ll=sc.nextInt();
        System.out.print("Enter the upper limit : ");
        ul=sc.nextInt();
        for(int i=ll;i<=ul;i++){
            int count=0;
            for(int j=0;j<x;j++){
                if(i==arr[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.println(i+" is the missing element ");
            }
        }
        sc.close();
    }
}