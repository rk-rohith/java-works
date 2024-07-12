package java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinList {
    public static void main(String[] args) {
        System.out.println("List with prefix and suffix: " + Arrays.asList("apple", "banana", "cherry", "date")
                .stream()
                .collect(Collectors.joining(",", "[", "]")));
    }
}
