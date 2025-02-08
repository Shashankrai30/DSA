package Tree;
import java.util.*;
public class BinaryTree {
    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }
    public static class trie{
        int index=-1;
        public Node root(int arr[]){
            index++;
            if( index>=arr.length|| arr[index]==-1) return null;
            Node newnode=new Node(arr[index]);
            newnode.left= root(arr);
            newnode.right=root(arr);
            return newnode;
        }
        public void preorder(Node Root){
            if(Root==null){
                return;
            }
            System.out.println(Root.data);
            preorder(Root.left);
            preorder(Root.right);
            return;
        }
        public void inorder(Node Root){
            if(Root==null){
                return;
            }
            inorder(Root.left);
            System.out.println(Root.data);
            inorder(Root.right);
            return;
        }
        public void postorder(Node Root){
            if(Root==null){
                return;
            }
            postorder(Root.left);
            postorder(Root.right);
            System.out.println(Root.data);
        }

        public static void main(String[] args) {
            trie a=new trie();
            int[] arr ={1,2,3,-1,-1,4,-1,-1,5,-1,-1};
            Node v=a.root(arr);
            System.out.println("Root : "+v.data);
            System.out.println("Pre-Order");
            a.preorder(v);
            System.out.println("In-Order");
            a.inorder(v);
            System.out.println("Post-Order");
            a.postorder(v);
        }
    }
}

