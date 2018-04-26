package others.streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Exercise38 {
    public static void main(String[] args) {
        IntSummaryStatistics intSummaryStatistics = IntStream.of(1, 2, 3, 44, 5).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getCount());//not getCountAsLong()
        System.out.println(intSummaryStatistics.toString());
    }
}
