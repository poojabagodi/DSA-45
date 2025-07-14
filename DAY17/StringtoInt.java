package DAY17;

public class StringtoInt {
  
    public int myAtoi(String s) {
        int i=0,sign=1,res=0;
        int n=s.length();
        if (s == null || s.length() == 0) return 0;

      while(i < n && s.charAt(i) == ' ') {
          i++;
       }

        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }

        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(res>(Integer.MAX_VALUE -digit)/10){
            return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res=res*10+digit;
            i++;
        }
        return res*sign;
    }
}
// This code converts a string to an integer, handling leading spaces, signs, and overflow conditions.
// It returns the integer value or the appropriate limits if overflow occurs.
