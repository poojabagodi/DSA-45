package DAY31;
import java.util.*;
public class haspath {
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

     public static boolean haspath(ArrayList<Edge> graph[],int src,int dest,boolean vis[]){
           if(src==dest){
            return true;
           }
           vis[src]=true;
           for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!vis[e.dest] && haspath(graph, e.dest, dest, vis)){
                return true;
            }
           }
           return false;
     }

      public static void main(String[] args) {
        int v=5;
          ArrayList<Edge> graph[] =new ArrayList[v];
          creategraph(graph);
          System.out.println(haspath(graph, 0, 4, new boolean[v]));
    }

}
