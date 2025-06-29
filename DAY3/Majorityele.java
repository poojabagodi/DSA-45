import java.util.*;
class Majorityele {



    public int majorityElementone(int[] nums) {
       int el=0;
       int cnt=0;
       for(int i=0;i<nums.length;i++){
        if(cnt==0){
            cnt++;
            el=nums[i];
        }
        else if(el==nums[i]){
            cnt++;

        }
        else{
            cnt--;
        }
       }
       int count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==el){
            count++;
        }
       }
       if(count>(nums.length/2)){
          return el;
       }
       return 0;
    }
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li=new ArrayList<>();
        int cnt1=0,cnt2=0;
        int el1=0,el2=0;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && el2!=nums[i]){
                cnt1=1;
                el1=nums[i];
            }
            else if(cnt2==0 && nums[i]!=el1){
               cnt2=1;
               el2=nums[i];
            }
            else if(el1==nums[i]){
                cnt1++;
            }
            else if(el2==nums[i]){
                cnt2++;

            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int min=(int)Math.floor(nums.length/3)+1;
        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(el1==nums[i]) cnt1++;
            if(el2==nums[i]) cnt2++;
        }
        if(cnt1>=min && el1!=el2){
           li.add(el1);
        }
         if(cnt2>=min){
           li.add(el2);
        }
        return li;
    }
}