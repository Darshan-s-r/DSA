package recursion.Strings;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutation("", "abc");
        System.out.println(permutation1("", "abc"));
        System.out.println(permutationCount("", "abc"));
    }

    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            permutation(p.substring(0,i)+ch+p.substring(i, p.length()), up.substring(1));
        }
    }

    static ArrayList<String> permutation1(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            list.addAll(permutation1(p.substring(0,i)+ch+p.substring(i, p.length()), up.substring(1)));
        }
        return list;
    }

    static int permutationCount(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            count = count + permutationCount(p.substring(0,i)+ch+p.substring(i, p.length()), up.substring(1));
        }
        return count;
    }
}
