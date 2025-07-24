package DAY26;
import java.util.*;
public class nearbycars {

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    static class point implements Comparable<point>{
        int x;
        int y;
        int distq;
        int idx;
        point(int x,int y,int distq,int idx){
            this.x=x;
            this.y=y;
            this.distq=distq;
            this.idx=idx;
            
        }
        
        @Override
        public int compareTo(point p2){
            return this.distq-p2.distq;
        }
        
    }
    public static void main(String[] args) {
       int cars[][]={{3,3},{5,-1},{-2,4}};
       int k=2;
       PriorityQueue<point> pq=new PriorityQueue<>();
       for(int i=0;i<cars.length;i++){
           int distq=cars[i][0]*cars[i][0]+cars[i][1]*cars[i][1];
           pq.add(new point(cars[i][0],cars[i][1],distq,i));
           
       }
       
       for(int i=0;i<k;i++){
           System.out.println("C"+pq.remove().idx);
       }
       
       
    }
}
}












