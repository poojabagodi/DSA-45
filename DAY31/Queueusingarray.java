package DAY31;

public class Queueusingarray {
public class queue{
    int arr[];
    int rear;
    int size;
    queue(int n){
        arr=new int[n];
        this.rear=-1;
        size=n;
    }

    public boolean isEmpty(){
        return rear==-1;
    }

    public void add(int data){
        if(rear==size-1){
            System.out.println("queeu is full");
            return ;
        }
        if(rear==-1){
            rear++;
            arr[rear]=data;
            return;

        }

       arr[rear++]=data;
       return;
    }


    public int remove(){

        if(isEmpty()){
            return -1;
        }
        int data=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return data;
    }


    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[0];
    }
} 

}
