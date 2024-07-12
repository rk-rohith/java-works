package java8;

import java.util.Arrays;

public class SeparateOddEven {
    public static void main(String[] args) {
        System.out.println("Odd numbers: " + Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6})
                .filter(x -> x % 2 != 0)
                .toList());

        System.out.println("Even numbers: " + Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6})
                .filter(x -> x % 2 == 0)
                .toList());
    }
}
