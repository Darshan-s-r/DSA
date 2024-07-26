package LeetCode;

public class RomanTOInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("LIV"));
    }
    static public int romanToInt(String s) {
        char symbol[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int value[] = {1, 5, 10, 50, 100, 500, 1000};
        char ch[] = s.toCharArray();
        int sum = 0;
        for (int i = 0; i< ch.length; i++) {
            int val1 = value[findIndex(ch[i], symbol)];
            if(i+1 < ch.length){
                int val2 = value[findIndex(ch[i+1], symbol)];
                if(val1 < val2){
                    sum = sum - val1;
                }else{
                    sum = sum + val1;
                }
            }else{
                sum = sum + val1;
            }
        }
        return sum;

    }

    static int findIndex(char ch, char [] symbbol){
        for (int i = 0; i < symbbol.length; i++) {
            if(ch == symbbol[i]){
                return i;
            }
        }
        return -1;
    }
}
