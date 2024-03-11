package recursion.eassy;

public class ReverseAnNumber {
    public static void main(String[] args) {
        System.out.println(reverse2(1234));
        reverse3(1234);
        System.out.println(sum);
        System.out.println(reverse4(123456));
    }
    static int reverse(int n){
        int rem = 0;
        int ans = 0;
        while (n > 0){
         rem = (n % 10);
         ans = (ans + rem) * 10;
         n = n/10;
        }
        return ans/10;
    }

    static String reverse2(int n){
        if(n < 10){
            return Integer.toString(n);
        }

        return n%10 + reverse2(n/10);
    }

    static int sum = 0;
    static void reverse3(int n){

        if(n == 0    ){
            return; 
        }
        int rem = n%10;
        sum = sum *10 + rem;
        reverse3(n/10);
    }

    static int reverse4(int n){
        // sometimes you migth need some additional variables in the argument
        // in that case, make another function
        int digits = (int)Math.log10(n)+1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits){
        if(n < 10){
            return n;
        }
        return n%10 * (int)Math.pow(10, digits - 1) + (helper(n/10, digits - 1));
    }
}
