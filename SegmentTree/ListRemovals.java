package SegmentTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ListRemovals {
    static long sgt[];
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        long arr[]=new long[n];
        long pos[]=new long[n];
        sgt=new long[4*n];
        st=new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            arr[i]=Long.parseLong(st.nextToken());
        }

        st=new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            pos[i]=Long.parseLong(st.nextToken());
        }

        buildtree(0,0,n-1);

        for(int i=0;i<n;i++){
            long target=pos[i];
            int ans=query(0,0,n-1,target);
            sb.append(arr[ans]+" ");
        }
        System.out.println(sb);
    }

    private static int query(int idx, int left, int right, long target) {
        if(left==right){
            sgt[idx]=0;
            return left;
        }
        int mid=left+(right-left)/2;
        int leftchild=2*idx+1;
        int rightchild=2*idx+2;
        int ans;
        if(sgt[leftchild]>=target){
            ans=query(leftchild,left,mid,target);
        }
        else{
            ans=query(rightchild,mid+1,right,target-sgt[leftchild]);
        }
        sgt[idx]=sgt[leftchild]+sgt[rightchild];
        return ans;
    }

    private static void buildtree(int idx, int left, int right) {
        if(left==right){
            sgt[idx]=1;
            return;
        }
        int mid=left+(right-left)/2;
        int leftchild=2*idx+1;
        int rightchild=2*idx+2;
        buildtree(leftchild,left,mid);
        buildtree(rightchild,mid+1,right);
        sgt[idx]=sgt[leftchild]+sgt[rightchild];

    }

}
