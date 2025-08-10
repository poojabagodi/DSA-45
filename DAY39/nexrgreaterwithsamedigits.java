package DAY39;
import java.util.*;
class Main {
   public static void nextgreater(String s){
       char arr[]=s.toCharArray();
       int n=s.length();
       int i;
       for( i=s.length()-1;i>0;i--){
           if(s.charAt(i)>s.charAt(i-1)){
               break;
           }
       }
           if(i==0){
               System.out.println("not possible");
               return;
           }
           int x=arr[i-1],minIndex=i;
            for (int j = i + 1; j < n; j++) {
            if (arr[j] > x && arr[j] <= arr[minIndex]) {
                minIndex = j;
            }
                
            }
           char temp=arr[i-1];
           arr[i-1]=arr[minIndex];
           arr[minIndex]=temp;
           Arrays.sort(arr, i, n);
           
        System.out.println(String.valueOf(arr));
       }
       
   
    public static void main(String[] args) {
        
         nextgreater("218765");
    }

    
    
    
    
    
    
}