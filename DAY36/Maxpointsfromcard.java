package DAY36;

public class Maxpointsfromcard {
   
     public static  int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=cardPoints[i];
        }

        if(k==n) return total;

        int windowsize=n-k;
        int windowsum=0;
        for(int i=0;i<windowsize;i++){
            windowsum+=cardPoints[i];
        }

        int minsum=windowsum;
        for(int i=windowsize;i<n;i++){
            windowsum+=cardPoints[i]-cardPoints[i-windowsize];
            minsum=Math.min(minsum,windowsum);
        }
        return total-minsum;
    }


    public static void main(String[] args) {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k=3;
        System.out.println(maxScore(cardPoints, k));
    }
}
