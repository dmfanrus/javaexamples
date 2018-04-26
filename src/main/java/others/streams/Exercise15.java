package others.streams;

import java.util.stream.Stream;

public class Exercise15 {

    public static void main(String[] args) {
        Stream<Character> stream = Stream.of('c', 'b','a');
        stream.sorted().findAny().ifPresent(System.out::println);
    }
}
