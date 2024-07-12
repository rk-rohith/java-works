package java8;

import java.util.stream.IntStream;

public class SumFirst10Natural {
    public static void main(String[] args) {
        System.out.println("Sum of first 10 natural numbers: " + IntStream.rangeClosed(1, 10)
                .sum());
    }
}
