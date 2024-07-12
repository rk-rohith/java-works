package java8;

import java.util.Arrays;

public class StringsStartingNumber {
    public static void main(String[] args) {
        System.out.println("Strings starting with a number: " + Arrays.asList("123abc", "abc123", "1abc", "abc", "2abc")
                .stream()
                .filter(x -> Character.isDigit(x.charAt(0)))
                .toList());
    }
}
