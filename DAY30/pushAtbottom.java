package DAY30;
import java.util.*;
public class pushAtbottom {
    public static void pushBottom(Stack<Integer> s,int data){
    
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottom(s, data);
        s.push(top);
      
    }


    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(9);
        s.push(7);
        s.push(5);
       pushBottom(s,8);

    }
}
