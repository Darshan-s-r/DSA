package Temp;

public class Parantesis {
    public static void main(String[] args) {
        System.out.println(removeP("(()())(()()())"));
    }

   static String removeP(String str){
        String str2 = "";
        for(int i = 0; i<str.length() -1; i++){
            if(str.charAt(i) == '('){
                if(str.charAt(i+1) == ')'){
                    str2 = str2 + str.charAt(i) + str.charAt(i+1);
                }
            }
        }
        return str2;
   }
}
