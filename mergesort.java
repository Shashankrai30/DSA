public class mergesort{
    public static void mergesor(int arr[],int si,int ei){
        if(si==ei){
            return;
        }
        int mid =si+(ei-si)/2;
        mergesor(arr,si,mid);
        mergesor(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei) {
        int i=si;
        int j=mid+1;
        int k=0;
        int temp[]=new int[ei-si+1];
        while(i<=mid && j<=ei){
            if(arr[i]>arr[j]){
                temp[k]=arr[j];
                k++;j++;
            }
            else{
                temp[k]=arr[i];
                k++;i++;
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;k++;
        }
        while(j<=ei){
            temp[k]=arr[j];
            j++;k++;
        }
        for(int l=0;l<temp.length;l++){
            arr[si+l]=temp[l];
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,6,9,8};
        mergesor(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}