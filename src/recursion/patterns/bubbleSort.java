package recursion.patterns;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int []arr = {6, 4, 2, 9, 3};
        bubble(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int arr[], int c, int r){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr, c+1, r);
        }
        else {
            bubble(arr, 0, r-1);
        }

    }
}
