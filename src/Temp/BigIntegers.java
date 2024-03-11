package Temp;
import java.math.BigInteger;
import java.math.BigDecimal;
public class BigIntegers {

    public static void main(String[] args) {
//        int a= 30;
//        int b= 40;
//
//        BigInteger A = BigInteger.valueOf(234565432);
//        BigInteger B = BigInteger.valueOf(456789);
////        String converst s to integer
//        BigInteger C = new BigInteger("423456789123456556789");
//        System.out.println(C);
////        constants
//        BigInteger E = BigInteger.TEN;
//        System.out.println(E);
//
//        BigInteger s= A.divide(C);
//        System.out.println(s);
//
//        System.out.println("int value of" + B + " " +B.intValue());
        ///////////--------------==================---------------------

//        System.out.println(fact(632));
        DB();
    }
static BigInteger fact(int num){
        BigInteger ans = new BigInteger("1");

    for (int i = 2; i <= num; i++) {
        ans = ans.multiply(BigInteger.valueOf(num));
    }
    return ans;
}

static void DB(){
        double x= 0.03;
        double y = 0.04;
    System.out.println(x-y);

    BigDecimal a = new BigDecimal("3324657.86");
    BigDecimal b = new BigDecimal("35633053.04");

            //operation;
    System.out.println(a.add(b));
    System.out.println(a.subtract(b));
    System.out.println(a.pow(3));
    System.out.println(a.negate());
    System.out.println(BigDecimal.TWO);
}

}
