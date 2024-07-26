package LeetCode;

import java.util.HashSet;

public class StringToInt {
    public static void main(String[] args) {
        char ch = '6';
//        System.out.println(Integer.parseInt(ch));
        System.out.println(myAtoi("ggg460954ee"));
    }
    static public int myAtoi(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        int digit = 0;
        boolean isNegetive = s.contains("-");
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9){

                int value = s.charAt(i) - '0';
                digit = s.charAt(i) - '0';
                ans = ans * 10 + value;
            }else if(s.charAt(i)!= '-' &&  s.charAt(i)!= '+' && s.charAt(i) != ' ' && s.charAt(i) - '0' < 0 || s.charAt(i) - '0' > 9){
                break;
            }
        }
        if (Integer.MAX_VALUE / 10 < ans || Integer.MAX_VALUE / 10 == ans && Integer.MAX_VALUE % 10 < digit)
            return isNegetive ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        if(isNegetive){
            return ans * -1;
        }
       return ans;
    }
}
