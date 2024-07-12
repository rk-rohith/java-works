package java8;

import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println("Frequency of each character: " + str.chars()
                .mapToObj(x -> (char)x)
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting())));
    }
}
