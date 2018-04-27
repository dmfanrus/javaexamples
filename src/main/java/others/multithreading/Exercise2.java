package others.multithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Exercise2 {

    long tickersSold;

    final AtomicInteger ticketsTaken;

    public Exercise2() {
        tickersSold = 0;
        ticketsTaken = new AtomicInteger(0);
    }

    public void performJob(){
        IntStream.iterate(1, p->p+1)
                .parallel()
                .limit(10)
                .forEach(i -> ticketsTaken.getAndIncrement());
        IntStream.iterate(1, q->q+1)
                .limit(5)
                .parallel()
                .forEach(i -> ++tickersSold);
        System.out.println(ticketsTaken + " " + tickersSold);
    }

    public static void main(String[] args) {
        new Exercise2().performJob();
    }
}
