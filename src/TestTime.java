public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        System.out.println("t1 Initial time: " + t1);
        System.out.println("Next second: " + t1.nextSecond());

        System.out.println();

        System.out.println("t2 Initial time: " + t2);
        System.out.println("Previous second: " + t2.previousSecond());

        System.out.println();

        System.out.println(t1);
        System.out.println(t2);
    }
}
