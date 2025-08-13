package DAY42;
import java.util.*;
public class besttimetosell {
    public static int maxprofit(int arr[]){
        int max=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
           minprice=Math.min(minprice,arr[i]);
           max=Math.max(max,arr[i]-minprice);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + maxprofit(arr));
    }
}
