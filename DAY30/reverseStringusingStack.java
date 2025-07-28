package DAY30;
import java.util.*;
public class reverseStringusingStack {
    public static String reverse(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.add(str.charAt(idx));
            idx++;
        }
        StringBuilder res=new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
             res.append(curr);
        }
        return res.toString();
    }
}
