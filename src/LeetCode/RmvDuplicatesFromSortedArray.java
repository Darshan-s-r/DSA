package LeetCode;

public class RmvDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j - 1] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }

        }
        return j;

    }
}
