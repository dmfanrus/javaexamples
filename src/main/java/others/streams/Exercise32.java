package others.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class Exercise32 {
    public static void main(String[] args) {
        Stream<Integer> is = Stream.of(8, 6, 9);
        Comparator<Integer> comparator = Comparator.comparingInt(a -> a);
        is.sorted(comparator).forEach(System.out::println);
    }
}
