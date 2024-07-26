import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4, 3,6, 8, 5, 7,10, 9};

        System.out.println(Arrays.toString(sortArr(arr)));
    }
    static public int[] sortArr(int[] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if(x[j] > x[i]){
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        return x;
    }

}
