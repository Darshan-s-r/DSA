package strings;

public class Palendrom {
    public static void main(String[] args) {
        String str = "";
        System.out.println(isPalendrom(str));
    }
    public static boolean isPalendrom(String str) {
        if(str == null || str.length() == 0 ){
            return false;
        }
        str = str.toLowerCase();
        int len = str.length();
        int start = 0;
        int end = len - 1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }

        return true;
    }
}
