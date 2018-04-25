package others.streams;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Exercise3 {
    public static void main(String[] args) {
        DoubleStream iterate = DoubleStream.iterate(1, i -> i + 1);
        OptionalDouble average = iterate.average(); //среднее значение
    }

}
