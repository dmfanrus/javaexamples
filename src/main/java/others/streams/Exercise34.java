package others.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class Exercise34 {

    public static void main(String[] args) {
        Stream<Boolean> booleanStream = Stream.of(true, false, true);
        Optional<Boolean> first = booleanStream.filter(b -> b).findFirst();
        System.out.println(first);
    }
}
