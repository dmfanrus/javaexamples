package others.streams;

import java.util.stream.Stream;

public class Exercise2 {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, integer -> integer + 1);
        boolean b = stream.anyMatch(integer -> integer > 5);
        System.out.println(b);
    }
}
