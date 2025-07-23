package DAY25;
  import java.util.*;
public class maxwidthofBT {
 
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
     
    
        public int widthOfBinaryTree(TreeNode root) {
           
           return width(root);
        }
        public static class Info{
            TreeNode node;
            int idx;
            
            Info(TreeNode node,int idx){
                this.node=node;
                this.idx=idx;
            }
    
        }
    
    
        public static int width(TreeNode root){
            if(root==null) return 0;
            Queue<Info> ans=new LinkedList<>();
            int maxwidth=0;
            ans.add(new Info(root,0));
            while(!ans.isEmpty()){
                int size=ans.size();
                int  levelstart=ans.peek().idx;
                int first=0,last=0;
                for(int i=0;i<size;i++){
                    Info pair=ans.remove();
                    TreeNode node=pair.node;
                    int  index=pair.idx-levelstart;
                    if(i==0) first=index;
                    if(i==size-1) last=index;
    
                    if(node.left!=null){
                        ans.add(new Info(node.left,2*index));
                    }
                     if(node.right!=null){
                        ans.add(new Info(node.right,2*index+1));
                    }
                }
                maxwidth=Math.max(maxwidth,last-first+1);
            }
    
       return maxwidth;
    
        }
    }



