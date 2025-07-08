package DAY12;
/*
 * The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

 

Example 1:

Input: n = 3, k = 3
Output: "213"
 */
import java.util.ArrayList;
import java.util.List;

public class KthPermutationSequence {
    
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> numbers=new ArrayList<>();
        for(int i=1;i<n;i++){
            fact=fact*i;
            numbers.add(i);
        }
        numbers.add(n);
        k=k-1;
        StringBuilder ans = new StringBuilder();
        while(true){
             int index = k / fact;
            ans.append(numbers.get(index));
            numbers.remove(index);
            
            if(numbers.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/numbers.size();
        }
        return ans.toString();
    }
}

