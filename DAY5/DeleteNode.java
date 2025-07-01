package DAY5;
//delet node when your not given access to head but acess to the node to be deleted
public class DeleteNode {
    
  
 public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
class Solution {
    public void deleteNode(ListNode node) {
        if(node==null) return;
        node.val=node.next.val;
        node.next=node.next.next;
       return;
    }
}
}
