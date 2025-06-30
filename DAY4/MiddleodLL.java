

 
class MiddleofLL {
    
 public class ListNode{
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode middleNode(ListNode head) {
        ListNode curr=head;
        int len=0;
        while(curr!=null){
         curr=curr.next;
         len++;
        }
        int idx=0;
         curr=head;
    
       while(idx<len/2){
        curr=curr.next;
        idx++;
       }
        return curr;
    }
}