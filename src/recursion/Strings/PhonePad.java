//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

package recursion.Strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        combination("", "12");
        System.out.println(combinationRet("", "12"));
        System.out.println(combinationCount("", "12"));
    }

    static void combination(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';

        for (int i = (digit - 1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            combination(p+ch, up.substring(1));
        }

    }

    static ArrayList<String> combinationRet(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';

        for (int i = (digit - 1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(combinationRet(p+ch, up.substring(1)));
        }
        return list;
    }

    static int combinationCount(String p, String up){
        int count = 0;
        if(up.isEmpty()){
            return count;
        }
        int digit = up.charAt(0)-'0';

        for (int i = (digit - 1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            count = count + combinationCount(p+ch, up.substring(1));
        }
        return count;
    }
}
