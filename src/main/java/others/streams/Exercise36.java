package others.streams;

import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise36 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four");
        Map<Boolean, HashSet<String>> collect = stream.collect(Collectors
                .groupingBy(String::isEmpty, Collectors.toCollection(HashSet::new)));
    }
}
