package DAY32;
import java.util.*;
public class indiancoins {
    public static void main(String[] args) {
        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        int amt=580;
        int num=0;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amt){
                while(coins[i]<=amt){
                    num++;
                    amt-=coins[i];
                    ans.add(coins[i]);
                }
            }
            
        }

        System.out.println(num);
        System.out.println(ans);
       
    }
}
