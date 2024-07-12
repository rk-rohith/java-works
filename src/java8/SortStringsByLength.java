package java8;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLength {
    public static void main(String[] args) {
        System.out.println("Sorted strings by length: " + Arrays.asList("apple", "banana", "cherry", "date")
                .stream()
                .sorted(Comparator.comparing(String::length))
                .toList());
    }
}
