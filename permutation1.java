import java.util.ArrayList;

public class permutation1{
    public static void main(String[] args) {
        int numS[]={1,2,3};
        ArrayList<ArrayList<Integer>> permute=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        boolean isValid[]=new boolean[numS.length];
        helper(numS,permute,ds,isValid);
        System.out.println(permute);
    }
    public static void helper(int[] numS,ArrayList<ArrayList<Integer>> permute,ArrayList<Integer> ds,boolean isValid[]){
        if(ds.size()==numS.length){
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<ds.size();i++){
                list.add(ds.get(i));
            }
            permute.add(list);
        }
        for(int i=0;i<numS.length;i++){
            if(isValid[i]==false){
                isValid[i]=true;
                ds.add(numS[i]);
                helper(numS,permute,ds,isValid);
                isValid[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
}