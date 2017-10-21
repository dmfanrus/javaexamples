package module_3;

public class HexBinary {
    public static void printHexOct(long hex, long oct){
        System.out.println("Normal: Hex = " + hex + " Oct = " + oct + " ;");
    }

    public static void printHexOctToBinary(long hex, long oct){
        System.out.println("Binary: Hex = " + Long.toBinaryString(hex) + " Oct = " + Long.toBinaryString(oct) + " ;");
    }
    public static void main(String[] args) {
        long hex = 0xa;
        long oct = 077;
        printHexOct(hex,oct);
        printHexOctToBinary(hex,oct);




    }
}
