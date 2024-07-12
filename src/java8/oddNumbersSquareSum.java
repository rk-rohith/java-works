package java8;

import java.util.Arrays;

public class oddNumbersSquareSum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = Arrays.stream(numbers).filter(x -> x % 2 != 0).map(sqr -> sqr * sqr).sum();
        System.out.println(sum);
    }
}
