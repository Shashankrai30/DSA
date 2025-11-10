package LinkedList;

public class insertrecursion {
    static Node head=null;
    static Node tail=null;
    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(4);
        insert(5);
        recinsert(3,2,head);
        display();
    }
    int size=0;
    public static void insert(int value){
        Node temp=new Node(value);
        if(head==null){
           head=temp;
           tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }

    }
    public static void recinsert(int value,int index,Node Head){
        if(index==1){
            Node temp=new Node(value);
            temp.next=Head.next;
            Head.next=temp;
            return;
        }
        recinsert(value, index-1, Head.next);
    }
    public static void display(){
        Node Head=head;
        while(Head!=null){
            System.out.println(Head.value);
            Head=Head.next;
        }
        return;
    }
    private static class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }
}
