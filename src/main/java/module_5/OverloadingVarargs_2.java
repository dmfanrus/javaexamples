package module_5;

import java.util.Arrays;

public class OverloadingVarargs_2 {

    static void getStrings(String... args) {
        System.out.println(Arrays.toString(args));
    }

    public static void main(String[] args) {
        getStrings(new String[]{"First", "Second", "Third"});
        getStrings("first", "second", "third");



    }
}
