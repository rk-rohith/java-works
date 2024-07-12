package java8;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("Distinct elements: " + Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 4, 2, 1})
                .distinct()
                .toList());
    }
}
