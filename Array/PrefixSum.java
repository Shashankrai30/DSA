//package Array;
//import java.util.*;
//
//public class PrefixSum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int len = sc.nextInt();
//        int[] arr = new int[n+1];
//        for(int i = 1; i < n+1; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for(int i=2;i<n+1;i++){
//            arr[i]=arr[i-1]+arr[i];
//        }
//        int ans[]=new int[len];
//        for(int i = 0; i < len; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            ans[i]=helper(a,b,arr);
//        }
//        for(int num:ans){
//            System.out.println(num);
//        }
//    }
//    public static int helper(int a,int b,int arr[]){
//        return arr[b]-arr[a-1];
//    }
//}

package Array;
import java.util.*;
import java.io.*;

public class PrefixSum {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());

        long[] prefix = new long[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            prefix[i] = Long.parseLong(st.nextToken());
        }
        for(int i = 2; i <= n; i++) {
            prefix[i] += prefix[i-1];
        }

        long[] ans = new long[len];
        for(int i = 0; i < len; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            ans[i] = prefix[b] - prefix[a - 1];
        }

        for(int i = 0; i < ans.length; i++) {
            bw.write(ans[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
