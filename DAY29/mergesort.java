package DAY29;

public class mergesort {
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

   public Node  mergesort(Node head){
    if(head==null || head.next==null){
        return head;
    }

    Node mid=findmid(head);
    Node righthead=mid.next;
    mid.next=null;
    Node newright=mergesort(righthead);
    Node newleft=mergesort(head);
    return merge(newright,newleft);
   }

   public Node merge(Node head1,Node head2){
    Node mergeLL=new Node(-1);
    Node temp=mergeLL;
    while(head1!=null && head2!=null){
        if(head1.data<head2.data){
            temp.next=head1;
            temp=temp.next;
            head1=head1.next;
        }
        else{
             temp.next=head2;
            temp=temp.next;
            head2=head2.next; 
        }
    }

    while(head1!=null){
        temp.next=head1;
            temp=temp.next;
            head1=head1.next;
    }
    while(head2!=null){
        temp.next=head2;
            temp=temp.next;
            head2=head2.next; 
    }
    return mergeLL.next;
   }
}
