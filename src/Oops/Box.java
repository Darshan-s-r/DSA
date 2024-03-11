package Oops;

public class Box {
     static int l;
  static public int b;
   protected static int h = 0;

    static int d = 92;


    Box(int l, int b, int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public Box(){
        super();
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    Box(Box obj){
        this.l = obj.l;
        this.b = obj.b;
        this.h = obj.h;
    }

   static  void print(){
         System.out.println("length  = " + l + "breath = " + b + "height = " + h);
     }

     static void greetings(){
         System.out.println("well come .......");
     }

}
