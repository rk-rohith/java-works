package java8;

import java.util.Arrays;

public class MultiplesOf5 {
    public static void main(String[] args) {
        System.out.println("Multiples of 5: " + Arrays.asList(5, 20, 12, 45, 6, 88, 60, 1, 30)
                .stream()
                .filter(x -> x % 5 == 0)
                .toList());
    }
}
