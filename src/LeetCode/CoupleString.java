package LeetCode;

public class CoupleString {
    public static void main(String[] args) {
        System.out.println(map("paper", "title"));
    }

    static public String map(String str1, String str2){
//        StringBuilder mappedStr1 = new StringBuilder(str1);
        String str = "";
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            if(!str.contains(ch1+"")){
                str = str+ch1;
                str1.replaceAll(ch1+"", ch1+"");
            }
        }

        if (str1.equals(str2)) {
            return "Yes";
        } else {
            return "No";
        }
    }

}

