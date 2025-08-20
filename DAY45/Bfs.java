package DAY45;
import java.lang.reflect.Array;
import java.util.*;
public class Bfs {
    static class edge{
        int src;
        int dest;
        int wt;
        edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void creategraph(ArrayList<edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));
        graph[1].add(new edge(1, 3, 1));
        graph[1].add(new edge(1, 4, 1));
        graph[2].add(new edge(2, 5, 1));
        graph[2].add(new edge(2, 6, 1));

    }

    public static void bfs(ArrayList<edge>[] graph,int start){
         boolean visited[]=new boolean[graph.length];
         Queue<Integer> q=new LinkedList<>();
         q.add(start);
         while(!q.isEmpty()){
            int curr=q.remove();
            if(!visited[curr]){
                System.out.println("Visited Node: " + curr);
                visited[curr] = true;
                for(int i=0;i<graph[curr].size();i++){
                    edge e=graph[curr].get(i);
                    if(!visited[e.dest]){
                        q.add(e.dest);
                    }
                }
            }
         }
    }

    public static void main(String[] args) {
        int v = 7; // Number of vertices
        ArrayList<edge>[] graph = new ArrayList[v];
        creategraph(graph);
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        bfs(graph, start);
    }
}
