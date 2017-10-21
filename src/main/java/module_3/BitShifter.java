package module_3;

public class BitShifter {

    public static void printOneHexToBinary(int i) {
        System.out.println("Binary: Hex = " + Integer.toBinaryString(i) + " ;");
    }

    public static int shiftRightSide(int i){
        printOneHexToBinary(i);
        while(i!=1){
            i >>= 1;
            printOneHexToBinary(i);
        }
        return i;
    }

    public static int shiftLeftSide(int i){
        printOneHexToBinary(i);
        while(i!=0x8000000){
            i <<= 1;
            printOneHexToBinary(i);
        }
        return i;
    }

    public static void main(String[] args) {
        int i1 = 0x8000000;
        int i2 = 0x1;

        shiftRightSide(i1);
        shiftLeftSide(i2);
    }
}
