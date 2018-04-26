package others.streams;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

public class Exercise22 {

    private static void spot(Optional<String> x){
        x.filter(y->!y.isEmpty())
                .map(y->8)
                .ifPresent(System.out::println);
    }
}
