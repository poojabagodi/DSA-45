package DAY41;
import java.util.*;
public class searchinsortedmatrix {
    public static boolean isfound(int matrix[][],int key){
         int row=0;
         int col=matrix[0].length-1;
         while(row<=matrix.length-1 && col>=0){
            if(matrix[row][col]==key){
                System.out.println("key found ");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
         }
         return false;

    }
}
