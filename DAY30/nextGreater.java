package DAY30;
import java.util.*;
public class nextGreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nextGe[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
           while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
              s.pop();
           }
           if(s.isEmpty()){
            nextGe[i]=-1;
           }
           else{
            nextGe[i]=arr[s.peek()];
           }
           s.push(i);
        }
   for(int i=0;i<nextGe.length;i++){
    System.out.print(" "+nextGe[i]);
   }
    }
}
