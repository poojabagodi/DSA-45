package DAY29;

public class Zigzag {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            
            return;
        }
        newNode.next=head;
        head=newNode;
        return;

    }


    public void  addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
           addFirst(data);
           return;
        }
         size++;

        tail.next=newNode;
        tail=newNode;
        return;

    }

    public void zigzag(Node head){
        if(head==null || head.next==null){
            return;
        }
         Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
   Node mid=slow;

   Node curr=mid.next;
   mid.next=null;
   Node prev=null;
   Node next;
   while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
   }

   Node left=head;
   Node right=prev;
   Node nextR,nextL;

   while(left!=null && right!=null){
    nextL=left.next;
    left.next=right;
    nextR=right.next;
    right.next=nextL;

    left=nextL;
    right=nextR;
   }
    }
}
