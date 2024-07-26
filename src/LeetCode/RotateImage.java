package LeetCode;
//https://leetcode.com/problems/rotate-image/
public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " - ");
            }
            System.out.println();
        }
    }
    static public void rotate(int[][] matrix) {
        inverse(matrix);
        for (int[] arr: matrix) {
            swap(arr);
        }
    }

    static public void inverse(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static public void swap(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1 - i];
            arr[arr.length-1 - i] = temp;
        }
    }
}
