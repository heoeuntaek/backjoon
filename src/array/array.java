package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class array {
    public static void main(String[] args) {
        int[] array = new int[10];
        List<Long> list = Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L);
        System.out.println(list);
        System.out.println("list.get(0)"+list.get(0));

        for (int i = 1; i < array.length; i++) {
            array[i] = 1;
            System.out.println(array[i]);
        }
        String string = Arrays.toString(array);
        System.out.println(string);
    }

}