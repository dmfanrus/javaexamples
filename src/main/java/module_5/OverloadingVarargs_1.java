package module_5;

public class OverloadingVarargs_1 {
    static void f(float i, Character... args){
        System.out.println("first");
    }

    static void f(char c, Character... args){
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1,'a');
        f('a','b');
    }
}
