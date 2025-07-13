public class KthelementOfTwosortedarray {
    
    public static int kthelement(int[] arr1,int[] arr2,int k){
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0;
        int j=0;
        int count=0;
        int result = -1; // Default value if k is out of bounds
          while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                count++;
                if (count == k) {
                    result = arr1[i];
                    break;
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    result = arr2[j];
                    break;
                }
                j++;
            }
        }

        while (i < n1 && count < k) {
            count++;
            if (count == k) {
                result = arr1[i];
                break;
            }
            i++;
        }
        
        while (j < n2 && count < k) {
            count++;
            if (count == k) {
                result = arr2[j];
                break;
            }
            j++;
        }
        
        return result;
        
    }
}
