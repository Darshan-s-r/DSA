package recursion.patterns;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int []arr = {6, 4, 2, 9, 3};
        selectionSort(arr, 0, arr.length, 0);
        System.out.println(Arrays.toString(arr));
        
    }
    static void selectionSort(int arr[], int c, int r, int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                max = arr[c];
                selectionSort(arr, c+1, r, c);
            }else {
                selectionSort(arr, c+1, r, max);
            }
//
        }
        else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr, 0, r-1, 0);
        }

    }

}
