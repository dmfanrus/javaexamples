package others.streams;

import java.util.*;
import java.util.stream.Stream;

public class Exercise40 {

    public static void withFlatMap(Collection<?> collection){
        Stream.of(collection)
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }

    private static void withoutFlatMap(Collection<?> collection){
        Stream.of(collection)
                .filter(x->!x.isEmpty())
                .map(x->x)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Deque<String> queue = new ArrayDeque<>();
        queue.push("all queued up");
        queue.push("last");
    }
}
