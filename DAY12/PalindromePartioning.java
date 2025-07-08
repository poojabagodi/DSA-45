

//Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

 

// Example 1:

// Input: s = "aab"
// Output: [["a","a","b"],["aa","b"]]
// Example 2:

// Input: s = "a"
// Output: [["a"]]

import java.util.*;
// 
public class PalindromePartioning {
    
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> path=new ArrayList<>();
        funct(s,0,res,path);
        return res; 
    }

    public static void funct(String s,int ind,List<List<String>> res,List<String> path){
        if(ind==s.length()){
        res.add(new ArrayList<>(path));
        return;
        }

        for(int i=ind;i<s.length();i++){
            if(isPalindrome(s,ind,i)){
                    path.add(s.substring(ind,i+1));
                    funct(s,i+1,res,path);
                    path.remove(path.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s,int start,int end){
            while(start<=end){
                if(s.charAt(start++)!=s.charAt(end--)){
                    return false;
                }

            }
            return true;
    }

}

