package LinkedList;

public class revision {
    public static void main(String[] args) {
        revision rev=new revision();
        rev.insertstart(1);
        rev.insertstart(2);
        rev.insertlast(3);
        rev.insertlast(4);
//        System.out.println(rev.head.value);
//        System.out.println(rev.Tail.value);
        rev.insertafternode(3,5);
        rev.insertindex(3,6);
        rev.display();
//        System.out.println("\n");
//        rev.deletestart();
//        rev.deletelast();
//        rev.deletenode(3);
//        rev.display();
    }
    public Node head;
    public Node Tail;
    public void insertstart(int value){
        Node temp=new Node(value);
        if(head==null){
            head=Tail=temp;
            return;
        }
        temp.next=head;
        head=temp;
        return;
    }
    public void insertlast(int value){
        Node temp=new Node(value);
        if(head==null){
            head=Tail=temp;
            return;
        }
        Tail.next=temp;
        Tail=temp;
        return;

    }
    public void insertafternode(int target,int data){
        Node tar=new Node(data);
        Node Head=head;
        while(Head.next!=null){
            if(Head.value==target){
                tar.next=Head.next;
                Head.next=tar;
                return;
            }
            Head=Head.next;
        }
        Head.next=tar;
        return;
    }
    public void insertindex(int index,int data){
        Node temp=new Node(data);
        if(index==1){
            temp.next=head;
            head=temp;
            return;
        }
        Node Head=head;
        int i=1;
        while(i<index-1 && Head.next!=null){
            Head=Head.next;
            i++;
        }
        if(Head.next==null){
            Head.next=temp;
            Tail=temp;
            return;
        }
        temp.next=Head.next;
        Head.next=temp;
    }
    public void display(){
        Node Head=head;
        while(Head!=null){
            System.out.println(Head.value);
            Head=Head.next;

        }
    }
    public void deletestart(){
        if(head==null){
            return;
        }
        head=head.next;;
    }
    public void deletelast(){
        if(head==Tail){
            head=Tail=null;
        }
        Node Head=head;
        while(Head.next.next!=null){
            Head=Head.next;
        }
        Head.next=Head.next.next;
    }
    public void deletenode(int target){
        if(head.value==target){
            head=head.next;
        }
        Node Head=head;
        while(Head.next.value!=target){
            Head=Head.next;
        }
        Head.next=Head.next.next;
    }
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }
}
