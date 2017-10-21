package module_2;

public class AutopackExample {
    public static void main(String[] args) {
        char c = 'c';
        Character character = 'h';

        c = character;
        character = c;

        System.out.println(character);
        System.out.println(c);
    }
}
