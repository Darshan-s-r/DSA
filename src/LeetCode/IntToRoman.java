package LeetCode;

class IntToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(2429));
    }
   static public String intToRoman(int num) {  ///  2429
       int [] values = {         1000, 900,  500, 400, 100,  90,   50,  40,  10,    9,    5,   4,   1};
       String [] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
       StringBuilder str = new StringBuilder();
       for(int i = 0; i<values.length; i++){
           while(num >= values[i]){
               str.append(romanLetters[i]); //MMCDXXIV
               num = num - values[i];
           }
       }
       return str.toString();
    }
}