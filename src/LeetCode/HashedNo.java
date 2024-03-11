package LeetCode;

public class HashedNo {

    public static void main(String[] args) {
        System.out.println(isHashedORnot(11));
    }

    static public boolean isHashedORnot(int num){
        if(num % sum(num) == 0){
            return true;
        }
        return false;
    }

    static int sum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num = num/10;
        }
        return sum;
    }
}
