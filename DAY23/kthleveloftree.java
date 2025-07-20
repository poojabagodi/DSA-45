package DAY23;

import java.util.LinkedList;
import java.util.Queue;
//0 based indexing
public class kthleveloftree {
    
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


     public void levelOrder(Node root,int k){
             if(root==null){
                return;
             }
             Queue<Node> q=new LinkedList<>();
             int level=0;
             q.add(root);
             q.add(null);
             while(!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null){
                    level++;
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    if(level==k){
                       System.out.print(" "+curr.data);
                    }
                   
                    if(curr.left!=null){
                        q.add(curr.left);

                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                        
                    }
                }
             }
        }


        public static void klevel(Node root,int level,int k){
            if(root==null){
                return;
            }
            if(level==k){
                System.out.print(" "+root.data);
                return;

            }
            klevel(root.left, level+1, k);
            klevel(root.right, level+1, k);

        }
    }


    public static void main(String[] args) {
         BinaryTree bt=new BinaryTree();
        int arr[]={1,2,4,-1,-1,5,-1,-1};
          Node root=bt.buildtree(arr);
          bt.levelOrder(root, 2);
          bt.klevel(root,0,2);    
    }

}
