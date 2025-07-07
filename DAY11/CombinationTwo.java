package DAY11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationTwo {
  


    public static void findcombination(int idx,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
     
            if(target==0){
                ans.add(new ArrayList<>(ds));
                return;
            }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[idx]>target) break;

            ds.add(arr[i]);
            findcombination(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    } 
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        findcombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}
// This code defines a class `CombinationTwo` that finds all unique combinations of numbers from the input array that sum up to a given target. 
//It uses backtracking to explore all possible combinations while avoiding duplicates by skipping over repeated elements in the sorted array. 
//The results are stored in a list of lists, which is returned at the end.
// The method `findcombination` is a recursive function that builds combinations and checks if they
