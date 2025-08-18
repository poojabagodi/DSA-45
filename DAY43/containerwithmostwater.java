package DAY43;

public class containerwithmostwater {
    public int maxarea(int nums[]){
        int lp=0,rp=nums.length-1;
        int maxarea=0;
        while(lp<rp){
            int ht=Math.min(nums[lp],nums[rp]);
            maxarea=Math.max(maxarea,ht*(rp-lp));
            if(nums[lp]<nums[rp]){
                rp--;
            }
            else{
                lp++;
            }   
        }
        return maxarea;
    }
}
