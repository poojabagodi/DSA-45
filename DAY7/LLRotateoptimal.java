package DAY7;

public class LLRotateoptimal {
// Optimal solution for rotating a linked list to the right by k places
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
         len++;
         tail=tail.next;
        }
        k=k%len;
        if(k==0) {return head;}
        tail.next=head;
        int newtailstep=len-k;
        ListNode newTail=head;
        for(int i=1;i<newtailstep;i++){
            newTail=newTail.next;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;
       return newHead;
    }

}
