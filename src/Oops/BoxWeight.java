package Oops;

public class BoxWeight extends Box {
    int w;

    BoxWeight(int l, int b, int h, int w){
        super(l, b, h);
        this.w = w;
    }

    void print1(){
        System.out.println("weight = " + w);
        System.out.println("length  = " + l + "breath = " + b + "height = " + h);
    }

    @Override
   public String toString(){
        return "darshan's object";
    }



    static void greetings(){
        System.out.println("well come .......");
    }
    public static void main(String[] args) {
        Box b = new Box(3, 6, 7);
        Box b1 = new Box(b);

        System.out.println(b.h);

        BoxWeight.print();



//        b.print();
//        b1.print();

        //////////////////////////////////
//        Box b2 = new BoxWeight(5, 6, 2, 8);
//        b2.print1();
//        System.out.println(b2);

        Box.greetings();
        BoxWeight.greetings();
    }
}
