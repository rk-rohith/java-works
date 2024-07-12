package java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println("Reverse string: " + Arrays.stream("hello".split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" ")));
    }
}
