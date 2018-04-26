package others.streams;

import java.util.Optional;

public class Exercise17 {

    private static void longer(Optional<Boolean> opt){
        if(opt.isPresent()){
            System.out.println("run: " + opt.get());
        }
    }

    private static void shorter(Optional<Boolean> opt){
        opt.map(x->"run: "+x).ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        longer(Optional.ofNullable(true));
        shorter(Optional.empty());
    }
}
