package DAY13;

public class findPeakelement {
  
    public int findPeakElement(int[] nums) {
        int end=nums.length-1;
        int start=0;
        while(start<end){
            int mid=(start+end)/2;
            if(nums[mid]>nums[mid+1]){
                 end=mid;
            }
            else{
                start=mid+1;
            }

        }
           return start;
    }

}
