package DAY9;
import java.io.IOException;
import java.util.*;

class job{
   int id, profit, deadline;
   job(int x, int y, int z) {
      this.id = x;
      this.deadline = y;
      this.profit = z;
   }
}
public class Jobsequence {
      int[] jobscheduling(job arr[],int n){
      Arrays.sort(arr,(a,b)->(b.profit-a.profit));
      int maxi = 0;
      for (int i = 0; i < n; i++) {
         if (arr[i].deadline > maxi) {
            maxi = arr[i].deadline;
         }
      }

       int result[]=new int[maxi+1];
       for(int i=1;i<=maxi;i++){
        result[i]=-1;
       }
      int countJobs = 0, jobProfit = 0;
        for(int i=0;i<n;i++){
          for(int j=arr[i].deadline;j>0;j--){
            if(result[j]==-1){
                result[j]=i;
                countJobs++;
                jobProfit += arr[i].profit;
                break;
            }
          }
        }

        int ans[] = new int[2];
      ans[0] = countJobs;
      ans[1] = jobProfit;
      return ans;
      }
      public static void main(String[] args) throws IOException {

      //size of array
      
      }
}
