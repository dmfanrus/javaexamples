package others.streams;

import java.util.stream.Stream;

public class Exercise4 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("base","ball");
        stringStream.map(s->s.length()).forEach(System.out::print);
        stringStream.mapToInt(s->s.length()).forEach(System.out::print);
    }
}
