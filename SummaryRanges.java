package Array;

import java.util.*;

public class SummaryRanges {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
        int x=sc.nextInt();
        int[] array=new int[x];

        for(int i=0;i<x;i++){
            array[i]=sc.nextInt();
        }

        Arrays.sort(array);

        int c=array[0];

        for(int i=1;i<x;i++){
            if(array[i]!=array[i-1]+1){
                if(c!=array[i-1]){
                    arr.add("\""+String.valueOf(c)+" -> "+String.valueOf(array[i-1])+"\"");
                }
                else{
                    arr.add("\""+String.valueOf(c)+"\"");
                }
                c=array[i];
            }
        }
        if(c!=array[x-1]){
            arr.add("\""+String.valueOf(c)+" -> "+String.valueOf(array[x-1])+"\"");
        }
        else{
            arr.add("\""+String.valueOf(c)+"\"");
        }

        System.out.println(arr);
    }
}
