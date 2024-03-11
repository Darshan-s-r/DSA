package strings;

public class StringBuild {
    public static void main(String[] args) {
        StringBuffer builder = new StringBuffer();
        for (int i = 0;i< 26; i++){
            char ch = (char) ('a'+ i);
            builder.append(ch);
        }
        System.out.println(builder.reverse());
    }
}


