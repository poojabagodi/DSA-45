package DAY20;
 import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        int[] next=new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty() && nums2[i]>=nums2[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
             next[i]=-1;
            }
            else{
                next[i]=nums2[s.peek()];
                
            }
            s.push(i);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], next[i]);
        }
        
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        
        return ans;
    }
} 