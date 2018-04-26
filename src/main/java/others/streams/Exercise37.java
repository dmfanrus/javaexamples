package others.streams;

import java.util.stream.Stream;

public class Exercise37 {
    private int numberMinutes;

    public Exercise37(int numberMinutes) {
        this.numberMinutes = numberMinutes;
    }

    public int getNumberMinutes() {
        return numberMinutes;
    }

    public boolean isFourMinuteMile(){
        return numberMinutes < 4*60;
    }
}

class Marathon{
    public static void main(String[] args) {
        Stream<Exercise37> runners = Stream.of(new Exercise37(250),
                new Exercise37(600),
                new Exercise37(201));
        long count = runners.filter(Exercise37::isFourMinuteMile)
                .count();
        System.out.println(count);

    }
}
