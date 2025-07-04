package DAY8;

public class LLclonenextrandompointeroptimal {
    
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


     public Node copyRandomList(Node head) {
          Node temp=head;
          while(temp!=null){
            Node copyNode=new Node(temp.val);
            copyNode.next=temp.next;
            temp.next=copyNode;
            temp=temp.next.next;
          }

          temp=head;
          while(temp!=null){
             Node copyNode=temp.next;
             if(temp.random!=null){
               copyNode.random=temp.random.next;

             }
             else{
                copyNode.random=null;
             }
             temp=temp.next.next;
          }


          Node dummy=new Node(-1);
          Node res=dummy;
          temp=head;
          while(temp!=null){
            res.next=temp.next;
            temp.next=temp.next.next;
            res=res.next;
            temp=temp.next;
          }

          return dummy.next;
    }
}
