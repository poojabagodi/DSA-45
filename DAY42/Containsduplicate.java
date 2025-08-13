package DAY42;
import java.util.*;
public class Containsduplicate {
    public static boolean dupli(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
