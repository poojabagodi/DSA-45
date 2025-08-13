package DAY41;
import java.util.*;
public class ispalindrom {
 public static boolean ispalin(String str){
    for(int i=0;i<str.length()/2;i++){
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
              return false;
        }
    }
    return true;
 }   
}
