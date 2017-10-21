package module_5;

public class GCExample_1 {
    public static class Tank {
        private int volume = 0;

        protected void fill() {
            volume = 20;
        }

        protected void empty() {
            volume = 0;
        }

        public boolean isEmpty() {
            return volume == 0;
        }
    }

    private Tank tank1 = new Tank();

    //Вызывается только при работе GC, перед удалением объекта
    //Использовать finalize как деструктор не безопасно, так как в GC может не быть необходимости
    public void finalize() {
        System.out.println("Finalize...");
        if (!tank1.isEmpty()) {
            System.out.println("Empty the tank...");
            tank1.empty();
        } else {
            System.out.println("The tank is empty");
        }
    }

    public void printSomething() {
        System.out.println("Something:)");
    }

    public static void main(String[] args) {
        GCExample_1 gcExample_1 = new GCExample_1();
        //Заполнение емкости
        gcExample_1.tank1.fill();
        //удаление ссылки на созданный объект
        gcExample_1 = null;
        //вызов GC
        System.gc();
    }
}
