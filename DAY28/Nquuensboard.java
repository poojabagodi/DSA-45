package DAY28;

public class Nquuensboard {
   
    public static boolean isSafe(char Board[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(Board[i][col]=='Q'){
                return false;
            }
        }


        for(int i=row-1,j=col+1;i>=0&&j<Board[0].length;i--,j++){
                if(Board[i][j]=='Q'){
                    return false;
                }
        }

         for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
                if(Board[i][j]=='Q'){
                    return false;
                }
        }
        return true;

    }


    public static void nqueens(char Board[][],int row){
        if(row==Board.length){
          print(Board);
          return;
        }
        for(int j=0;j<Board[0].length;j++){
           if(isSafe(Board,row,j)){
            Board[row][j]='Q';
            nqueens(Board, row+1);
            Board[row][j]='X';
           }

        }
    }


    public static void print(char Board[][]){
        for(int i=0;i<Board.length;i++){
            for(int j=0;j<Board[0].length;j++){
                System.out.print(" "+Board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int n=4;
        char Board[][]=new char[n][n];
          for(int i=0;i<Board.length;i++){
            for(int j=0;j<Board[0].length;j++){
              Board[i][j]='X';
            }
            
        }


        nqueens(Board, 0);
    }
}


