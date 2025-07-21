package DAY24;
import java.util.*;
public class BST {
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


    public static Node insert(Node root,int val){
            if(root==null){
                root=new Node(val);
                return root;
            }
            if(root.data>val){
                root.left=insert(root.left, val);
                
            }

            else{
                root.right=insert(root.right, val);
                
            }

            return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(" "+root.data);
        inorder(root.right);
    }


    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right, val);

        }
        else if(root.data>val){
            root.left=delete(root.left, val);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }

            if(root.left ==null){
                return root.right;
            }
            else if (root.right==null){
                return root.left;
            }
            else{
                Node IS=findInordersuccesor(root.right);
                root.data=IS.data;
                root.right=delete(root.right, IS.data);
            }
        }
        return root;
    }

    public static Node findInordersuccesor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }


    public static boolean isfound(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
           return true;
        }
        if(root.data<key){
            return isfound(root.right, key);
        }
        else{
            return isfound(root.left, key);

        }
    }

    public static void printrange(Node root,int k1,int k2){
       if(root==null){
        return;
       }
       if(root.data>=k1 && root.data<=k2){
        printrange(root.left, k1, k2);
        System.out.print(" "+root.data);
        printrange(root.right, k1, k2);
       }
       else if(root.data<k1){
        printrange(root.right, k1, k2);
       }
       else{
        printrange(root.left, k1, k2);
       }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

    public static void printroottoleaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        printroottoleaf(root.left, path);
        printroottoleaf(root.right, path);
        path.remove(path.size()-1); // backtrack
    }



    public static void main(String[] args) {
        int[] values={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }

        // inorder(root);
        // System.out.println();
        // System.out.println(isfound(root, 55));
        // delete(root, 3);
        // inorder(root);
        // System.out.println();
        // printrange(root, 3, 5);
        System.out.println();
        ArrayList<Integer> path=new ArrayList<>();  
        printroottoleaf(root, path);
        System.out.println("Root to leaf paths printed above.");    
    }
}
