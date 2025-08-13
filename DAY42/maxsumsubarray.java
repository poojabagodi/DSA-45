package DAY42;
import java.util.*;
public class maxsumsubarray {
  public static int maxsumsubarray(int arr[]){
    int maxsum=Integer.MIN_VALUE;
    int cs=0;
    boolean isnegative=true;
    for(int i=0;i<arr.length;i++){
        maxsum=Math.max(maxsum,arr[i]);
        if(arr[i]>=0){
          isnegative=false;
          break;
        }
    }

    if(isnegative){
        return maxsum;
    }

    maxsum=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){  
       cs=cs+arr[i];
       if(cs<0){
        cs=0;
       }
       maxsum=Math.max(maxsum,cs);
    }
    return maxsum;
}
}
