package LeetCode;

import java.math.BigInteger;
//====================  NOT WORKING======================


public class MultiplyString {
    public static void main(String[] args) {
        System.out.println(multiply("134", "143"));
    }
    public static String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        String str = "0000";
        StringBuilder sb = new StringBuilder("000000");
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, '0');
        }
        for (int i = n-1; i >= 0 ; i--) {
            int digit1 = num1.charAt(i) - '0';
            int carry = 0;
            for (int j = m-1; j >=0 ; j--) {
                int prevChar = sb.charAt(i+j + 1) - '0';
                int digit2 = num2.charAt(j) - '0';
                int produt = (digit1 * digit2) + prevChar + carry;
                int currentChar = produt % 10;
                carry = produt/10;
                sb.setCharAt(i+j + 1, (char) (currentChar + '0'));
            }
            if(carry > 0){
                sb.setCharAt(i, (char) (carry + '0'));
            }
        }
        while(sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }

}



