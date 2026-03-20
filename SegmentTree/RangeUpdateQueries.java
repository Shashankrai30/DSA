package SegmentTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RangeUpdateQueries {

    static long[] seg;
    static long[] lazy;
    static long[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        seg = new long[4 * n];
        lazy = new long[4 * n];

        buildtree(0, 0, n - 1);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int a = Integer.parseInt(st.nextToken()) - 1;
                int b = Integer.parseInt(st.nextToken()) - 1;
                long u = Long.parseLong(st.nextToken());

                update(0, 0, n - 1, a, b, u);
            } else {
                int k = Integer.parseInt(st.nextToken()) - 1;
                sb.append(query(0, 0, n - 1, k)).append('\n');
            }
        }

        System.out.print(sb.toString());
    }

    static void buildtree(int idx, int l, int r) {
        if (l == r) {
            seg[idx] = arr[l];
            return;
        }

        int mid = (l + r) / 2;
        buildtree(2 * idx + 1, l, mid);
        buildtree(2 * idx + 2, mid + 1, r);
        seg[idx] = seg[2 * idx + 1] + seg[2 * idx + 2];
    }

    static void push(int idx, int l, int r) {
        if (lazy[idx] != 0) {
            seg[idx] += (r - l + 1L) * lazy[idx];

            if (l != r) {
                lazy[2 * idx + 1] += lazy[idx];
                lazy[2 * idx + 2] += lazy[idx];
            }

            lazy[idx] = 0;
        }
    }

    static void update(int idx, int l, int r, int qs, int qe, long val) {
        push(idx, l, r);

        if (r < qs || l > qe) {
            return;
        }

        if (qs <= l && r <= qe) {
            lazy[idx] += val;
            push(idx, l, r);
            return;
        }

        int mid =l+ (r-l) / 2;
        update(2 * idx + 1, l, mid, qs, qe, val);
        update(2 * idx + 2, mid + 1, r, qs, qe, val);

        seg[idx] = seg[2 * idx + 1] + seg[2 * idx + 2];
    }

    static long query(int idx, int l, int r, int pos) {
        push(idx, l, r);

        if (l == r) {
            return seg[idx];
        }

        int mid = l+(r-l) / 2;
        if (pos <= mid) {
            return query(2 * idx + 1, l, mid, pos);
        } else {
            return query(2 * idx + 2, mid + 1, r, pos);
        }
    }
}
