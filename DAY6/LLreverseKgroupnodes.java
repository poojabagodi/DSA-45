package DAY6;

public class LLreverseKgroupnodes {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
     public ListNode reverseKGroup(ListNode head, int k) {
       ListNode curr=head;
       int size=0;
       while(curr!=null){
     size++;
     curr=curr.next;
       }
     curr=head;
     ListNode dummy=new ListNode(-1);
     dummy.next=head;
     ListNode prev=dummy;
     ListNode next;
     while(size>=k){
        curr=prev.next;
        next=curr.next;
        for(int i=1;i<k;i++){
            curr.next=next.next;
            next.next=prev.next;
            prev.next=next;
            next=curr.next;

        }
        size=size-k;
        prev=curr;
     }
     return dummy.next;
    }
}
