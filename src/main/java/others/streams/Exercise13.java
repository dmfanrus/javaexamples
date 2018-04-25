package others.streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Exercise13 {
    public static void main(String[] args) {
        IntStream pages = IntStream.of(200);
        IntSummaryStatistics statistics = pages.summaryStatistics();
        long sum = statistics.getSum();
        System.out.println(statistics.getAverage());
    }
}
