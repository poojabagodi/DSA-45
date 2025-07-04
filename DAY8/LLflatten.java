package DAY8;

public class LLflatten {
    
class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode next2) {
        val = data1;
        next = next1;
        child = next2;
    }
}



    ListNode mergeTwolist(ListNode a,ListNode b){
        ListNode temp=new ListNode(0);
        ListNode res=temp;
        while(a!=null && b!=null){
            if(a.val<b.val){
                temp.child=a;
                temp=temp.child;
                a=a.child;
            }
            else{
                temp.child=b;
                temp=temp.child;
                b=b.child;
            }
           
        }
         if(a!=null) temp.child=a;
            else temp.child=b;
            return res.child;
    }

    
     ListNode flattenLinkedList(ListNode head) {
          if(head==null || head.next==null){
            return head;
          }
          head.next=flattenLinkedList(head.next);
          head=mergeTwolist(head,head.next);
          head.next=null;
          return head;
    }
}
// The above code defines a class `LLflatten` that contains methods to flatten a linked list with child pointers.
// The `ListNode` class represents a node in the linked list, which can have a
