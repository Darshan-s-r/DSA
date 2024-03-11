package Oops;

public class Interface_main implements  Interface_music, Interface_engin {

    private Object price = 666666;

    @Override
    public void start(){
        System.out.println("car is started"+ Interface_engin.price);
    }

    public void stop(){
        System.out.println("car is stoped");
    }


//    public void start(){
//        System.out.println(Interface_music.name);
//    }

    public static void main(String[] args) {
        Interface_main im = new Interface_main();

        im.start();
        im.stop();
        System.out.println(im.price);
//        System.out.println(im.name);
    }


}
