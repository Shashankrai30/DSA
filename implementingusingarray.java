package Stack;

public class implementingusingarray {
    public static class Stack{
        int[]arr=new int[10];
        int size=0;
        public void push(int data){
            arr[size]=data;
            size++;
            return;
        }
        public int pop(){
            if(size==0) return -1;
            size--;
            return arr[size-1];
        }
        public int peek(){
            if(size==0) return -1;
            return arr[size-1];
        }
        public void display(){
            int a=0;
            while(a<size){
                System.out.print(arr[a]+" ");
                a++;
            }
            return;
        }
    }
    public static void main(String[] args) {
       Stack st=new Stack();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       st.push(5);
       st.push(6);
       st.display();
       System.out.println("\n"+st.peek());
       st.pop();
       st.pop();
       st.display();
       System.out.println("\n"+st.peek());
    }
}
