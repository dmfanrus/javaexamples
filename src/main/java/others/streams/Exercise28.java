package others.streams;

import java.util.stream.Stream;

public class Exercise28 {
    public static void main(String[] args) {
        Stream<Character> chars = Stream.generate(() -> 'a');
        chars.filter(c->c<'b')
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
