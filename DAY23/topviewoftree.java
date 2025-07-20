package DAY23;
import java.util.*;
public class  topviewoftree   {
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
    }

    static class Info{
        Node node;
        int hd;
        Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }

    public static void Topview(Node root){
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0,max=0;
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left !=null){
                     q.add(new Info(curr.node.left,curr.hd-1));
                     min=Math.min(min,curr.hd-1);
                }

                if(curr.node.right !=null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }

            }

        }

        for(int i=min;i<=max;i++){
            System.out.print(" "+map.get(i).data);
        }

    }


    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        int arr[]={1,2,4,-1,-1,5,-1,-1};
          Node root=bt.buildtree(arr);
          Topview(root);
    }

    

}
