package enumExample;

public class Main {
    enum Weeks {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;


        Weeks(){
            System.out.println("constructor called for" + this);
        }

    public static void main(String[] args) {
        Weeks week;
        week = Weeks.Monday;

        for (Weeks day: Weeks.values()
             ) {
            System.out.println(day);
        }

        System.out.println( Weeks.valueOf("Monday"));

        }

    }
}
