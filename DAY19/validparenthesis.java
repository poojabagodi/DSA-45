package DAY19;
import java.util.*;
public class validparenthesis {
    
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch== '{' || ch=='['){
                st.push(ch);
            }
            else{
                 if (st.isEmpty()) {
                    return false; // No matching opening bracket
                }
                if((st.peek()=='('&&ch==')') || (st.peek()=='['&&ch==']') || (st.peek()=='{'&&ch=='}')){
                st.pop();
            }
            else {
                    return false; // Mismatched bracket
                }

            }

           
        }

       

        return st.isEmpty();
    }
}
}
