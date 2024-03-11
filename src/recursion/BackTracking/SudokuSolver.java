//https://leetcode.com/problems/sudoku-solver/
package recursion.BackTracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(solve(board)){
            display(board);
        }else {
            System.out.println("cannot solve");
        }

    }

    static boolean solve(int[][] bord){
        int n = bord.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        //this is how we are replacing the r, c from the arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(bord[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            //if you found some empty elements in row, then break
            if(emptyLeft == false){
                break;
            }
        }
        if (emptyLeft == true){
            return true;
            //sudoku is solved
        }
        //back track
        for (int number = 1; number <= 9 ; number++) {
            if(isSafe(bord, row, col, number)){
                bord[row][col] = number;
                if(solve(bord)){
                    //found the ans
                    return true;
                }
                else {
                    bord[row][col] = 0;
                }
            }
        }
        return false;
    }
    static boolean isSafe(int[][] bord, int r, int c, int num){
        //check row
        for (int i = 0; i < bord.length; i++) {
            //check if the number is in the row
            if(bord[r][i] == num){
                return false;
            }
        }

        for(int[] nums : bord){
            //check if the number is in the col
            if(nums[c]==num){
                return false;
            }
        }

        //check for the inner square
        int sqrt = (int)(Math.sqrt(bord.length));
        int rowStart = r - r%sqrt;
        int colStart = c - c%sqrt;

        for (int i = rowStart; i < rowStart+sqrt; i++) {
            for (int j = colStart; j < colStart+sqrt; j++) {
                if(bord[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }

    static void display(int[][] bord){
        for(int[] row : bord){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
