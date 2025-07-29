package DAY31;
import java.util.*;
public class Queueusingtwostacks {
 public static    class  queue{
        Stack<Integer> s1=new Stack<>();
         Stack<Integer> s2=new Stack<>();

         public void add(int data){
            if(s1.isEmpty()){
                s1.push(data);
                return;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
         }


         public int remove(){
            if(s1.isEmpty()){
                return -1;
            }
            int data=s1.pop();
            return data;
         }

         public int peek(){
             if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
         }

    }


    public static void main(String[] args) {
        queue q=new queue();
        q.add(5);
        q.add(6);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());

    }
}
