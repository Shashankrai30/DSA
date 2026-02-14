package Graph;

import java.util.*;

public class AlienDictionary {
    public static void main(String[] args) {
        String words[]=new String[]{"baa", "abcd", "abca", "cab", "cad"};
        System.out.println(findOrder(words));
    }
    public static String findOrder(String[] words) {
        // code here
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<26;i++){
            list.add(new ArrayList<>());
        }
        int indegree[]=new int[26];
        Arrays.fill(indegree,-1);

        for(String word:words){
            for(char ch:word.toCharArray()){
                indegree[ch-'a']=0;
            }
        }

        for(int i=0;i<words.length-1;i++){
            String word1=words[i];
            String word2=words[i+1];
            for(int j=0;j<Math.min(word1.length(),word2.length());j++){
                if(word1.charAt(j)!=word2.charAt(j)){
                    list.get(word1.charAt(j)-'a').add(word2.charAt(j)-'a');
                    indegree[word2.charAt(j)-'a']++;
                    break;
                }
            }
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<26;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }

        StringBuilder str=new StringBuilder();
        while(!q.isEmpty()){
            int node=q.poll();
            str.append((char)(node +'a'));
            for(int n:list.get(node)){
                indegree[n]--;
                if(indegree[n]==0){
                    q.offer(n);
                }
            }
        }
        for(int i=0;i<26;i++){
            if(indegree[i]>0)return "";
        }
        return str.toString();
    }
}
