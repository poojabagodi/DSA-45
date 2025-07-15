package DAY18;

public class Anagrams {
    
    /**
     * This method checks if two strings are anagrams of each other.
     *
     * @param s the first string
     * @param t the second string
     * @return true if the strings are anagrams, false otherwise
     */
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] arr=new int[26];
        int i=0;
        while(i!=s.length()){
            arr[s.charAt(i)-'a']++;
            i++;
        }

       i=0;
        while(i!=t.length()){
            arr[t.charAt(i)-'a']--;
            i++;
        }


        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                return false;
            }
        }

        return true;
    }

}
