package DAY14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Nqueens {
    
    public static boolean isSafe(char board[][], int row, int col) {
        // Check vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

   public static void nQueens(char board[][], int row,List<List<String>> results) {
          
          
       if(row == board.length) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                solution.add(String.valueOf(board[i]));
            }
            results.add(solution);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1,results);
                board[row][j] = '.'; // Backtrack with char '.'
            }
        }
    }

    

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        List<List<String>> results = new ArrayList<>();
        nQueens(board, 0, results);
        return results;
    }
}

