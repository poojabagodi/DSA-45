package DAY30;
import java.util.*;
public class StackusingArraylist {
    static class stack{
        ArrayList<Integer> s=new ArrayList<>();

        public boolean isEmpty(){
            return s.size()==0;
        }
        public void push(int data){
            s.add(data);
            return;
        }

        public int pop(){
            if(s.isEmpty()){
                return -1;
            }
            int data=s.get(s.size()-1);
            s.remove(s.get(s.size()-1));
            return data;
        }

        public int peek(){
             if(s.isEmpty()){
                return -1;
            }
            return s.get(s.size()-1);
        }
    }

    public static void main(String[] args) {
        stack s=new stack();
        s.push(4);
        s.push(9);
        s.push(8);
       System.out.println(s.peek());
    }
}
