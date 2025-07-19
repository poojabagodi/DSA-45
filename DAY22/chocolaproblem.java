package DAY22;
import java.util.*;
public class chocolaproblem {
    public static void main(String args[]){
     Integer costver[]={2,1,3,1,4};
     Integer costhor[]={4,1,2};
     Arrays.sort(costver,Collections.reverseOrder());
     Arrays.sort(costhor,Collections.reverseOrder());

     int h=0,v=0;
     int hp=1,vp=1;
     int cost=0;

     while(h<costhor.length && v<costver.length){
        if(costhor[h]>=costver[v]){//horizontal cut
           cost+=(costhor[h]*vp);
           h++;
           vp++;
        }
        else{//vertical
            cost+=(costver[v]*hp);
            v++;
            hp++;

        }
     }
     while(h<costhor.length){
        cost+=(costhor[h]*vp);
           h++;
           vp++;
     }
     while(v<costver.length){
        cost+=(costver[v]*hp);
            v++;
            hp++;
     }

     System.out.println("total cost: "+cost);
     
    }
}
