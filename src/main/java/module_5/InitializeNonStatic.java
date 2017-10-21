package module_5;

public class InitializeNonStatic {
    String s;
    {
        s = "Init in {}";
        System.out.println(s);
    }
    InitializeNonStatic(){
        System.out.println("InitializeNonStatic()");
    }

    public static void main(String[] args) {
        System.out.println("Start main()");
        new InitializeNonStatic();
    }
}
