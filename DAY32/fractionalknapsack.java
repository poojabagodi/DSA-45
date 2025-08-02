package DAY32;
import java.util.*;
public class fractionalknapsack {
    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[]={10,20,30};
        double ratio[][]=new double[value.length][2];
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)(weight[i]);

        }
     double maxval=0.0;
     int cap=50;
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
           if(cap>=weight[idx]){
            maxval+=value[idx];
            cap-=weight[idx];
           }
           else{

              maxval+=cap*ratio[i][1];
              cap=0;
              break;

           }
        }

        System.out.println(maxval);
    }
}
