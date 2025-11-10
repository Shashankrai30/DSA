package String;
import java.util.*;
public class kthlargest {
    public static void main(String[] args) {
       String str[]={"3","6","7","10"};
       Arrays.sort(str);
       for(int i=0;i<str.length;i++){
           System.out.println(str[i]);
       }
//        ArrayList<String>arr=new ArrayList<>();
//        arr.add(nums[0]);
//        for(int i=1;i<nums.length;i++){
//            if(arr.get(arr.size()-1)!=(nums[i])){
//                arr.add(nums[i]);
//            }
//        }
    }
}
