package LeetCode;

public class LongesPalendromicSunString {
//    Input: s = "babad"
//    Output: "bab"
//    Explanation: "aba" is also a valid answer.
//    https://leetcode.com/problems/longest-palindromic-substring/description/

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
   static  public String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }
        if(s.length() == 2 && s.charAt(0) != s.charAt(1)){
            return s.charAt(0)+"";
        }
        String ans = "";
        for (int i = 0; i < s.length()-1; i++) {
            int j = s.length()-1;
            char start = s.charAt(i);
            while(i<j){
                if(start == s.charAt(j)){
                    int len = isSubString(s, i, j);
                    if(len !=0 && len > ans.length() ){
                        ans = s.substring(i, j+1);
                    }
                }
                j--;
            }

        }
        if(ans.equals("")){
            return s.charAt(0)+"";
        }
        return ans;
    }

    static int isSubString(String s, int i, int j) {
        int start = i;
        int end = j;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }
        if (i >= j) {
            return end - start + 1;
        } else {
            return 0;
        }
    }
}
