package LeetCode;
import java.util.HashSet;

class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    static public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int leftPointer = 0;
        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            if (set.contains(s.charAt(rightPointer))) {
                while (set.contains(s.charAt(rightPointer))) {
                    set.remove(s.charAt(leftPointer));
                    leftPointer++;
                }
                set.add(s.charAt(rightPointer));
            } else {
                set.add(s.charAt(rightPointer));
            }
            max = Math.max(max, (rightPointer - leftPointer) + 1);
        }
        return max;
    }
}