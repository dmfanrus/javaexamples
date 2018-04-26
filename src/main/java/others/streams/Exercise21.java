package others.streams;

import java.util.stream.Stream;

public class Exercise21 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.findFirst());//only findFirst()
    }
}
