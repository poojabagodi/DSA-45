package DAY16;
class MedianOfRowWiseSortedMatrix{
      static int UpperBound(int[] arr,int x,int n){
         int low=0,high=n-1;
         int ans=n;
         while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
         }
         return ans;
     }

     static int countsmall(int[][] matrix,int n,int m,int x){
        int count=0;
        for(int i=0;i<m;i++){
            count+=UpperBound(matrix[i],x,n);
        }
        return count;
     }


     static int median(int[][] matrix,int n,int m){
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            low=Math.min(low,matrix[i][0]);
            high=Math.max(high,matrix[i][n-1]);
        }

        int req=(n*m)/2;

        while(low<=high){
            int mid=(low+high)/2;
            int  smallequal=countsmall(matrix,n,m,mid);
            if(smallequal<=req){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }

   public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {8, 9, 11, 12, 13},
            {21, 23, 25, 27, 29}
        };
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = median(matrix, n, m);
        System.out.println("The median element is: " + ans);
    }

}