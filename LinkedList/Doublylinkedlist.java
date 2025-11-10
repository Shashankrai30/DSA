package LinkedList;

public class Doublylinkedlist {
    public static void main(String[] args) {
        Doublylinkedlist dll=new Doublylinkedlist();
        dll.addfirst(1);
        dll.addfirst(2);
        dll.display();
    }
    public Node head;
    public Node tail;
    public void addfirst(int value){
        Node temp=new Node(value);
        if(head==null){
            head=tail=temp;
            return;
        }
        temp.next=head;
        head.previous=temp;
        head=temp;
    }
    public void display(){
        Node Head=head;
        while(Head!=null){
            System.out.println(Head.value);
            Head=Head.next;
        }
    }
    private class Node{
        int value;
        Node next;
        Node previous;
        public Node(int value){
            this.value=value;
        }
    }
}
