package others.streams;

import java.util.Optional;

public class Exercise11 {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        Optional<String> o = Optional.of(null);
        System.out.println(empty.isPresent() + " " + o.isPresent());
    }
}
