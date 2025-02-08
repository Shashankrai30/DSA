package Queue;

public class implementc_queue {
    public static class c_queue{
        int arr[]=new int[10];
        int rear=-1;
        int front=-1;
        public void add(int data){
            if(rear==-1){
                arr[0]=data;
                front=0;
                rear=0;
                return;
            }
            arr[(rear+1)%10]=data;
            rear=(rear+1)%10;
            return;
        }
        public int poll(){
            if(rear==-1){
                return-1;
            }
            int v;
            if(front<9){
                v=arr[front];
                front++;
            }
            else{
                v=arr[front];
                front=0;
            }
            return v;
        }
        public void display() {
            if (rear >= front){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for(int i=front;i<10;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
        }
        public int peek(){
            if(front==-1) return -1;
            return arr[front];
        }
    }
    public static void main(String[] args) {
        c_queue q=new c_queue();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        System.out.println(q.peek());
        q.display();
        q.poll();
        q.poll();
        q.poll();
        q.add(11);
        q.add(12);
        q.add(13);
        System.out.println("\n"+q.peek());
        q.display();

    }
}
