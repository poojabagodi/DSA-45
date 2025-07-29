package DAY31;


public class Queeuusingcircularque {
    static class queue{
        int arr[];
        int size;
        int front;
        int rear;
        queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }

        public boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public boolean isFull(){
            return (rear+1)%size==front;
        }

        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return ;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
            
        }

        public int remove(){
            if(isEmpty()){
                return -1;
            }
            int data=arr[front];
            if(front==rear){
                front=rear=-1;
            }
            else{
                front=(front+1)%size;
            }
           
            return data;
        }

        public int peek(){
             if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }


}
