package LeetCode;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("FXSHRXW"));
    }
    static public int titleToNumber(String columnTitle) {
        String str = columnTitle.toUpperCase();
        int columnNo = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int num = columnTitle.charAt(i) - 'A' + 1;
            columnNo = columnNo * 26 + num;
        }
        return columnNo;
    }
}
