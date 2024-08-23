import java.util.Scanner;
public class diffofinsices{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,esum,osum,diff=0;
        esum=0;
        osum=0;
        System.out.print("Enter the number of elements : ");
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the element : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++){
            if(i%2==0){
                esum=esum+arr[i];
            }
            else{
                osum=osum+arr[i];
            }
        }
        if(esum>=osum){
            diff=esum-osum;
        }
        else{
            diff=osum-esum;
        }
        System.out.println("The difference of sum of elements at even index and odd index is : "+diff);
        sc.close();
    }
}

