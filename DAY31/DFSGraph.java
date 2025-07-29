package DAY31;

import java.util.ArrayList;

public class DFSGraph {
        public static  class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }


    public static void creategraph(ArrayList<Edge> graph[]){
           for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
         // @SuppressWarnings("unchecked")
         
     

          
        graph[0].add(new Edge(0, 1, 5));


        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));

        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        
        graph[4].add(new Edge(4,2,2));

        

    }

    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }



     public static void main(String[] args) {
        int v=5;
          ArrayList<Edge> graph[] =new ArrayList[v];
          creategraph(graph);
          dfs(graph, 0, new boolean[v]);
    }


}
