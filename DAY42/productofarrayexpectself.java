package DAY42;

public class productofarrayexpectself {
    public int[] productExceptSelf(int[] nums) {
        int a[]=new int[nums.length];
        int b[]=new int[nums.length];
        int res[]=new int[nums.length];
        a[0]=1;
        
        for(int i=1;i<nums.length;i++){
            a[i]=nums[i-1]*a[i-1];
        }

        b[nums.length-1]=1;
        
        for(int i=nums.length-2;i>=0;i--){
            b[i]=nums[i+1]*b[i+1];
        }

        for(int i=0;i<nums.length;i++){
            res[i]=a[i]*b[i];
        }
        return res;
    }
}
