package others.multithreading;

import java.util.concurrent.*;

public class Exercise7 {
    public long multTwice(int i){
        return i*2;
    }

    public void submitReports() throws ExecutionException, InterruptedException {
        ExecutorService s = Executors.newCachedThreadPool();
        Callable hello = () -> {
            System.out.println("Helloooooo");
            return 1;
        };
        Object o = s.submit(hello).get();
        s.shutdown();
        multTwice((Integer) o);
        System.out.println();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new Exercise7().submitReports();
    }
}
