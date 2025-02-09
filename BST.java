package Tree;
import java.util.*;
public class BST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node Creatingbst(Node Root, int value){
        Node temp=new Node(value);
        if(Root==null){
           Root=temp;
           return Root;
        }
        if(value>Root.data){
           Root.right=Creatingbst(Root.right,value);
        }
        else{
            Root.left=Creatingbst(Root.left,value);
        }
        return Root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
        return;
    }
    public static Boolean searching(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        else if(root.data<key){
            return searching(root.right,key);
        }
        else{
           return searching(root.left,key);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={5,4,1,3,2};
        Node root=null;
        for(int i=0;i<arr.length;i++){
           root=Creatingbst(root,arr[i]);
        }
        inorder(root);
        int key=sc.nextInt();
        System.out.println(searching(root,key));
    }
}
