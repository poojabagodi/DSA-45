package DAY6;

public class LLzigzag {
    public  class Node{
       int data;
       Node next;
       Node(int data){
        this.data=data;
        this.next=null;
       }
    }
    public static Node head;

    public Node zigzag(Node head){
     Node slow=head;
     Node fast=head.next;
     while(fast!=null && fast.next!=null ){
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
     return head;
     
    }
}

