package java8;

import java.util.Arrays;

public class MinMaxNumbers {
    public static void main(String[] args) {
        System.out.println("Maximum number: " + Arrays.asList(5, 20, 12, 45, 6, 88, 60, 1, 30)
                .stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt());

        System.out.println("Minimum number: " + Arrays.asList(5, 20, 12, 45, 6, 88, 60, 1, 30)
                .stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt());
    }
}
