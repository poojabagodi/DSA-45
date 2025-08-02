package DAY32;
import java.util.*;
public class maxlengthchain {
    public static void main(String[] args) {
        int[][] pairs = {
    {5, 24},
    {15, 25},
    {27, 40},
    {50, 60},
    {39, 41},
    {29, 30},
    {10, 20},
    {1, 2},
    {3, 50},
    {45, 55}
};

Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
int len=1;
int lastend=pairs[0][1];
for(int i=1;i<pairs.length;i++){
    if(pairs[i][0]>lastend){
        len++;
        lastend=pairs[i][1];
    }
}

System.out.println("total pairs:"+len);
    }
}
