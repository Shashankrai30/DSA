package Searching;
import java.util.*;
public class rowcolumnsorted {
    public static void main(String[] args) {
        int arr[][]=new int[][]{
                           {2,4,6},
                           {3,5,7},
                           {8,9,11}
        };
        int target=5;
        int i=0;
        int j=arr.length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==target){
                int array[]=new int[]{i,j};
                System.out.println(Arrays.toString(array));
                break;
            }
            else if(arr[i][j]<target){
                i++;
            }
            else{
                j--;
            }
        }
    }
}
