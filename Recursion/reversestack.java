package Recursion;

import java.util.Stack;

import java.util.Stack;

public class reversestack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(5);
        s.push(8);
        s.push(4);
        s.push(5);

        reverse(s);
        System.out.println(s);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        insertAtBottom(s, top);
    }

    public static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int top = s.pop();
        insertAtBottom(s, x);
        s.push(top);
    }
}

