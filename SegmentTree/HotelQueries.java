package SegmentTree;
import java.io.*;
import java.util.*;

public class HotelQueries {
    static int[] seg;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        seg = new int[4*n];
        build(0, 0, n-1, arr);

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            int r = Integer.parseInt(st.nextToken());
            int ans = query(0, r, 0, n-1);
            bw.write((ans +1)+ " ");
        }

        bw.flush();
        bw.close();
    }

    private static void build(int idx, int l, int r, int[] arr) {
        if(l == r) {
            seg[idx] = arr[l];
            return;
        }

        int mid = l + (r - l) / 2;
        build(2*idx+1, l, mid, arr);
        build(2*idx+2, mid+1, r, arr);

        seg[idx] = Math.max(seg[2*idx+1], seg[2*idx+2]);
    }

    private static int query(int idx, int val, int l, int r) {
        if(seg[idx] < val) {
            return -1;
        }

        if(l == r) {
            seg[idx] = seg[idx] - val;
            return l;
        }

        int mid = l + (r - l) / 2;
        int ans;
        if(val <= seg[2*idx+1]) {
            ans = query(2*idx+1, val, l, mid);
        } else {
            ans = query(2 * idx + 2, val, mid + 1, r);
        }
        seg[idx] =  Math.max(seg[2*idx+1], seg[2*idx+2]);

        return ans;
    }
}