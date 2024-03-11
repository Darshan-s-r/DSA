package recursion.Strings;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
          subsequence("", "abc");
        System.out.println(subsequence1("", "abc"));
        System.out.println(subsequenceAscii("", "abc"));
    }

    static void subsequence( String p, String up){
        if(up.equals("")){
            System.out.println(p);
            return;
        }

            subsequence(p + up.charAt(0), up.substring(1));
            subsequence(p, up.substring(1));

    }

    static ArrayList<String > subsequence1(String p, String up){

        if(up.equals("")){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = subsequence1(p + up.charAt(0), up.substring(1));
        ArrayList<String> right  = subsequence1(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static ArrayList<String > subsequenceAscii(String p, String up){

        if(up.equals("")){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> first = subsequenceAscii(p + up.charAt(0), up.substring(1));
        ArrayList<String> second  = subsequenceAscii(p, up.substring(1));
        ArrayList<String> third  = subsequenceAscii(p + (up.charAt(0)+1), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
