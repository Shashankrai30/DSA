public class watertrap{
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        int waterlevel=0;
        int height=0;
        int width=1;
        int watertrap=0;
        for(int i=0;i<7;i++){
            int rmax=0;
            int lmax=0;
            for(int j=0;j<i;j++){
                if(arr[j]>rmax){
                    rmax=arr[j];
                }
            }
            for(int k=i+1;k<7;k++){
                if(arr[k]>lmax){
                    lmax=arr[k];
                }
            }
            if(rmax>lmax){
                waterlevel=lmax;
            }
            else{
                waterlevel=rmax;
            }
            height=arr[i];
            int a=(waterlevel-height)*width;
            if(a>0){
                watertrap=watertrap+a;
            }
        }
        System.out.println(watertrap);
    }
}