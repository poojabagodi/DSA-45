package DAY2;

import java.util.Arrays;

public class MergeSortedarrays {
    public static void merge(int[]arr1,int[] arr2,int n,int m){
        int left=0;
        int right=n-1;
        while(left<m && right>=0){
            if(arr2[left]<arr1[right]){
                int temp=arr2[left];
                arr2[left]=arr1[right];
                arr1[right]=temp;
            }
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr1={1, 3, 5, 7, 9};
        int[] arr2={2, 4, 6, 8, 10};
        int n = arr1.length;
        int m = arr2.length;
        merge(arr1, arr2, n, m);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
         // Sort the second array
        for(int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
