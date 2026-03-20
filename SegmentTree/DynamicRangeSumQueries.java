package SegmentTree;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicRangeSumQueries {
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
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==1){
                updatetree(0,b-1,c,0,n-1);
            }
            if(a==2){
                ans.add(sumquery(0,0,n-1,b-1,c-1));
            }
        }
        for(int num:ans){
            System.out.println(num);
        }
    }

    private static int sumquery(int idx, int l, int r, int qs, int qe) {
        if(r<qs || l>qe){
            return 0;
        }
        if(l>=qs && r<=qe){
            return st[idx];
        }
        int mid=l+(r-l)/2;
        int left=sumquery(2*idx+1,l,mid,qs,qe);
        int right=sumquery(2*idx+2,mid+1,r,qs,qe);
        return left+right;
    }

    private static void updatetree(int idx, int i, int v, int l, int r) {
        if(l==r){
            st[idx]=v;
            return;
        }
        int mid=l+(r-l)/2;

        if(i<=mid){
            updatetree(2*idx+1,i,v,l,mid);
        }
        else{
            updatetree(2*idx+2,i,v,mid+1,r);
        }

        st[idx]=st[2*idx+1]+st[2*idx+2];
    }

    private static void buildTree(int[] arr, int idx, int l, int r) {
        if(l==r){
            st[idx]=arr[l];
            return;
        }

        int mid=l+(r-l)/2;
        buildTree(arr,2*idx+1,l,mid);
        buildTree(arr,2*idx+2,mid+1,r);
        st[idx]=st[2*idx+1]+st[2*idx+2];
    }
}
//import java.io.*;
//import java.util.*;
//
//public class DynamicRangeSumQueries {
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
//            int type = Integer.parseInt(stt.nextToken());
//
//            if(type == 1){
//                int k = Integer.parseInt(stt.nextToken()) - 1;
//                long u = Long.parseLong(stt.nextToken());
//                updateTree(0, k, u, 0, n - 1);
//            }
//            else{
//                int a = Integer.parseInt(stt.nextToken()) - 1;
//                int b = Integer.parseInt(stt.nextToken()) - 1;
//                ans.append(sumQuery(0, 0, n - 1, a, b)).append("\n");
//            }
//        }
//
//        System.out.print(ans);
//    }
//
//    static long sumQuery(int idx, int l, int r, int qs, int qe){
//
//        if(r < qs || l > qe) return 0;
//
//        if(l >= qs && r <= qe) return st[idx];
//
//        int mid = l + (r - l) / 2;
//
//        long left = sumQuery(2 * idx + 1, l, mid, qs, qe);
//        long right = sumQuery(2 * idx + 2, mid + 1, r, qs, qe);
//
//        return left + right;
//    }
//
//    static void updateTree(int idx, int i, long val, int l, int r){
//
//        if(l == r){
//            st[idx] = val;
//            return;
//        }
//
//        int mid = l + (r - l) / 2;
//
//        if(i <= mid){
//            updateTree(2 * idx + 1, i, val, l, mid);
//        }
//        else{
//            updateTree(2 * idx + 2, i, val, mid + 1, r);
//        }
//
//        st[idx] = st[2 * idx + 1] + st[2 * idx + 2];
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
//        st[idx] = st[2 * idx + 1] + st[2 * idx + 2];
//    }
//}
