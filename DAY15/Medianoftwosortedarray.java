package DAY15;

public class Medianoftwosortedarray {
    // This code finds the median of two sorted arrays.
    // It merges the two arrays and finds the median based on their combined length.
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
         int ind2=n/2;
         int ind1=ind2-1;
         int idx1ele=-1;
         int idx2ele=-1;
         int count=0;
         int i=0,j=0;
         while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                if(count==ind1) idx1ele=nums1[i];
                if(count==ind2) idx2ele=nums1[i];
                i++;
                count++;
            }
            else{
                if(count==ind1) idx1ele=nums2[j];
                if(count==ind2) idx2ele=nums2[j];
                j++;
                count++;
            }
         }
         while(i<nums1.length){
             if(count==ind1) idx1ele=nums1[i];
                if(count==ind2) idx2ele=nums1[i];
                i++;
                count++;
         }

         while(j<nums2.length){
            if(count==ind1) idx1ele=nums2[j];
                if(count==ind2) idx2ele=nums2[j];
                j++;
                count++;
         }

         if(n%2==1){
            return idx2ele;
         }
        
            return (double) ((double)(idx1ele+idx2ele))/2.0;
         

    }

}
