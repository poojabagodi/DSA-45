package DAY27;
import java.util.*;
public class prefixunique {
    static class Node{
        Node children[]=new Node[26];
        Boolean eow=false;
        int freq;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            freq=0;
        }
    }

    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
              curr.children[idx]=new Node();
            }
            
                curr.children[idx].freq++;
            
            curr=curr.children[idx];
        }

        curr.eow=true;
    }

    public static void findprefix(Node root,String ans){
        if(root==null) return;
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<root.children.length;i++){
            if(root.children[i]!=null){
                findprefix(root.children[i],ans+(char)(i+'a'));
            }
        }
    }


    public static void main(String[] args) {
        String str[]={"zebra","dog","duck","dove"};
        for(int i=0;i<str.length;i++){
            insert(str[i]);
        }

        findprefix(root, "");
    }
}
