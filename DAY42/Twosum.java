package DAY42;
import java.util.*;
public class Twosum {
    public static int[] target(int arr[],int target){
        HashMap<Integer,Integer> map = new HashMap<>(); 
        for(int i=0;i<arr.length;i++){
          int com=target-arr[i];
          if(map.containsKey(com)){
             return new int[] {map.get(com),i};
          }
          map.put(arr[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15}; 
        int target = 9;
        int result[] = target(arr, target);
        if(result.length == 2){
            System.out.println("Indices are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two sum solution");
        }
    }
}
