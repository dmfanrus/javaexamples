package others.streams;

import java.util.stream.LongStream;

public class Exercise29 {
    public static void main(String[] args) {
        LongStream stream = LongStream.of(9);
        stream.mapToInt(p-> (int) p)
                .forEach(System.out::println);
    }
}
