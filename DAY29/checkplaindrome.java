package DAY29;

public class checkplaindrome {
 
      class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            
            return;
        }
        newNode.next=head;
        head=newNode;
        return;

    }


    public void  addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
           addFirst(data);
           return;
        }
         size++;

        tail.next=newNode;
        tail=newNode;
        return;

    }
   public void addMiddle(int data,int idx){
    Node newNode=new Node(data);
    if(head==null){
        addFirst(data);
        return;
    }
    size++;
    Node temp=head;
     int i=0;
     while(i<idx-1){
        temp=temp.next;
        i++;
     }
     newNode.next=temp.next;
     temp.next=newNode;
     return;

   }
   public void printll(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.print("null");
    System.out.println();
   }

   public int removeFirst(){
    if(size==0){
        return -1;
    }
    if(size==1){
        int d=head.data;
        head=tail=null;
        size--;
        return d;
        
    }

    int data=head.data;
    size--;
    head=head.next;
    return data;
   }


   public Node findmid(Node head){
       Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
   }

   public boolean checkpali(){
     if(head==null ||head.next==null){
        return true;
     }
     Node midNode=findmid(head);

     Node curr=midNode;
     Node prev=null;
     Node next;
     while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
     }

     Node lefthead=head;
     Node righthead=prev;

     while(righthead!=null){
        if(lefthead.data!=righthead.data){
            return false;
        }
       lefthead=lefthead.next;
       righthead=righthead.next;

     }
     return true;

   }

   public boolean detectcycle(){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
    }
    return false;
   }


   public void removeycycle(){
    Node slow=head;
    Node fast=head;
    boolean iscycle=false;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            iscycle=true;
            break;
        }
    }
    if(iscycle==false){
        return;
    }
    slow=head;
    Node prev=null;
    while(slow!=fast){
     prev=fast;
     slow=slow.next;
     fast=fast.next;
    }
    prev.next=null;
   }


 public static void main(String[] args) {
    checkplaindrome ll=new checkplaindrome();
    ll.addFirst(1);
    ll.addFirst(0);
    ll.addFirst(0);
    ll.addFirst(1);
   // ll.addMiddle(10, 2);
    ll.printll();
    System.out.println(ll.checkpali());
    System.out.println(ll.detectcycle());

   }
}
