package LeetCode;

public class CountNumbers {
    public static void main(String[] args) {
        System.out.println(count("slndsn0193j01jd1"));
        System.out.println(addNumbers("slndsn0153j01jd1"));

    }
    static public int count(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int  value = str.charAt(i) - '0';
            if(value >-1 && value <10){
                count++;
            }
        }
        return count;
    }

    static public int addNumbers(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int  value = str.charAt(i) - '0';
            if(value >-1 && value <10){
                sum+= value;
            }
        }
        return sum;
    }
}
