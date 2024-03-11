package numberSystem;

public class PowerOfNo {  //finding 3^6;
    public static void main(String[] args) {
        int power = 6;
        int base = 1;
        int ans = 1;
        while(power > 0){

            if((power & 1) ==1){
                ans *= base;
            }
            base *= base;
            power = power >>1;
        }
        System.out.println(ans);
    }

}
