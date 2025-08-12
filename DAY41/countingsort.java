package DAY41;
import java.util.*;
public class countingsort {
    public static void count(int arr[]){
        int maxnum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxnum=Math.max(maxnum,arr[i]);
        }

        int count[]=new int[maxnum+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
              int j=0;
        for(int i=0;i<count.length;i++){
        
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

        
    }
     public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
    public static void main(String args[]){
        int arr[]={3,2,4,1,1,3,4,};
         count(arr);
         printarray(arr);

    }
}
