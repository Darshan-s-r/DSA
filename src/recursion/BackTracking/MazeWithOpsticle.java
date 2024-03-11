package recursion.BackTracking;

public class MazeWithOpsticle {
    public static void main(String[] args) {
        boolean[][] maze ={{true, true, true},
                {true, false, true},
                {true, true, true}};
        printPath(maze, 0,0, "");
    }

    static void printPath(boolean[][] maze, int r, int c, String p){

        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }

        char right = 'r';
        char down = 'd';

        if(c<maze[0].length-1){
            printPath(maze, r, c+1, p+right);
        }
        if(r< maze.length-1){
            printPath(maze,r+1,c,p+down);
        }

    }

}
