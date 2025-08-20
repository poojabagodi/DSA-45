package DAY45;

import java.util.*;

public class Dfs {
   static class edge{
         int src;
         int dest;
         edge(int s, int d){
             this.src = s;
             this.dest = d;
         }
   }
   public static void dfs(ArrayList<edge>[] graph, int src, boolean[] visited) {
    
       visited[src] = true;
       System.out.println("Visiting: " + src);
       for(edge e : graph[src]) {
           if(!visited[e.dest]) {
               dfs(graph, e.dest, visited);
           }
       }
   }

   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();

    ArrayList<edge>[] graph = new ArrayList[n+1];
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
    }
    for(int i=0;i<m;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        graph[a].add(new edge(a, b));
        graph[b].add(new edge(b, a));
    }

    
    dfs(graph,sc.nextInt(), visited);


   }
}
