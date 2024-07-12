package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeRemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 46, 12, 14);
        List<Integer> arr2 = Arrays.asList(2, 40, 3, 5, 17, 14);

        System.out.println("Merged sorted arrays without duplicates: " + Stream.concat(arr1.stream(), arr2.stream())
                .sorted()
                .distinct()
                .collect(Collectors.toList()));
    }
}
