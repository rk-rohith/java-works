package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> nestedNumbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        // Using flatMap to flatten nested lists into a single list
        List<Integer> flattenedNumbers = nestedNumbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened numbers: " + flattenedNumbers);
    }
}
