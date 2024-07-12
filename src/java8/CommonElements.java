package java8;

import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {4, 5, 6, 7, 8};

        System.out.println("Common elements between two arrays: " + Arrays.stream(array1)
                .filter(x -> Arrays.asList(array2).contains(x))
                .toList());
    }
}
