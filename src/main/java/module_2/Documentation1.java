package module_2;


/**
 * <em>
 * Комментарий к классу
 * </em><br>
 * <ol>
 *  <li> Relative path - {@docRoot}
 *  <li> Link on other class.variable - {@link StaticTest#i}
 * </ol>
 *
 * @author Gurko Mihail
 * @version 1.0.0 beta
 * @see StaticTest
 * @see StaticTest#getI()
 * @see #getItem(int)
 * */
public class Documentation1 {

    /**
     *  Int unless value
     * */
    public int i;

    private int[] array = {1, 2, 3};
    /**
     * Get item from array
     * @param index index of array
     * @return Return int value
     * */
    public int getItem(int index){
        return array[index];
    }

    /**
     * Get array
     * @return Return int array
     * */
    @Deprecated
    public int[] getArray(){
        return array;
    }

    public static void main(String[] args) {
        Documentation1 doc1 = new Documentation1();
        System.out.println(doc1.getItem(1));
    }
}
