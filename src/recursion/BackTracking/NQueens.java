package recursion.BackTracking;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] bord = new boolean[n][n];
        System.out.println(nQueens(bord, 0));
    }

    static int nQueens(boolean[][] bord, int r){
        if(r==bord.length){
            display(bord);
            System.out.println();
            return 1;
        }
        //placing the queen and checking for row and col
        int count = 0;
        for (int c = 0; c < bord.length; c++) {
            if(isSafe(bord, r, c)){
                bord[r][c] = true;
                count = count + nQueens(bord, r+1);
                bord[r][c] = false;
            }
        }
        return count;
    }

    static void display(boolean[][] bord){
        for (boolean []row: bord) {
            for (boolean ele : row){
                if(ele){
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static boolean isSafe(boolean[][] bord, int r, int c){
        //check for vertical row
        for (int i = 0; i < r; i++) {
            if(bord[i][c]){
                return false;
            }
        }
        //for diagonal left side
        int maxLeft = Math.min(r, c);
        for (int i=1; i<=maxLeft;i++){
            if(bord[r-i][c-i]){
                return false;
            }
        }

        //diagonal right
        int maxRight = Math.min(r, bord.length-c-1);
         for (int i=1;i<=maxRight;i++){
             if(bord[r-i][c+i]){
                 return false;
             }
         }
         return true;
    }
}
