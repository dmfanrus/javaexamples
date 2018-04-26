package others.streams;

import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.LongStream;

public class Exercise26 {
    public static void main(String[] args) {
        LongStream longStream = LongStream.of(6, 10);
        LongSummaryStatistics stats = longStream.summaryStatistics();
        System.out.println(stats.getAverage());
    }
}
