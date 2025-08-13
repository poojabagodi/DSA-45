package DAY41;

public class spiral {
    public static void printspiral(int[][] arr){
      int start_col=0;
      int start_row=0;
      int endrow=arr.length-1;
      int endcol=arr[0].length-1;
      while(start_row<=endrow && start_col<=endcol){
        for(int j=start_col;j<=endcol;j++){
            System.out.print(arr[start_row][j]+" ");
        }
        for(int i=start_row;i<=endrow;i++){
            System.out.print(arr[i][endcol]+" ");
        }

        for(int j=endcol;j>=start_col;j--){
            if(start_row==endrow){
                break;
            }
            System.out.print(arr[endrow][j]+" ");
        }
        for(int i=endrow;i>=start_row;i--){
            if(start_col==endcol){
                break;
            }
            System.out.print(arr[i][start_col]+" ");
        }
        start_row++;
        start_col++;
        endcol--;
        endrow--;

      }
    }
}
