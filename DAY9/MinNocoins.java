package DAY9;
// Problem Statement: The weight of N items and their corresponding values are given. We have to put these items in a knapsack of weight W such that the total value obtained is maximized.

import java.util.ArrayList;

// Note: We can either take the item as a whole or break it into smaller units.

// Example:

// Input: N = 3, W = 50, values[] = {100,60,120}, weight[] = {20,10,30}.

//Output: 240.00
public class MinNocoins {
 public static void main(String[] args) {
    int v = 49;
    ArrayList < Integer > ans = new ArrayList < > ();
    int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
    int n = coins.length;
    for(int i=n-1;i>=0;i--){
        while(v>=coins[i]){
            v-= coins[i];
            ans.add(coins[i]);
        }
    }   
    System.out.println("The coins are: " + ans);
    System.out.println("The number of coins are: " + ans.size());
 }
}

