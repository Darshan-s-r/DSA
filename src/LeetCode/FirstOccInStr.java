package LeetCode;

public class FirstOccInStr {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issipi"));
//        System.out.println((Integer)("10"));
    }
    static public int strStr(String haystack, String needle) {
        if(haystack.isEmpty() || needle.isEmpty()){
            return -1;
        }
        if( needle.length() > haystack.length()){
            return -1;
        }
        int i = 0;
        while(i < haystack.length()){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(compaire(haystack, needle, i)){
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    static boolean compaire(String str1, String str2, int i){
        int j = 0;
        boolean isSubStr = false;
        while(j < str2.length() && i<str1.length()){
            if(str1.charAt(i) != str2.charAt(j)){
               return false;
            }else{
                i++;
                j++;
                isSubStr = true;
            }

        }
         if(j<str2.length()){
                return false;
         }

        return isSubStr;
    }
}
