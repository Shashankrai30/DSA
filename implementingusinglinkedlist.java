package Stack;

public class implementingusinglinkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Stack{
        Node head;
        Node tail;
        int size=0;
        public void push(int data){
            Node temp=new Node(data);
            if(size==0){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            size++;
        }
        public int pop(){
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
            Node temp=head;
            reversedisp(temp);
        }
        public void reversedisp(Node Temp){
            Node temp1=Temp;
            if(temp1==null) return;
            reversedisp(temp1.next);
            System.out.print(temp1.data+" ");
            return;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(5);
        st.push(4);
        st.push(1);
        st.push(3);
        st.push(6);
        st.display();
        System.out.println("\n"+st.peek());
        st.pop();
        st.pop();
        st.display();
        System.out.println("\n"+st.peek());

    }
}
