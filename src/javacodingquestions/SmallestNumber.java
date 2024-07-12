package javacodingquestions;

import java.util.*;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int result = smallestNumber1(nums);
        int result2 = smallestNumber2(nums);
        System.out.println(result);
        System.out.println(result2);
    }

    public static int smallestNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num); // Add positive numbers to set
            }
        }

        int smallest = 1;
        while (set.contains(smallest)) {
            smallest++; // Find the smallest positive number not in set
        }

        return smallest;
    }

    public static int smallestNumber2(int[] nums) {
        Arrays.sort(nums);  //Sort array to use greedy approach
        int smallest = 1;
        for (int num : nums) {
            if (num > smallest) {
                break; // If current number is greater than current smallest, return it
            }
            smallest += num; // Add current number to current smallest
        }
        return smallest;
    }
}
