package DAY29;

public class Linkedlist {
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


   public int removeLast(){
    if(size==0){
        return -1;
    }
    
    
    if(size==1){
        int d=head.data;
        head=tail=null;
        size--;
        return d;

    }
    int i=0;
    Node temp=head;
    while(i<size-2){
       temp=temp.next;
       i++;
    }
    int data=temp.next.data;
 size--;
    temp.next=null;
    return data;

   }


   public int helper(Node head,int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next, key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
   }

   public int recursearch(int key){
    return helper(head, key);
   }


   public void reverse(){
    Node curr=tail=head;
    Node prev=null;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
   }
   

   public void removefromlast(int n){
    int sz=0;

    Node curr=head;
    while(curr!=null){
        curr=curr.next;
        sz++;
    }
    if(sz==n){
        head=head.next;
        return;
    }

    int i=1;
    
    Node prev=head;
    while(i<sz-n){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
  
   }

   public static void main(String[] args) {
    Linkedlist ll=new Linkedlist();
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(6);
    ll.addFirst(9);
    ll.addMiddle(10, 2);
    ll.printll();
        
//         System.out.println("size of ll :"+ll.size);

//   ll.reverse();
//   ll.printll();

ll.removefromlast(2);
    ll.printll();


   }

}
