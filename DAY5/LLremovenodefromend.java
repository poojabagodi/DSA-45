package DAY5;


public class LLremovenodefromend {
    public class ListNode{
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public static ListNode head;
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
       int sz=0;
        ListNode curr=head;
        while(curr!=null){
           sz++;
           curr=curr.next;
        }
        if(sz==n){
            head=head.next;
            return head;
        }
        
        int i=1;
        curr=head;
        while(i<sz-n){
            i++;
           curr=curr.next;
        }
         curr.next=curr.next.next;
        return head ;
    }
}
