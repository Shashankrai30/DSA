import java.util.ArrayList;
import java.util.Collections;
public class reversearraylist{
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(0);
        l1.add(1);
        l1.add(3);
        l1.add(2);
        l1.add(4);
        l1.add(5);
        System.out.println(l1);
        Collections.sort(l1);
        Collections.reverse(l1);
        System.out.println(l1);
    }
}