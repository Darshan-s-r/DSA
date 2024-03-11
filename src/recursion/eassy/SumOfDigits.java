package recursion.eassy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(505));
        System.out.println(sum2(505));
    }
    static int sum(int n) {
        int sum = 0;
        int rem=0;
        while(n > 0){
            rem = n % 10;
            sum += rem;
            n = n/10;
        }
return sum;
    }

    static int sum2(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }


}
