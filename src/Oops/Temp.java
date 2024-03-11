package Oops;

public class Temp {

  static class Test {
      static String name;
       public Test(String name){
           this.name = name;
       }

   }
    public static void main(String[] args){
       Test obj = new Test("darsna");
        Test obj2 = new Test("kiran");
        System.out.println(obj.name);
        System.out.println(obj2.name);

    }

    void greetings(){
        System.out.print("hello........");
    }


}
