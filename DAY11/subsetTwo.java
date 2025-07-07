
// : Given an array of integers that may contain duplicates the task is to return all possible subsets. Return only unique subsets and they can be in any order.

// Examples:

// Example 1:

// Input: array[] = [1,2,2]

// Output: [ [ ],[1],[1,2],[1,2,2],[2],[2,2] ]

package DAY11;
import java.util.*;


// public class subsetTwo {
//     public static ArrayList<ArrayList<Integer>> powersubset(int[] arr,int n){
//          int subsets=1<<n;
//         ArrayList<ArrayList<Integer>> result=new ArrayList<>();
//         for(int i=0;i<subsets-1;i++){
//             ArrayList<Integer> ans=new ArrayList<>();
//             for(int j=0;j<n;j++){
//                 if((i & (1<<j))>0){
//                     ans.add(arr[j]);
//                 }
//             }
//             result.add(ans);
//         }
//         return result;
//     }
// }
class subsetTwo {

    public static  void findsubsets(int ind,int[] nums,List<Integer> ds,List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            findsubsets(i+1,nums,ds,ansList);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList=new ArrayList<>();
        findsubsets(0,nums,new ArrayList<>(),ansList);
        return ansList;
    }
}