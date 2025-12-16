package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Carbonoffset {
    public static void main(String[] args) {
        int arr[]=new int[]{31,26,33,21,40};
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i:arr){
            temp.add(i);
        }
        while(temp.size()>1){
            Collections.sort(temp);
            temp.set(temp.size()-1,temp.get(temp.size()-1)-temp.get(temp.size()-2));
            temp.remove(temp.size()-2);
        }
        if(temp.size()==0){
            System.out.println(0);
        }
        else{
            System.out.println(temp.get(0));
        }

    }
}
