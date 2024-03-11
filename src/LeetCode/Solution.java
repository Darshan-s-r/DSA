package LeetCode;
import java.util.HashMap;


class Solution {
    public static void main(String[] args) {
        System.out.println(wordPattern("aba", "dog cat cat"));
    }

    static public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length)
            return false;

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(words[i])) {
                    return false; // Pattern-character to word mapping is incorrect
                }
            } else {
                if (map.containsValue(words[i])) {
                    return false; // Word is mapped to another pattern-character already
                }
                map.put(c, words[i]);
            }
        }
        return true;
    }
}
