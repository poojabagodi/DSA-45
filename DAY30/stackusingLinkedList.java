package DAY30;
import java.util.*;
public class stackusingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    static class stack{
        public static Node head=null;

      public boolean isEmpty(){
        return head==null;
      }

      public void push(int data){
        Node newNode= new Node(data);
        if(isEmpty()){
           head=newNode;
           return;
        }

        newNode.next=head;
        head=newNode;

      }

      public int pop(){
         if(isEmpty()){
           return -1;
        }
        int data=head.data;
        head=head.next;
        return data;
      }

      public int peek(){
         if(isEmpty()){
           return -1;
        }
        return head.data;
      }
    }


    public static void main(String[] args) {
        stack s=new stack();
        s.push(8);
        s.push(9);
        s.push(5);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
