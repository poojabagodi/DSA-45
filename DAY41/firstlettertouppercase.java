package DAY41;
import java.util.*;
public class firstlettertouppercase {
    public static String upper(String str){
       StringBuilder s=new StringBuilder("");
       char ch=Character.toUpperCase(str.charAt(0));
       s.append(ch);
       for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' ' && i<str.length()){
            s.append(str.charAt(i));
            i++;
            s.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            s.append(str.charAt(i));
        }


       }
       return s.toString();

    }
}
