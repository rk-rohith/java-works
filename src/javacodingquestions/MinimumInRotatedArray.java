package javacodingquestions;

public class MinimumInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int min = findMin(nums);
        System.out.println("Minimum element: " + min);
    }

    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1; // Minimum element is in the right half
            } else {
                right = mid; // Minimum element is in the left half or mid itself
            }
        }

        return nums[left]; // Minimum element found
    }
}
