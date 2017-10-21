package module_3;

import java.util.Random;

public class CoinToss {
    private static final Random rand = new Random();
    private final int value;

    public CoinToss(int value) {
        if (value > 0) {
            this.value = value;
        } else {
            this.value = 1;
        }
    }

    public boolean throwCoin() {
        return rand.nextBoolean();
    }

    public static void main(String[] args) {
        CoinToss coin1 = new CoinToss(5);
        CoinToss coin2 = new CoinToss(10);
        System.out.println(coin1.throwCoin());
        System.out.println(coin1.throwCoin());
        System.out.println(coin2.throwCoin());
        System.out.println(coin2.throwCoin());
    }
}
