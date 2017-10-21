package module_2;

public class StaticTest {
    static int i;

    static void increment() {
        i++;
    }

    public int getI() {
        return i;
    }

    public static void main(String[] args) {

        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        StaticTest.i++;

        System.out.println(st1.getI());
        System.out.println(st2.getI());

        StaticTest.increment();

        System.out.println(st1.getI());
        System.out.println(st2.getI());
    }
}




