package Temp;

import java.util.Scanner;

public class TickTockTou {
    public static void main(String[] args) {
       play();
    }

    static public void play(){
        char [][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = ' ';
            }
        }
        char player = 'X';
        while(true){
            print(board);
            if(hasPlace(board)){
                Scanner s = new Scanner(System.in);
                System.out.println("player " + player + " enter the position");
                int row = s.nextInt();
                int col = s.nextInt();
                if(row < board[0].length && row >= 0 && col < board[0].length && col >= 0 && board[row][col] == ' '){
                    board[row][col] = player;

                    boolean won = haveWon(board, player);
                    if(won){
                        System.out.println("player " + player + " has won");
                        print(board);
                        return;
                    }else{
                        player = (player == 'X') ? 'O' : 'X';
                    }
                }else{
                    System.out.println("INVALID MOVE TRY AGAIN");
                }
            }else{
                System.out.println("NO MORE MOVE GAME OVER");
                return;
            }


        }
    }

    static private boolean hasPlace(char [][]board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == ' '){
                    return true;
                }
            }
        }
        return false;
    }

    static private void print(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print( board[i][j] + " |");
            }
            System.out.println();
        }
    }

    static private boolean haveWon(char[][] board, char player){
        for (int i = 0; i < board[0].length; i++) {
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player){
                return true;
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            if(board[0][i] == player && board[1][i] == player && board[2][i] == player){
                return true;
            }
        }
        if(board[0][0] == player && board[1][1] == player && board[1][1] == player){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }
}
