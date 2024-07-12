package java8;

import java.util.Arrays;
import java.util.Comparator;

public class MaxMinTop3 {
    public static void main(String[] args) {
        System.out.println("Max 3 numbers: " + Arrays.asList(1, 10, 23, 12, 5, 2, 78, 11)
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList());

        System.out.println("Min 3 numbers: " + Arrays.asList(1, 10, 23, 12, 5, 2, 78, 11)
                .stream()
                .sorted()
                .limit(3)
                .toList());
    }
}
