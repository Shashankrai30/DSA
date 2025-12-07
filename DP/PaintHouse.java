package DP;
import java.util.*;
public class PaintHouse {
    public static void main(String[] args) {
        int costs[][]={{17,2,17},{16,16,5},{14,3,19}};
        int last1=costs[0][0];
        int last2=costs[0][1];
        int last3=costs[0][2];
        for(int i=1;i<3;i++){
            int cur1=Math.min(last2,last3)+costs[i][0];
            int cur2=Math.min(last1,last3)+costs[i][1];
            int cur3=Math.min(last2,last1)+costs[i][2];
            last1=cur1;
            last2=cur2;
            last3=cur3;
        }
        System.out.println(Math.min(last1,Math.min(last2,last3)));
    }
}
