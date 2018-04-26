package others.streams;

import java.util.stream.Stream;

public class Exercise23 {
    public static void main(String[] args) {
        Stream<Integer> iterate = Stream.iterate(1, i -> i);
        boolean b = iterate.anyMatch(i -> i > 5);
        System.out.println(b);
    }
}
