import java.util.*;
public class Validparenthesis {
    public static boolean valid(String str){
        Stack<Character> s=new Stack<>();
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='('  || str.charAt(i)=='{' || str.charAt(i)=='['){
            s.push(str.charAt(i));

        }   
        else{
            if(s.isEmpty()){
                return false;
            }
            if(s.peek()=='(' && str.charAt(i)==')' || s.peek()=='[' && str.charAt(i)==']' || s.peek()=='{' && str.charAt(i)=='}'){
                s.pop();

            }
            else{
                return false;
            }
        }  

        
        
     }
     return s.isEmpty();

    }


    public static void main(String[] args) {
        String str="([{}])";
        System.out.println(valid(str));
    }
}
