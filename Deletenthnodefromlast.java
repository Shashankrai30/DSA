package LinkedList;
import java.util.*;
//Given that given node will be not the last node of LinkedList
public class Deletenthnodefromlast {
 /*   public static class linkedlist{
        Node head;
        Node tail;
        int size;
        void addfirst(Node val){
            Node temp=val;
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void addlast(Node val){
            Node temp=val;
            if(tail==null){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        void add(int idx,int val){
            Node temp=new Node(val);
            Node Head=head;
            if(idx==0){
                addfirst(temp);
            } else if (idx==size-1) {
                addlast(temp);
            }
            else{
                for(int i=0;i<idx-1;i++){
                    Head=Head.next;
                }
                temp.next=Head.next;
                Head.next=temp;
                size++;
            }
        }
        void display(){
            Node Head=head;
            while(Head!=null){
                System.out.println(Head.data+" ");
                Head=Head.next;
            }
        }
        void removenode(int val){
            Node temp=new Node(val);
            Node Head=head;
            if(temp.data==head.data){
                head=head.next;
            }
            else{
                while(Head.next.data!=temp.data){
                    Head=Head.next;
                }
                Head.next=Head.next.next;
            }
            size--;
        }
        void removeindex(int idx){
            Node Head=head;
            if(idx==0){
                head=head.next;
            }
            else{
                for(int i=0;i<idx-1;i++){
                    Head=Head.next;
                }
                Head.next=Head.next.next;
                size--;
                }
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data=val;
        }
    }
*/    public static void main(String[] args) {
  /*      linkedlist l=new linkedlist();
        Scanner sc=new Scanner(System.in);

        l.add(0,3);
        l.add(1,5);
        l.add(2,1);
        l.add(3,4);
        l.display();
        int a=sc.nextInt();
        a=(l.size-a);
        l.removeindex(a);
//        l.removenode(3);
        l.display();*/
     LinkedList l=new LinkedList<>();
     Scanner sc = new Scanner(System.in);
     l.add(0,1);
     l.add(1,3);
     l.add(2,5);
     l.add(3,4);
     l.add(4,8);
     System.out.println(l);
     int a=sc.nextInt();
     a=(l.size()-a);
     l.remove(a);
     System.out.println(l);
    }
}

