package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AmstrongNo {
    public static void main(String[] args) {
        System.out.println(isAmstrong(1634));  //27 + 343 + 1
        System.out.println(AmstrongNums(1, 1000));
    }
    static boolean isAmstrong(int num){
        if(sum(num) == num){
            return true;
        }
        else return false;
    }

    static int sum(int num){
        int ans = 0;
        int i = 0;
        int num2 = num;
        while(num2 > 0){
            num2 = num2/ 10;
            i++;
        }
        while(num > 0){
            int temp = num % 10;
            int temp2 = num % 10;
            for (int j = 1; j < i; j++) {
               temp = temp2 * temp;
            }
            ans = ans + temp ;
            num = num / 10;
        }
        return ans;
    }

    static ArrayList<Integer> AmstrongNums(int start, int end){
        ArrayList<Integer> list =  new ArrayList<Integer>();
        for (int i = start; i < end; i++) {
            if(isAmstrong(i)){
                list.add(i);
            }
        }
        return list;
    }
}
