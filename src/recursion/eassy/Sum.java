package recursion.eassy;

public class Sum {
    public static void main(String[] args) {
        System.out.println( sum(100));
    }
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
}
