package numberSystem;

public class NoOfSetBit {
    public static void main(String[] args) {
        int num = 9 ;
        int count = 0;
        while(num > 0){
            if((num & 1)==1){
                count ++;
            }
            num = num >>1;
        }
        System.out.println(count);
    }
}
