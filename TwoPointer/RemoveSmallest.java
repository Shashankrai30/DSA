package TwoPointer;

import java.util.*;

public class RemoveSmallest {
    public static void main(String[] args) {
        int n=1;
        int arr[]=new int[]{100};
        ArrayList<Integer>ans=new ArrayList<>();
        for(int x:arr){
            ans.add(x);
        }
        Collections.sort(ans);
        int i=0;
        int j=1;
        while(j<ans.size()){
            if(ans.get(j)-ans.get(i)<=1){
                ans.remove(i);
            }
            else{
                i++;
                j++;
            }
        }
        if(ans.size()==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
