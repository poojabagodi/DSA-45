package DAY7;

public class LLrotateBruteforce {
   
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
         int size=0;
        while(temp!=null){
            temp=temp.next;
          size++;
        }
        k=k%size;
        while(k!=0){
         ListNode prev=null;
         ListNode tail=head;
           while(tail!=null && tail.next!=null){
            prev=tail;
            tail=tail.next;
         }
         tail.next=head;
          prev.next=null;
          head=tail;
          
        }
        return head;
    }
}

