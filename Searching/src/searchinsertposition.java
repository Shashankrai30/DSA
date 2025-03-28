import java.util.*;

public class searchinsertposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter the Array : ");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number : ");
        int tar = sc.nextInt();
        System.out.println(search(arr,0,arr.length-1,tar));
    }
    public static int search(int arr[],int left,int right,int tar){
        while(left<=right){
          int mid=left+(right-left)/2;
          if(tar==arr[mid]) return mid;
          else if (tar > arr[mid]) left=mid+1;
          else{
              right=mid-1;
          }
        }
        return left;
    }
}
