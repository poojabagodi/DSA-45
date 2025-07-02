package DAY6;

public class LLmergesort {
   public  class Node{
       int data;
       Node next;
       Node(int data){
        this.data=data;
        this.next=null;
       }
    }
    public static Node head;

    public Node getMid(Node head){
      Node  slow=head;
      Node fast=head.next;
      while(fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
      }
      return slow;
    }

    public Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null &&head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
             temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
             temp=temp.next;
        }
        return mergedLL.next;
    }
    public Node mergesort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //findmid
        Node mid=getMid(head);
        
        Node rightHead=mid.next;
        mid.next=null;
        Node newleft=mergesort(head);
        Node newright=mergesort(rightHead);

        return merge(newleft,newright);
    }
}
