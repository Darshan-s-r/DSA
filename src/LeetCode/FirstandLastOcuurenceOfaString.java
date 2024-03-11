package LeetCode;

import java.util.Arrays;

public class FirstandLastOcuurenceOfaString {
    public static void main(String[] args) {
        String str = "abcaaga";
        findOccurance(str,0,'a');
       // System.out.println(Arrays.toString(find("easdfgad", 'f')));
    }
//    static int[] find(String str, char a){
//        int first = -1;
//        int last = -1;
//        boolean firstDone = false;
//        for (int i = 0; i < str.length(); i++) {
//            if(a == str.charAt(i)){
//                if(firstDone){
//                    last = i;
//                }else{
//                    first = i;
//                   firstDone = true;
//                }
//
//            }
//        }
//        return new int[] {first, last};
//    }
    static int first = -1;
    static int last = -1;
    public static void findOccurance(String str, int idx, char element) {

            if(idx == str.length()){
                System.out.println(first);
                System.out.println(last);
                return;
            }
            char currChar = str.charAt(idx);

            if(currChar == element) {
                if (first == -1) {
                    first = idx;
                } else {
                    last = idx;
                }
            }

            findOccurance(str,idx+1,element);


    }
}
