package SegmentTree;

//import java.io.*;
//import java.util.*;
//
//public class StaticRangeMinimumQueries {
//
//    static long[] st;
//
//    public static void main(String[] args) throws Exception {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer stt = new StringTokenizer(br.readLine());
//
//        int n = Integer.parseInt(stt.nextToken());
//        int q = Integer.parseInt(stt.nextToken());
//
//        long[] arr = new long[n];
//
//        stt = new StringTokenizer(br.readLine());
//        for(int i = 0; i < n; i++){
//            arr[i] = Long.parseLong(stt.nextToken());
//        }
//
//        st = new long[4 * n];
//        buildTree(arr, 0, 0, n - 1);
//
//        StringBuilder ans = new StringBuilder();
//
//        for(int i = 0; i < q; i++){
//
//            stt = new StringTokenizer(br.readLine());
//
//
//            int a = Integer.parseInt(stt.nextToken()) - 1;
//            int b = Integer.parseInt(stt.nextToken()) - 1;
//            ans.append(minQuery(0, 0, n - 1, a, b)).append("\n");
//        }
//
//        System.out.print(ans);
//    }
//
//    static long minQuery(int idx, int l, int r, int qs, int qe){
//
//        if(r < qs || l > qe) return Integer.MAX_VALUE;
//
//        if(l >= qs && r <= qe) return st[idx];
//
//        int mid = l + (r - l) / 2;
//
//        long left = minQuery(2 * idx + 1, l, mid, qs, qe);
//        long right = minQuery(2 * idx + 2, mid + 1, r, qs, qe);
//
//        return Math.min(left ,right);
//    }
//
//    static void buildTree(long[] arr, int idx, int l, int r){
//
//        if(l == r){
//            st[idx] = arr[l];
//            return;
//        }
//
//        int mid = l + (r - l) / 2;
//
//        buildTree(arr, 2 * idx + 1, l, mid);
//        buildTree(arr, 2 * idx + 2, mid + 1, r);
//
//        st[idx] = Math.min(st[2 * idx + 1] ,st[2 * idx + 2]);
//    }
//}
import java.util.ArrayList;
import java.util.Scanner;

public class StaticRangeMinimumQueries {
    static int[] st;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        st=new int[4*n];
        buildTree(arr,0,0,n-1);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<q;i++){
            int b=sc.nextInt();
            int c=sc.nextInt();

            ans.add(minquery(0,0,n-1,b-1,c-1));
        }
        for(int num:ans){
            System.out.println(num);
        }
    }

    private static int minquery(int idx, int l, int r, int qs, int qe) {
        if(r<qs || l>qe){
            return Integer.MAX_VALUE;
        }
        if(l>=qs && r<=qe){
            return st[idx];
        }
        int mid=l+(r-l)/2;
        int left=minquery(2*idx+1,l,mid,qs,qe);
        int right=minquery(2*idx+2,mid+1,r,qs,qe);
        return Math.min(left,right);
    }

    private static void buildTree(int[] arr, int idx, int l, int r) {
        if(l==r){
            st[idx]=arr[l];
            return;
        }

        int mid=l+(r-l)/2;
        buildTree(arr,2*idx+1,l,mid);
        buildTree(arr,2*idx+2,mid+1,r);
        st[idx]=Math.min(st[2*idx+1],st[2*idx+2]);
    }
}
