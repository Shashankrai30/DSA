package TwoPointer;

import java.util.Arrays;

public class FerrisWheel {
    public static void main(String[] args) {
        int maxweight=10;
        int children[]=new int[]{7,2,3,9};
        Arrays.sort(children);
        int count=0;
        int i=0;
        int j=children.length-1;
        while(i<=j){
            if(children[i]+children[j]<=maxweight){
                i++;
                j--;
            }
            else{
                j--;
            }
            count++;
        }

        System.out.println(count);
    }
}
