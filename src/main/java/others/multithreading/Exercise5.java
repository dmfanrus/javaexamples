package others.multithreading;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class Exercise5 {
    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> copy1 = new CopyOnWriteArrayList<>(original);
        for (Integer integer : copy1) {
            copy1.remove(integer);
        }

        List<Integer> copy2 = Collections.synchronizedList(original);
        for (Integer integer : copy2) {
            copy2.remove(integer);
        }

        List<Integer> copy3 = new ArrayList<>(original);
        for (Integer integer : copy3) {
            copy3.remove(integer);
        }

        Queue<Integer> copy4 = new ConcurrentLinkedQueue<>(original);
        for (Integer integer : copy4) {
            copy4.remove(integer);
        }
    }
}
