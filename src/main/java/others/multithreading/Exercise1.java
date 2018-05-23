package others.multithreading;

import java.util.concurrent.*;
import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Runnable runnable_first = () -> System.out.println("First runnable");
        Runnable runnable_second = () -> System.out.println("Second runnable");
        executorService.execute(runnable_first);

        Callable<String> callable = () -> "Some Strinhjgjgjgg";

        Future<String> submit_call = executorService.submit(callable);
        Future<String> submit_run = executorService.submit(runnable_second,"return");
        executorService.shutdown();
        System.out.println(submit_call.get(10,TimeUnit.SECONDS));
        System.out.println(submit_run.get(10,TimeUnit.SECONDS));
    }
}
