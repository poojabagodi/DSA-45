package DAY27;

public class uniquesubstring {
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


    public static  int countnodes(Node root){
        if(root==null) return 0;
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countnodes(root.children[i]);
            }
        }
        return count+1;
    }

//Longest word

    public static String ans="";
    public static void  longestword(Node root,StringBuilder str){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow==true){
                char ch=(char)(i-'a');
                str.append(ch);

                if(str.length() >ans.length()){
                    ans=str.toString();
                }
            }
            longestword(root.children[i], str);
            str.deleteCharAt(str.length()-1);
        }
    }

    public static void main(String[] args) {
        String str="ababa";
        for(int i=0;i<str.length();i++){
            insert(str.substring(i));
        }

    }






  
}


