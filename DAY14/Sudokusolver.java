package DAY14;

public class Sudokusolver {
   


    public static boolean isSafe(char sudoko[][],int row,int col,char digit){
        //column
        for(int i=0;i<=8;i++){
            if(sudoko[i][col]==digit){
                return false;
            }
        }
        
        //row
        for(int j=0;j<=8;j++){
            if(sudoko[row][j]==digit){
                return false;
            }
        }
        //grid
        int startingrow=(row/3)*3;
        int startingcol=(col/3)*3;

        for(int i=startingrow;i<startingrow+3;i++){
            for(int j=startingcol;j<startingcol+3;j++){
                if(sudoko[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokosolver(char sudoko[][],int row,int col){
        if(row==9){
            return true;
        }
        int nextrow=row,nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(sudoko[row][col]!='.'){
            return sudokosolver(sudoko,nextrow,nextcol);
        }
        for(int i=1;i<=9;i++){
            char digichar=(char)(i+'0');
            if(isSafe(sudoko,row,col,digichar)){
                sudoko[row][col]=digichar;
                if(sudokosolver(sudoko,nextrow,nextcol)){
                    return true;
                }
                sudoko[row][col]='.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        sudokosolver(board,0,0);
    }

}
