package DAY15;

public class Nonduplicate {
   
    public int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid%2==1) mid--;
            if(nums[mid]==nums[mid+1]){
                low=mid+2;
            }
            else{
                high=mid-1;
            }
        }
        return nums[low];
    }
}
// This code finds the single non-duplicate element in a sorted array where every other element appears twice.
// It uses a binary search approach to efficiently locate the non-duplicate element.
//Time Complexity: O(log n)
//Space Complexity: O(1)
