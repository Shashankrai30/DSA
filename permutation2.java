import java.util.ArrayList;
class permutation2 {
    public static void main(String[]args) {
        int []numS={1,2,3};
        ArrayList<ArrayList<Integer>> permute=new ArrayList<>();
            // List<Integer> ds=new ArrayList<>();
            // boolean isvalid[]=new boolean[nums.length];
        helper(numS,0,permute);
        System.out.println(permute);
    }
    public static void helper(int[] numS,int idx,ArrayList<ArrayList<Integer>> permute){
        int n=numS.length;
        if(idx==n){
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(numS[i]);
            }
            permute.add(list);
            return;
        }
        for(int i=idx;i<n;i++){
            int temp=numS[i];
            numS[i]=numS[idx];
            numS[idx]=temp;
            helper(numS,idx+1,permute);
            int tmp=numS[i];
            numS[i]=numS[idx];
            numS[idx]=tmp;
        }
    }
}