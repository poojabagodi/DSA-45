package DAY30;
import java.util.*;
public class Panagram {
     public static boolean isPanrgam(String str){
           int alp[]=new int[26];
           for(int i=0;i<26;i++){
            alp[i]=0;
           }
           for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
             continue;
            }
            alp[ch-'a']--;
              



           }

     boolean isit=true;
        for(int i=0;i<26;i++){
            if(alp[i]==0){
                isit=false;
                break;
            }
           }

           if(isit){
            return true;
           }
           return false;
     }

     public static void main(String[] args) {
        String str="abcdefghijkl mnopqrst uvwyz";
        System.out.println(isPanrgam(str));
     }

}
