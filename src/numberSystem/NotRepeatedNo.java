package numberSystem;

public class NotRepeatedNo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        int[] arr2 = {2,2,3,2,7,7,8,7,8,8};
        System.out.println(notRepeated(arr));

        int noOfRepetations = 3;
        System.out.println(notRepeated2(arr2, noOfRepetations));
    }
    static int notRepeated(int [] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }

    static int notRepeated2(int[] arr, int noOfRepitation){  //this is wrong refer bitwise and number system (1:20)time stamp for correct explanation
        int ans = 0;
        for (int i = 0; i <arr.length ; i++) {
            ans += arr[i];
        }
        return ans % noOfRepitation;
    }

}
