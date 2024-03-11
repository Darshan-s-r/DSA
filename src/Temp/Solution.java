package Temp;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 0;i<numRows;i++){
            List<Integer> Ilist = new ArrayList<>();
            for(int j=0; j<=i; j++){
               Ilist.add(binomial(i, j));
            }
            list.add(Ilist);
        }
        return list;
    }

    static int binomial(int n, int k){
        int numerator = factorial(n);
        int denominator = factorial(k) * factorial(n - k);

        if (denominator == 0) {
            return 0; // or handle it in a way that makes sense for your application
        }

        return numerator / denominator;
    }

    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    ///////////////using DYNAMIC PROGRAMING FOR binimial
    static public List<List<Integer>> generateDP(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 0;i<numRows;i++){
            List<Integer> Ilist = new ArrayList<>();
            for(int j=0; j<=i; j++){
                Ilist.add(binomialDP(i, j));
            }
            list.add(Ilist);
        }
        return list;
    }

    static int binomialDP(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        int[][] dp = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

        return dp[n][k];
    }

}