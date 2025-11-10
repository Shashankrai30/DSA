package Array;

public class kthlargest {
    public static void main(String[] args) {
        int arr[]={1,7,8,2,4,6,5,3};
        int k=5;
        for(int i=0;i<arr.length-k;i++){
            int temp=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[temp]>arr[j]){
                    temp=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[temp];
            arr[temp]=t;
        }
        System.out.println(arr[k-1]);
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
    }
}
