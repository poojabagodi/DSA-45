package DAY30;
import java.util.*;
public class maxsumsubarray {
    public static void main(String[] args) {
        int sum=0;
        int maxsum=0;
        int arr[]={-1,5,-2,3,-4};
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<prefix.length;i++){
            for(int j=i;j<prefix.length;j++){
                sum=i==0 ? prefix[j]:prefix[j]-prefix[i-1];
                if(maxsum<sum){
                    maxsum=sum;
                }
            }
        }

        System.out.println(maxsum);
    }
}
