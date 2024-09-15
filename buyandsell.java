public class buyandsell{
    public static void main(String[] args) {
        int arr[]={7,1,3,5,6,4};
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<6;i++){
            if(buyprice<arr[i]){
                int profit=arr[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }
            else{
                buyprice=arr[i];
            }
        }
        System.out.println(maxprofit);
    }
}