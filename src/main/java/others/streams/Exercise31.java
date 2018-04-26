package others.streams;

import java.util.stream.Stream;

public class Exercise31 {

    public static void main(String[] args) {
        Stream<Character> stream = Stream.of('c', 'b', 'a');
        System.out.println(stream.sorted().findFirst());
    }
}
