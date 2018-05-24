package others.multithreading;

public class TwoThreads extends Thread{

    String msg = "default";

    public TwoThreads(String s) {
        msg = s;
    }

    public void run() {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        new TwoThreads("String1jhjhjgjg").run();
        new TwoThreads("String2hjjhj").run();
    }
}
