package module_5.static_examples;

public class ExplicitStatic {
    static String s2;
    static String s1  = "Init here";
    static {
        System.out.println(s1);
        s2 = "Init in static{}";
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
//        Cups.cup1.f(99);
        cups1.cup1.f(99);
    }
    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}
