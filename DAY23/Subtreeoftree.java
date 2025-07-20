package DAY23;

public class Subtreeoftree {
    
    static class BinaryTree{
          static int idx=-1;
        Node buildtree(int[] nodes){
           idx++;
if (idx >= nodes.length || nodes[idx] == -1) {
        return null;
    }
           Node newNode=new Node(nodes[idx]);
           newNode.left=buildtree(nodes);
           newNode.right=buildtree(nodes);
           return newNode;
                   
        }
    }
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
     }


    public static boolean isidentical(Node s, Node t) {
       if(s==null && t==null) {
           return true;
       }
       if(s==null || t==null||s.data!=t.data) {
           return false;

       }

       if(!isidentical(s.left, t.left) || !isidentical(s.right, t.right)) {
           return false;
       }
       return true;
    }   


    public static boolean isSubtree(Node s, Node t) {
        if(s==null) {
            return false;
        }
        if(s.data==t.data && isidentical(s, t)) {
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
}



