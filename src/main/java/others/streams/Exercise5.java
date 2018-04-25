package others.streams;

import java.util.stream.IntStream;

public class Exercise5 {
    public static void main(String[] args) {
        IntStream empty = IntStream.empty();
        System.out.println(empty.average().getAsDouble());//exception value is not present
    }
}
