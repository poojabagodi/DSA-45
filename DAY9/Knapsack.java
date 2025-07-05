package DAY9;
/**
 * This class represents a Knapsack problem solution.
 * It is currently empty and can be filled with methods and properties
 * to solve the Knapsack problem using various algorithms.
 */
import java.util.*;
class Item{
    int value;
    int weight;
    Item(int value,int weight){
        this.value = value;
        this.weight = weight;
    }
}
class itemcomparator implements Comparator<Item>{
    @Override
    public int compare(Item a,Item b){
        double r1=(double)a.value/(double)a.weight;
        double r2=(double)b.value/(double)b.weight;
        if(r1<r2){
            return -1;
        }
        else if(r1>r2){
            return 1;
        }
        else{
            return 0;
        }
    }
}
public class Knapsack {
     static double fractionalKnapsack(int W,Item arr[],int n){
        Arrays.sort(arr,new itemcomparator());
        int currWeight=0;
        double finalval=0.0;
        for(int i=0;i<n;i++){
             if(currWeight+arr[i].weight<=W){
                currWeight+=arr[i].weight;
                finalval +=arr[i].value;
             }
             else{
                int remain=W-currWeight;
                finalval +=((double)arr[i].value/(double)arr[i].weight)*remain;
                break;
             }
        }
        return finalval;
     }
}
