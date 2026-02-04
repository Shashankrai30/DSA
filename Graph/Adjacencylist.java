package Graph;
import java.util.*;
public class Adjacencylist {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int V=sc.nextInt();
        int e=sc.nextInt();

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        for(int i=0;i<=V;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            list.get(u).add(v);
            list.get(v).add(u);
        }

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }

}
