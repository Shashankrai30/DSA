package Searching;

import java.util.Arrays;

public class FactoryMachines {
    public static void main(String[] args) {
        int machine[]=new int[]{3,2,5};
        int target=7;
        Arrays.sort(machine);
        long i=1;
        long j=(long)machine[0]*target;

        while(i<j){
            long mid=i+(j-i)/2;
            long temp=count(machine,mid);
            if(temp>=target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        System.out.println(i);
    }
    public static long count(int arr[],long m){
        long count=0;
        for(int i=0;i<arr.length;i++){
            count=count+m/arr[i];
        }
        return count;
    }
}
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//import java.util.Arrays;
//
//public class FactoryMachines {
//
//    public static void main(String[] args) throws Exception {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int n = Integer.parseInt(st.nextToken());
//        long target = Long.parseLong(st.nextToken());
//
//        int[] machine = new int[n];
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            machine[i] = Integer.parseInt(st.nextToken());
//        }
//
//        Arrays.sort(machine);
//
//        long i = 1;
//        long j = (long) machine[0] * target; // maximum possible time
//
//        while (i < j) {
//            long mid = i + (j - i) / 2;
//            long produced = count(machine, mid);
//
//            if (produced >= target) {
//                j = mid;
//            } else {
//                i = mid + 1;
//            }
//        }
//
//        System.out.println(i);
//    }
//
//    public static long count(int[] arr, long time) {
//        long count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            count += time / arr[i];
//        }
//        return count;
//    }
//}
