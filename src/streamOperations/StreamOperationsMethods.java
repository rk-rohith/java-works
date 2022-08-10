package streamOperations;

import java.util.Arrays;
import java.util.List;

public class StreamOperationsMethods {
    public static void main(String[] args) {

        //remove duplicate elements
        List<String> stringList = Arrays.asList("a", "b", "c", "d", "e", "f", "a", "b");
        stringList.stream().distinct().forEach(System.out::println);

        //find sum of square of odd numbers
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = Arrays.stream(numbers).filter(x -> x % 2 != 0).map(sqr -> sqr * sqr).sum();
        System.out.println(sum);
    }
}
