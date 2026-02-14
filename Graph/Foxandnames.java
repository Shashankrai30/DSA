package Graph;

import java.io.*;
import java.util.*;

public class Foxandnames {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[26];

        for (int i = 0; i < n - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];

            // Prefix condition
            if (word1.length() > word2.length() && word1.startsWith(word2)) {
                out.println("Impossible");
                out.flush();
                return;
            }

            for (int k = 0; k < Math.min(word1.length(), word2.length()); k++) {
                char u = word1.charAt(k);
                char v = word2.charAt(k);

                if (u != v) {
                    adj.get(u - 'a').add(v - 'a');
                    indegree[v - 'a']++;
                    break;
                }
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 26; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!q.isEmpty()) {
            int node = q.poll();
            sb.append((char) (node + 'a'));

            for (int next : adj.get(node)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    q.offer(next);
                }
            }
        }

        if (sb.length() == 26) {
            out.println(sb.toString());
        } else {
            out.println("Impossible");
        }

        out.flush();
    }
}