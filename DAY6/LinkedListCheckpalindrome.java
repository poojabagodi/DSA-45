package DAY6;
public class LinkedListCheckpalindrome {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    public static Node head;
    public static  Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step1
        Node MidNode=findmid(head);
        //step2
        Node prev=null;
        Node curr=MidNode;
        Node next;
         while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
         //step3
         Node right=prev;
         Node left=head;
         while(right!=null){
            if(right.data != left.data){
                return false;
            }
            right=right.next;
            left=left.next;
         }
         return true;
    }

    public static void main(String[] args) {
  
        
    }
}
