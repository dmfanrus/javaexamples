package others.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise18 {
    public static void main(String[] args) {
        Stream<Boolean> bools = Stream.iterate(true, b -> !b);
        Map<Boolean, List<Boolean>> map = bools.limit(1)
                .collect(Collectors.partitioningBy(b -> b));
        System.out.println(map);

    }
}
