package java8;

import java.util.Arrays;

public class ReverseSortDecimals {
    public static void main(String[] args) {
        System.out.println("Reverse sorted decimals: " + Arrays.asList(3.14, 2.0, 1.618, 4.0, 2.718)
                .stream()
                .sorted((d1, d2) -> Double.compare(d2, d1))
                .toList());
    }
}
