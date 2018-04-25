package others.streams;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise6 {

    public static void main(String[] args) {
        Stream.of(1,2,3,4,5).findAny();
    }
}
