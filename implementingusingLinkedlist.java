package Queue;

public class implementingusingLinkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    public static class Queue{
        Node head;
        Node tail;
        int size=0;
        public void add(int data){
            Node temp=new Node(data);
            if(size==0) {
                head=tail=temp;
                size++;
                return;
            }
            Node Head=head;
            while(Head.next!=null){
                Head=Head.next;
            }
            Head.next=temp;
            tail=temp;
            size++;
            return;
        }
        public int poll(){
            if(size==0) return -1;
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }
        public int peek(){
            if(size==0) return -1;
            return head.data;
        }
        public void display(){
            Node Head=head;
            while(Head!=null){
                System.out.print(Head.data+" ");
                Head=Head.next;
            }
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.peek());
        System.out.println(q.size);
        q.display();
        q.poll();
        q.poll();
        System.out.println("\n"+q.peek());
        System.out.println(q.size);
        q.display();
    }
}
