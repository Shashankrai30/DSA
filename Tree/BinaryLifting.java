package Tree;

import java.util.ArrayList;
import java.util.Scanner;

class BinaryLifting{
    static int N = 200005;
    static int log = 20;
    static ArrayList<Integer>[]tree = new ArrayList[N];
    static int [][]up = new int[N][log];
    static int []depth = new int[N];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <=n;i++)
        {
            tree[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < n-1; i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            tree[u].add(v);
            tree[v].add(u);
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<log;j++)
            {
                up[i][j] = -1;
            }
        }
        dfs(1,-1);
        System.out.println(kthNodePath(4,6,5));
    }
    public  static void dfs(int node , int parent)
    {
        up[node][0] = parent;
        for(int j =  1; j < log; j++)
        {
            if(up[node][j-1]!=-1)
            {
                up[node][j] = up[up[node][j-1]][j-1];
            }
            else {
                up[node][j] = -1;
            }
        }

        for(int child : tree[node])
        {
            if(child == parent)continue;
            depth[child] = depth[node]+1;
            dfs(child,node);
        }
    }
    static int lift(int node, int k) // kth ancestor of node
    {
        for(int j = log-1; j>=0;j--)
        {
            if((k&(1<<j))!=0)
            {
                node = up[node][j];
                if(node == -1)
                    return -1;
            }
        }

        return node;
    }
    static int lca(int a,  int b)  // lca of a and b
    {
        if(depth[a] < depth[b])
        {

            int temp = a;
            a = b;
            b = temp;
        }
        int diff = depth[a] - depth[b];

        a = lift(a,diff);
        if(a == b)
            return a;
        for(int j = log-1;j>=0;j--)
        {
            if(up[a][j]!=up[b][j])
            {

                a = up[a][j];
                b = up[b][j];
            }
        }
        return up[a][0];
    }
    static int distance(int a, int b) // number of edges int path of  a and b
    {
        int lca = lca(a,b);
        return depth[a] + depth[b] - 2*depth[lca];
    }

    static int kthNodePath(int a,int b,int k)  // kth node in path between a and b
    {
        int lca = lca(a,b);

        int d1 = depth[a] - depth[lca] + 1;
        if(k <= d1)
        {
            return lift(a,k-1);
        }

        int d2 = depth[b] - depth[lca];
        int remaining = d2 - (k-d1);
        return lift(b,remaining);
    }
}
