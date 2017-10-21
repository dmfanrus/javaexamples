package module_3;

public class Speed {

    public static double getSpeed(double distance, double time){
        return distance/time;
    }

    public static void printSpeed(double distance, double time){
        System.out.println("Dist = " + distance + " Time = " + time +  " Speed = " + distance/time + ';');
    }

    public static void main(String[] args) {
        printSpeed(60,20);
        printSpeed(60,40);
        printSpeed(60,80);
        printSpeed(60,100);
        printSpeed(5,10);
        printSpeed(5.2,10.2);
        printSpeed(3,9);
    }
}
