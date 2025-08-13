package DAY41;
import java.util.*;
public class stringompression {
    
    public static String compress(String str){
        String newstr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length() && str.charAt(i)==str.charAt(i+1)){
                   count++;
                   i++;
            }
            newstr+=str.charAt(i);
            if(count>1){
                newstr+=count.toString();
            }
        }
        return newstr;
    }
}
