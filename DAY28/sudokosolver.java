package DAY28;

public class sudokosolver {
    public static boolean isSafe(int sudoko[][],int row,int col,int digit){
        for(int i=0;i<9;i++){
           if(sudoko[i][col]==digit){
            return false;
           }
        }
        for(int i=0;i<9;i++){
           if(sudoko[row][i]==digit){
            return false;
           }
        }

        int startrow=(row/3)*3;
        int startcol=(row/3)*3;

        for(int i=startrow;i<startrow+3;i++){
            for(int j=startcol;j<startcol+3;j++){
                if(sudoko[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }


    public static boolean sudokosolver(int sudoko[][],int row,int col){
        if(row==9){
            //print(sudoko);
            return true;
        }
        int nextrow=row,nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(sudoko[row][col]!=0){
            return sudokosolver(sudoko, nextrow, nextcol);
        }
        for(int digit=1;digit<=9;digit++){
          if( isSafe(sudoko, row, col, digit)){
                 sudoko[row][col]=digit;
                 if(sudokosolver(sudoko, nextrow, nextcol)){
                    return true;
                 }
                 sudoko[row][col]=0;
           }
        }
        return false;
    }
}
