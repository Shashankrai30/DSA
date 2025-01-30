package Queue;

public class ImplementingusingArray {
    public static class Queue{
        int arr[]=new int[10];
        int size=0;
        public void add(int data){
            arr[size]=data;
            size++;
            return;
        }
        public int poll(){
            if(size==0){
                return -1;
            }
            int val=arr[0];
            for(int i=0;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            size--;
            return val;
        }
        public int peek(){
            if(size==0) return -1;
            return arr[0];
        }
        public void display(){
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            return;
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
        q.display();

    }
}
