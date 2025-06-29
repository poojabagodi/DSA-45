package DAY2;

public class MaxsumSubarray {
    public static int maxsum(int arr[]){
        
        int ms=Integer.MIN_VALUE;
        int cs=0;
        boolean neg=true;
        for(int i=0;i<arr.length;i++){
            ms=Math.max(ms,arr[i]);
            if(arr[i]>=0){
                neg=false;
            }
        }
        if(neg){
            return ms;
        }
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
            
        }
        return ms;

    }

    public static void main(String[] args) {
        int arr[]={7,2,4,5,6,-5,-7};
        System.out.println(maxsum(arr));
    }
    
}
