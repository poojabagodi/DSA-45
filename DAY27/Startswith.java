package DAY27;

public class Startswith {
    static class Node{
        Node children[]=new Node[26];
        Boolean eow=false;
    
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            
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
            
                
            
            curr=curr.children[idx];
        }

        curr.eow=true;
    }

public static boolean startswith(String key){
    Node curr=root;
    for(int i=0;i<key.length();i++){
        int idx=key.charAt(i)-'a';
        if(curr.children[idx]==null){
            return false;
        }
        curr=curr.children[idx];
    }
    return true;
}


    public static void main(String[] args) {
        String str[]={"zebra","dog","duck","dove"};
        for(int i=0;i<str.length;i++){
            insert(str[i]);
        }
        System.out.println(startswith("do"));
    }
}
