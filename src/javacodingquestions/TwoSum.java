package javacodingquestions;

import java.util.*;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        // Map to store number and its index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate complement needed to reach target
            if (map.containsKey(complement)) {
                // Found the complement in map, return indices
                return new int[] { map.get(complement), i };
            }
            // Add current number to map with its index
            map.put(nums[i], i);
        }

        // No solution found
        throw new IllegalArgumentException("No two sum solution");
    }
}


