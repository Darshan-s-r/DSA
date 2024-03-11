package numberSystem;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(magicNumber(5));
    }
    static int magicNumber(int num){
        int ans = 0;
        int base = 5;
        while(num > 0){
            int last = num & 1;
            num = num >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }
}
