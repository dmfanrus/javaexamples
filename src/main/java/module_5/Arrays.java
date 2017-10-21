package module_5;

public class Arrays {

    Arrays(String s){
        System.out.println("Constructor - " + s);
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"1 string","2 string","3 string","4 string","5 string","6 string"};

        for(int i=0;i<strings.length;i++){
            System.out.println(strings[i]);
        }

        System.out.println("=================");

        Arrays[] arrays = new Arrays[]{new Arrays("1"),new Arrays("2"),new Arrays("3")};
    }
}
