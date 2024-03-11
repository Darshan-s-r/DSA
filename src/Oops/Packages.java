package Oops;
public class Packages {
    int num;



    Packages(int num){
        this.num = num;
    }

    public static void main(String[] args) {
        Packages p = new Packages(33);
        Packages p1 = p;
        Packages p2 = new Packages(33);

        System.out.println(p.getClass());
        System.out.println(p.getClass().getName());

//        if(p.num == p2.num){
//            System.out.println("1 ==");
//        }
//
//        if(p.equals(p1)){
//            System.out.println("object is eqals by .quals");
//        }
//        if(p == p2){
//            System.out.println("by ==");
//        }


    }
}
