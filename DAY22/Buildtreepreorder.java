package DAY22;
import java.util.*;
public class Buildtreepreorder {
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


        public void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(" "+root.data);
            preorder(root.left);
            preorder(root.right);
        }

        public void Inorder(Node root){
            if(root==null){
                return;
            }
              Inorder(root.left);
            System.out.print(" "+root.data);
           
            Inorder(root.right);
        }

         public void postorder(Node root){
            if(root==null){
                return;
            }
              postorder(root.left);
           
           
            postorder(root.right);
             System.out.print(" "+root.data);
        }




        public void levelOrder(Node root){
             if(root==null){
                return;
             }
             Queue<Node> q=new LinkedList<>();
             q.add(root);
             q.add(null);
             while(!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(" "+curr.data);
                    if(curr.left!=null){
                        q.add(curr.left);

                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                        
                    }
                }
             }
        }


        public int heightoftree(Node root){
            if(root==null){
                return 0;
            }
            int lh=heightoftree(root.left);
            int rh=heightoftree(root.right);
            return Math.max(lh,rh)+1;
        }


         public int counttofnodes(Node root){
            if(root==null){
                return 0;
            }
            int lc=counttofnodes(root.left);
            int rc=counttofnodes(root.right);
            return lc+rc+1;
        }


        public int sumnode(Node root){
            if(root==null){
                return 0;
            }
            int lc=sumnode(root.left);
            int rc=sumnode(root.right);
            return lc+rc+root.data;
        }


        public int diameter(Node root){
            if(root==null){
                return 0;
            }
            int leftdiam=diameter(root.left);
            int roghtdiam=diameter(root.right);
            int lh=heightoftree(root.left);
            int rh=heightoftree(root.right);
            int selfdiam=lh+rh+1;
            return Math.max(selfdiam,Math.max(leftdiam,roghtdiam));
        }

    }
      public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        int arr[]={1,2,4,-1,-1,5,-1,-1};
          Node root=bt.buildtree(arr);
          System.out.println(root.data);


          System.out.print("Preorder: ");
bt.preorder(root);
System.out.println();

System.out.print("Inorder: ");
bt.Inorder(root);
System.out.println();

System.out.print("Postorder: ");
bt.postorder(root);
System.out.println();





System.out.print("Levelorder: ");
System.out.println();
bt.levelOrder(root);
System.out.println();



System.out.println("height of tree :"+bt.heightoftree(root));
System.out.println("Count of nodes"+bt.counttofnodes(root));
System.out.println("sum of nodes "+bt.sumnode(root));
System.out.println(" diameter of tree "+bt.diameter(root));




      }




     }

