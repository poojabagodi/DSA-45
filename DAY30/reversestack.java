package DAY30;
import java.util.*;
public class reversestack {
    public static void pushBottom(Stack<Integer> s,int data){
    
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottom(s, data);
        s.push(top);
      
    }

    public static void rev(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        rev(s
);


    pushBottom(s, top);
    
    }
}
