package pattern;

public class Pattern {
    public static void main(String[] args) {
        int n= 5;
        pattern31(n);
    }
    static void pattern2(int n){
        for(int row = 1;row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n ; col++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    static void pattern3(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    static void pattern4(int n){
        for (int row = 0; row <n ; row++) {
            for (int col = 0; col <n-row ; col++) {
                System.out.print(col+1);
            }
            System.out.println("\n");
        }

    }

    static void pattern5(int n){
        for (int row = 0; row <2 * n  ; row++) {
            int totalCol = row > n ? 2*n - row : row;
            for (int col = 0; col < totalCol ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern28(int n){
        for (int row = 0; row <2 * n  ; row++) {
            int totalCol = row > n ? 2*n - row : row;
            int spacees = n-totalCol;
            for (int s = 0; s < spacees; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalCol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    static void pattern30(int n){
        for (int row = 1; row <=n ; row++) {
            int spaces = n-row;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }
            for (int i = row; i >= 1 ; i--) {
                System.out.print( " " + i);
            }
            for (int i = 2; i <= row ; i++) {
                System.out.print(" " + i );
            }
            System.out.println("\n");
        }

    }


    static void pattern17(int n){
        for (int row = 1; row <= 2 * n -1 ; row++) {
            int spaces = n-row;
            int col = row <=n ? row : 2 * n - row;

            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }
            int space2 = row - n;
            for (int s = space2; s >=1 ; s--) {
                System.out.print("  ");
            }
            for (int i = col; i >= 1 ; i--) {
                System.out.print( " " + i);
            }
            for (int i = 2; i <= col ; i++) {
                System.out.print(" " + i );
            }
            System.out.println("\n");
        }

    }



    static void pattern31(int n){  // for more info watch solve any pattern 50:00
        int originalN = n;
        n= 2 * n - 1;
        for (int row = 0; row <=n ; row++) {
            for (int col = 0; col <=n; col++) {
                int innerNo = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(innerNo + " ");
            }

            System.out.println("\n");
        }

    }


}
