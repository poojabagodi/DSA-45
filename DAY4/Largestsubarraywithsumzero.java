public class Largestsubarraywithsumzero {
    public static int largestsubarray(int[] arr){
        int max=0;
        
        for(int i=0;i<arr.length;i++){
           int sum=0;
           for(int j=i;j<arr.length;j++){
                 sum=sum+arr[j];
                 if(sum==0){
                    max=Math.max(max,j-i+1);
                 }
           }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -2, 4, -4};
        System.out.println("Largest subarray with sum zero: " + largestsubarray(arr));
    }
}
