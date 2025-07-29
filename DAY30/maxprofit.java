package DAY30;

public class maxprofit {
    public static int maxp(int arr[]){
        int buyprice=Integer.MAX_VALUE;
        int maxp=0;
        for(int i=0;i<arr.length;i++ ){
           if(buyprice<arr[i]){
           int  profit=arr[i]-buyprice;
            maxp=Math.max(maxp,profit);
           }
           else{
            buyprice=arr[i];
           }
        }
        return maxp;
    }
}
