package recursion.BackTracking;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MazeWith4sideTravel {
    public static void main(String[] args) {
        boolean[][] maze ={{true, true, true},
                {true, true, true},
                {true, true, true}};
//        printPathWith4side(maze, 0,0, "");
        int[][] path = new int[maze.length][maze[0].length];
        printPathWith4sideWithNum(maze, 0, 0, "", path, 1);
    }


    static void printPathWith4side(boolean[][] maze, int r, int c, String p) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false) {
            return;
        }
    //i am considering this block in my path
        maze[r][c] = false;

        char right = 'r';
        char down = 'd';

        if (c < maze[0].length - 1) {
            printPathWith4side(maze, r, c + 1, p + right);
        }
        if (r < maze.length - 1) {
            printPathWith4side(maze, r + 1, c, p + down);
        }

        if (c < maze[0].length - 1 && c>0) {
            printPathWith4side(maze, r, c -1, p + 'l');
        }
        if (r < maze.length - 1 && r>0) {
            printPathWith4side(maze, r - 1, c, p + 'u');
        }
    //this line is where the function will be over
        //so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;

    }

    static void printPathWith4sideWithNum(boolean[][] maze, int r, int c, String p, int[][] path, int step) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            System.out.println(p);
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            return;
        }
        if (maze[r][c] == false) {
            return;
        }

        //i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;

        char right = 'r';
        char down = 'd';

        if (c < maze[0].length - 1) {
            printPathWith4sideWithNum(maze, r, c + 1, p + right, path,step+1 );
        }
        if (r < maze.length - 1) {
            printPathWith4sideWithNum(maze, r + 1, c, p + down, path,step+1 );
        }

        if (c>0) {
            printPathWith4sideWithNum(maze, r, c -1, p + 'l', path,step+1 );
        }
        if (r>0) {
            printPathWith4sideWithNum(maze, r - 1, c, p + 'u', path,step+1 );
        }
        //this line is where the function will be over
        //so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;

    }
}
