package DAY34;

import java.util.ArrayList;
import java.util.Collections;

public class choco {
     public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int minpa=Integer.MAX_VALUE;
        for(int i=0;i<=arr.size()-m;i++){
            minpa=Math.min(minpa,arr.get(i+m-1)-arr.get(i));
        }
        return minpa;
    }
}
