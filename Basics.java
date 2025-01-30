package LinkedList;

import java.util.*;

public class Basics {

    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void insertatfirst(int value){
            Node temp=new Node(value);
            if (head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        int length(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void delete(int index){
            if(index==0){
                head=head.next;
            } else {
                Node Head=head;
                for(int i=0;i<index-1;i++){
                    Head=Head.next;
                }
                Head.next=Head.next.next;
                if(Head.next==null){
                    tail=Head;
                }
            }
        }
        void insertatindex(int ind,int value){
            Node temp=new Node(value);
            Node Head=head;
            Node Tail=Head.next;
            int size=length();
            if(ind==0){
                insertatfirst(value);
            } else if (ind==size) {
                insertlast(value);
            }
            else{
                for(int i=0;i<ind-1;i++){
                    Head=Head.next;
                    Tail=Tail.next;
                }
                Head.next=temp;
                temp.next=Tail;
            }
        }
        void add(int value){
            int l=length();
            int v=value;
            if(l==0){
                insertatfirst(v);
            }
            else{
                insertlast(v);
            }
        }
        void insertlast(int value){
            Node temp=new Node(value);
            Node temp1=tail;
            if(temp1==null){
                tail=temp;
            }
            else{
                temp1.next=temp;
                tail=temp;
            }
        }
        void display(){
            Node Head=head;
            while(Head!=null){
                System.out.println(Head.data);
                Head=Head.next;
            }
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        linkedlist l=new linkedlist();
        l.add(5);
        l.add(6);
        l.insertatindex(1,7);
        l.insertlast(8);
        l.insertatfirst(4);
        l.display();
        System.out.println("Length : "+l.length());
        System.out.println("Head: "+l.head.data);
        System.out.println("Tail: "+l.tail.data);
        l.delete(2);
        l.delete(0);
        l.delete(l.length()-1);
        System.out.println("Length : "+l.length());
        System.out.println("Head: "+l.head.data);
        System.out.println("Tail: "+l.tail.data);
        l.display();
    }
}
