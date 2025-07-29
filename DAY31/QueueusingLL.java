package DAY31;

public class QueueusingLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head=null;
    public static Node tail=null;

    public boolean isEmpty(){
        return head==null && tail==null;
    }

    public void add(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int data=head.data;
        if(head==tail){
            head=tail=null;
            
        }
        else{
          head=head.next;
        }
        
        return data;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
}
