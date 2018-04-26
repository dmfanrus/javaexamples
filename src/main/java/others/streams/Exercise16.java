package others.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class Exercise16 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four","five");
        stream.sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
    }
}
