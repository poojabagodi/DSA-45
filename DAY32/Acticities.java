package DAY32;
import java.util.*;
public class Acticities {
    public static void main(String[] args) {

      int start[] = {2, 1, 3, 5, 7, 6};
int end[]   = {4, 3, 5, 8, 9, 10};
        int actvity[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
                actvity[i][0]=i;
                actvity[i][1]=start[i];
                actvity[i][2]=end[i];
        }
        Arrays.sort(actvity,Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer> ans=new ArrayList<>();
        int maxact=1;
        ans.add(actvity[0][0]);
        int lastend=actvity[0][2];
        for(int i=1;i<start.length;i++){
            if(start[i]>=lastend){
                maxact++;
                ans.add(actvity[i][0]);
                lastend=actvity[i][2];
            }
        }
          System.out.println(maxact);
    }
}




//when sorted according to end time;
// ArrayList<Integer> ans=new ArrayList<>();
//         int start[]={1,3,0,5,8,5};
//         int end[]={2,4,6,7,9,9};
//         int maxact=1;
//         int lastend=end[0];
//         ans.add(0);
//         for(int i=1;i<start.length;i++){
//              if(start[i]>=lastend){
//                 maxact++;
//                 ans.add(i);
//                 lastend=end[i];
//              }
//         }
//         System.out.println(maxact);
