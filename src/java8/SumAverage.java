package java8;

import java.util.Arrays;

public class SumAverage {
    public static void main(String[] args) {
        System.out.println("Sum of elements: " + Arrays.stream(new int[]{1, 2})
                .sum());

        System.out.println("Average of elements: " + Arrays.stream(new int[]{1, 2})
                .average()
                .getAsDouble());
    }
}
