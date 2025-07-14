package DAY17;

public class spiralmatrix {
    public static void spiral(int[][] arr){
         int startrow=0,startcol=0,endrow=arr.length-1,endcol=arr[0].length-1;
         while(startcol<=endcol && startrow<=endrow){
                //top
                for(int j=startcol;j<=endcol;j++){
                    System.out.print(arr[startrow][j]);
                }

                //left
                for(int i=startrow;i<=endrow;i++){
                    System.out.print(arr[i][endcol]);
                }

                //bottom
                for(int j=endcol;j>=startcol;j--){
                    if(startrow==endrow){
                        break;
                    }
                    System.out.print(arr[endrow][j]);
                }

                //right
                for(int i=endrow;i>=startrow;i--){
                    if(startcol==endcol){
                        break;

                    }
                    System.out.print(arr[i][startcol]);
                }


                startcol++;
                startrow++;
                endcol--;
                endrow--;

         }

         
    }
}
