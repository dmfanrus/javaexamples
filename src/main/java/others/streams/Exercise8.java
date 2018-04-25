package others.streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Exercise8 {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(6, 10);
        LongStream longs = stream.mapToLong(i -> i);
        System.out.println(longs.average().getAsDouble());
    }
}
