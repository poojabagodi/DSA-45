package DAY30;
import java.util.*;
public class stockspan {
    public static void stock(int stocks[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=0;
        for(int i=1;i<stocks.length;i++){
            while(!s.isEmpty() && stocks[s.peek()]<=stocks[i]){
                s.pop();
            }
            if(s.isEmpty()){
        span[i]=i+1;
            }
          else{
              int prevhigh=i-s.peek();
            span[i]=prevhigh;
          }
           
          s.push(i);
          
    

        }
    }
}
