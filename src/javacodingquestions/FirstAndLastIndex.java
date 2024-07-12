package javacodingquestions;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int[] result = searchRange(nums, target);
        System.out.println("First Index: " + result[0] + ", Last Index: " + result[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1, -1};

        // Search for the first occurrence (left boundary)
        result[0] = findFirstIndex(nums, target);

        // If target is not found, return {-1, -1}
        if (result[0] == -1) {
            return result;
        }

        // Search for the last occurrence (right boundary)
        result[1] = findLastIndex(nums, target);

        return result;
    }

    private static int findFirstIndex(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int firstIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                high = mid - 1; // Look in the left half
            } else {
                low = mid + 1;
            }

            if (nums[mid] == target) {
                firstIndex = mid; // Update firstIndex when target is found
            }
        }

        return firstIndex;
    }

    private static int findLastIndex(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int lastIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= target) {
                low = mid + 1; // Look in the right half
            } else {
                high = mid - 1;
            }

            if (nums[mid] == target) {
                lastIndex = mid; // Update lastIndex when target is found
            }
        }

        return lastIndex;
    }
}
