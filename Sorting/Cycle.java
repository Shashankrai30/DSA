package Sorting;

import java.util.Arrays;

public class Cycle {
    public static void main(String[] args) {
        int arr[]=new int[]{5,6,3,4,1,2};
        int i=0;
        while(i<arr.length){
            if(arr[i]==i+1){
                i++;
            }
            else{
                int temp=arr[i];;
                arr[i]=arr[temp-1];
                arr[temp-1]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
//public class Cycle {
//    public static void main(String[] args) {
//        int arr[]=new int[]{3,0,1};
//        int i=0;
//        while(i<arr.length){
//            if(arr[i]>=arr.length || arr[i]==i+1){
//                i++;
//            }
//            else{
//                int temp=arr[i];
//                arr[i]=arr[temp];
//                arr[temp]=temp;
//            }
//        }
//        for(int index=0;index<arr.length;index++){
//            if(arr[index]!=index){
//                System.out.println(index);
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}