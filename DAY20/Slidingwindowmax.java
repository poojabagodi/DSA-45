package DAY20;
 import java.util.*;
public class Slidingwindowmax {
   
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
          if( k==0 || nums.length==0) return new int[0];
      Deque<Integer>  d=new LinkedList<>();
    
      int res[]=new int[nums.length-k+1];
       
      for(int i=0;i<nums.length;i++){
        
         //to remove the indices outside window
         while(!d.isEmpty() && d.peekFirst()<i-k+1){
             d.pollFirst();
         }

         while(!d.isEmpty() && nums[d.peekLast()]<nums[i]){
            d.pollLast();
         }
         d.offerLast(i);

         if(i>=k-1){
            res[i - k + 1] = nums[d.peekFirst()];
         }
      }
      return res;
    }
}
}
