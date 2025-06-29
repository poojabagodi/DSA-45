import java.util.*;
class DuplicateinArray{
    public static void main(String args[]){
        int dup=0;
        int[] arr={1,2,3,4,6,5,7,4};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
               dup=arr[i];
               break;
            }
        }
        System.out.println(dup);
    }
}