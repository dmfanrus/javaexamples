package others.streams;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Exercise30 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        Stream<List<String>> list1 = Stream.of(list);
        list1.filter(list2->!list2.isEmpty()).forEach(System.out::println);

        list1 = Stream.of(list);
        list1.flatMap(List::stream).forEach(System.out::println);

        list1 = Stream.of(list);
        list1.map(List::size).forEach(System.out::println);
    }
}
