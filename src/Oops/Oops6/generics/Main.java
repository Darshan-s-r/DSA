package Oops.Oops6.generics;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Studen std = new Studen(44, 769.88f);
        Studen std2 = new Studen(32, 87);
        Studen std3 = (Studen) std.clone();

        System.out.println(std3.rollNo);

        Studen[] list = {std, std2};
        Arrays.sort(list);

//        if(std.compareTo(std2) > 0){
//            System.out.println(std.rollNo + " is bigger");
//        }else System.out.println(std2.rollNo + "is bigger");
    }
}


