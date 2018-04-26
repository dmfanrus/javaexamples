package others.streams;

import java.util.Optional;

public class Exercise39 {

    public static void main(String[] args) {
        Optional opt = Optional.empty();
        try {
            apply(opt);
        } catch (IllegalArgumentException e){
            System.out.println("Caught it");
        }
    }

    private static void apply(Optional<Exception> opt) {
        opt.orElseThrow(IllegalArgumentException::new);
    }
}
