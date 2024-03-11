package recursion.BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        printPath(3, 3, "");
//        System.out.println(returnPath(3,3,""));
        printPathWithDiagonol(3, 3,"");

    }

    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int right = count(r, c-1);
        int left = count(r-1, c);
        return right + left;
    }

    static void printPath(int r, int c, String p){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        char right = 'r';
        char down = 'd';

        if(c>1){
            printPath(r, c-1, p+right);
        }
        if(r>1){
            printPath(r-1,c,p+down);
        }

    }

    static ArrayList<String> returnPath(int r, int c, String p){
        ArrayList<String> list = new ArrayList<>();
        if(r==1 && c==1){
            list.add(p);
            return list;
        }
        char right = 'r';
        char down = 'd';

        if(c>1){
           list.addAll(returnPath(r, c-1, p+right));
        }
        if(r>1){
            list.addAll(returnPath(r-1,c,p+down));
        }
        return list;
    }

    static void printPathWithDiagonol(int r, int c, String p){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        char right = 'H';
        char down = 'V';

        if(c>1){
            printPathWithDiagonol(r, c-1, p+right);
        }
        if(r>1){
            printPathWithDiagonol(r-1,c,p+down);
        }
        if(c>1 && r>1){
            printPathWithDiagonol(r-1,c-1,p+"D");
        }

    }
}
