package DAY8;
import java.util.*;
public class LLclonenextandrandompointerHashmap {
 
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
        HashMap<Node,Node> mpp=new HashMap<>();
        while(temp!=null){
            Node newNode=new Node(temp.val);
            mpp.put(temp,newNode);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node copyNode=mpp.get(temp);
            copyNode.next=mpp.get(temp.next);
            copyNode.random=mpp.get(temp.random);
            temp=temp.next;
        }
        return mpp.get(head);
    }

}
