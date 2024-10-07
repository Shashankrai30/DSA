public class quicksort{
    public static void sort(int arr[],int si,int ei) {
        if(si>=ei){
            return;
        }
        int pivt=breakdown(arr,si,ei);
        sort(arr,si,pivt-1);
        sort(arr,pivt+1,ei);
    }
    public static int breakdown(int arr[],int si,int ei) {
        int i=si-1;
        int pivot=arr[ei];
        for(int j=si;j<=ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[ei];
        arr[ei]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,5,2,3,8,5};
        sort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}