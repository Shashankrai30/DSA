package Recursion;
import java.util.*;

public class subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                System.out.print(str.substring(i, j + 1) + " ");
            }
            System.out.println();
        }
    }
}
