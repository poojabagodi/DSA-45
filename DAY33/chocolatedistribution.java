package DAY33;
import java.util.*;

public class chocolatedistribution {
    public static void main(String[] args) {
        int arr[]={7,3,2,4,9,12,56};
        int m=3;
        Arrays.sort(arr);
        
        int minDiff = Integer.MAX_VALUE;    
      int n=arr.length;
        if(m==0 || n==0 || m>n) {
            System.out.println("Invalid input");
            return;
        }
       for(int i=0;i+m-1<n;i++) {
          int diff=arr[i+m-1]-arr[i];
          if(diff < minDiff) {
              minDiff = diff;
          }  
    }
        System.out.println("Minimum difference is: " + minDiff);
    } 
}