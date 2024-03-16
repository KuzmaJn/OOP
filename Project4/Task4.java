import java.util.*;

public class Task4 {
    public static void change(int [] array) {
        if(array.length >= 2) {
            array[1] = 42;
        }
    }

    public static void change(String s) {
        s = "hello";
    }

    public static void main(String[] args) {
        String s = "jello";
        change(s);
        System.out.println(s);

        int[] array = {0,1,2,3};
        change(array);
        System.out.println(Arrays.toString(array));

        ColorPicker.main(args);
        BinaryTree.main(args);
    }
}