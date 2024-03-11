package recursion.arrayQuestions;

public class Sorted {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1,2,2,4,6, 9, 23}));
    }

    static boolean isSorted(int[] arr){
        if(arr.length == 1){
            return true;
        }
        return helper(arr, 0);
    }

    private static boolean helper(int arr[], int i){
        if(i == arr.length -1){
            return true;
        }
        return (arr[i] <= arr[i+1]) && helper(arr, i+1);


    }

}
