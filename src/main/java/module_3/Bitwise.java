package module_3;

public class Bitwise {
    public static void printOneHexToBinary(int i) {
        System.out.println("Binary: Hex = " + Integer.toBinaryString(i) + " ;");
    }

    public static void printTwoHexToBinary(int i1, int i2) {
        System.out.println("Binary: Hex 1 = " + Integer.toBinaryString(i1) + " Hex 2 = " + Integer.toBinaryString(i2) + " ;");
    }

    public static void main(String[] args) {
        final int i1 = 0xAAAA;
        final int i2 = 0x5555;

        printTwoHexToBinary(i1,i2); // Hex 1 = 1010101010101010 Hex 2 = 101010101010101 ;
        printOneHexToBinary(i1 & i2); // Hex = 0 ;
        printOneHexToBinary((i1 | i2)); // Hex = 1111111111111111 ;
        printOneHexToBinary(i1 ^ i2); // Hex = 1111111111111111 ;
        printOneHexToBinary(~i1); // Hex = 11111111111111110101010101010101 ;
        printOneHexToBinary(~i2); // Hex = 11111111111111111010101010101010 ;


    }
}
