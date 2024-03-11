package Temp;

public class OccurenceOfDigits {
    public static void main(String[] args) {
        System.out.println(occurence(12, 21, 1));
    }

    static int occurence(int from, int to, int digit){
        int count = 0;
        for(int i= from;i<=to;i++){
            int n= i;
            while(n>0){
                if(n%10 == digit){
                    count++;
                }
                n = n/10;
            }
        }
        return count;
    }

}
