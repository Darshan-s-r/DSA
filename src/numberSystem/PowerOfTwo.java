package numberSystem;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(OptimalMethod(32));
        System.out.println(normalMethod(31));
    }

    static boolean OptimalMethod(int n){
        if(n==0){
            return false;
        }
        if((n & n-1) == 0){
            return true;
        }
        else return false;
    }
    static boolean normalMethod(int n){
        if(n==0){
            return false;
        }
        int count = 0;
        while(n > 0){
            int digit = n & 1;
            if(digit == 1){
                count++;
            }
            n = n >> 1;

        }
        if (count > 1){
            return false;
        }
        else return true;
    }

}
