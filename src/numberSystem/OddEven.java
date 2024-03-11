package numberSystem;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(isOdd(42));
    }

    static boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
