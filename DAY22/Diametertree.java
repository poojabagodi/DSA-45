package DAY22;
import java.util.*;
public class Diametertree {
    static class Info{
       int diam;
       int ht;
       Info(int diam,int ht){
        this.diam=diam;
        this.ht=ht;
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

        public int heightoftree(Node root){
            if(root==null){
                return 0;
            }
            int lh=heightoftree(root.left);
            int rh=heightoftree(root.right);
            return Math.max(lh,rh)+1;
        }


        public Info diameter(Node root){
            if(root==null){
                return new Info(0,0);
            }
           Info ldiam=diameter(root.left);
           Info rdiam=diameter(root.right);
           int diam=Math.max(Math.max(ldiam.diam,rdiam.diam)+1,(Math.max(ldiam.ht,rdiam.ht)+1));
           int ht=Math.max(ldiam.ht,rdiam.ht);
        return new Info(diam ,ht);


        }


    }




     public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        int arr[]={1,2,4,-1,-1,5,-1,-1};
          Node root=bt.buildtree(arr);
          System.out.println(root.data);


          System.out.println(bt.diameter(root).diam);
     }

}
