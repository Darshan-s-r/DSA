package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][] {{1,2,3},{4,5,6},{7,8,9}}));
    }
    static public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int x = 0;
        int y = 0;
        int dx = 1;
        int dy = 0;
        char[][] temp = new char[row][col];
        List<Integer> ans  = new ArrayList<>();
        for(int i = 0; i<(row * col); i++){

            temp[x][y] = '.';
            ans.add(matrix[x][y]);
            x = x+dx;
            y = y+dy;
            if(x < 0 || x >= row-1 || y<0 || y>= col-1 || temp[x][y] == '.' ){
                int t = dx;
                dx = -dy;
                dy = t;
                x = x+dx;
                y = y+dy;
            }
        }
        return ans;
    }
}
