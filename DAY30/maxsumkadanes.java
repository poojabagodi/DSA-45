package DAY30;
import java.util.*;
public class maxsumkadanes {
   


    public static int kadanes(int arr[]){
      int ms=Integer.MIN_VALUE;
    int cs=0;
    boolean allnegative=true;
    for(int i=0;i<arr.length;i++){
       ms=Math.max (ms,arr[i]);
       if(arr[i]>=0){
        allnegative=false;
        break;
       }
    }
    if(allnegative){
        return ms
;    }

   ms=Integer.MIN_VALUE;
   for(int i=0;i<arr.length;i++){
    cs=cs+arr[i];
    if(cs<0){
        cs=0;
    }
    ms=Math.max(ms,cs);
   }

   return ms;
    }


    public static void main(String[] args) {
         int arr[]={-1,-5,-4,-15,-6};
   
        System.out.println(kadanes(arr));

    }
}
