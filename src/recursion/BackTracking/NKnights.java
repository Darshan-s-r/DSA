package recursion.BackTracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);
    }

    static void knight(boolean[][] bord, int r, int c, int knights){
        if(knights == 0){
            display(bord);
            System.out.println();
            return;
        }

        if(r == bord.length - 1 && c == bord.length){
            return;
        }
        if(c == bord.length){
            knight(bord, r+1, 0, knights);
            return;
        }
        if(isSafe(bord, r, c)){
            bord[r][c] = true;
            knight(bord, r, c+1, knights-1);
            bord[r][c] = false;
        }
        knight(bord, r, c+1, knights);
    }

    static boolean isSafe(boolean[][] bord, int r, int c){
        if(isValid(bord, r-2, c-1)){
            if(bord[r-2][c-1]){
                return false;
            }
        }

        if(isValid(bord, r-2, c+1)){
            if(bord[r-2][c+1]){
                return false;
            }
        }

        if(isValid(bord, r-1, c-2)){
            if(bord[r-1][c-2]){
                return false;
            }
        }

        if(isValid(bord, r-1, c+2)){
            if(bord[r-1][c+2]){
                return false;
            }
        }
        return true;
    }

    //do not repeate your self so create this function
    static boolean isValid(boolean[][] bord, int r, int c){
        if(r >= 0 && r < bord.length && c >=0 && c < bord.length){
            return true;
        }
        return false;
    }

    static void display(boolean[][] bord){
        for (boolean []row: bord) {
            for (boolean ele : row){
                if(ele){
                    System.out.print("k ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
