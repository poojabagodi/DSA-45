package DAY27;

public class wordbreak {
    //wordbrerak 
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
        Node(){
            for(int i=0;i<children.length;i++){
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
    
    public static boolean search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        
        return curr.eow==true;
    }
    
    public static boolean wordbreak(String key){
        if(key.length()==0) return true;
        for(int i=1;i<=key.length();i++){
             
        if(search(key.substring(0,i)) && wordbreak(key.substring(i))){
            return true;
        }
        
        }
        return false;
      
       
    }
    public static void main(String[] args) {
      String w[]={"i","love","sam","samsung","mobile"};
      for(int i=0;i<w.length;i++){
          insert(w[i]);
      }
      String key="ilovesam";
      System.out.println(wordbreak(key));
      
    
    
}
}


}
