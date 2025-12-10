package Array;

public class highestratio {
    public static void main(String[] args) {
        int price[]=new int[]{7,5,2,11};
        int rating[]=new int[]{3,4,1,3};
        double ratio=-1.0;
        int index=price.length;
        for(int i=0;i<price.length;i++){
            double temp= (double) rating[i] / price[i];
            if(temp>ratio) {
                index = i;
            }
            ratio=temp;
        }
        System.out.println(index);
    }
}
