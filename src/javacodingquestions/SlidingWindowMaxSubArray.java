package javacodingquestions;

public class SlidingWindowMaxSubArray {

    public int maxSumSubarray(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        // Calculate sum of first k elements
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        maxSum = currentSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        SlidingWindowMaxSubArray maxSumSubarray = new SlidingWindowMaxSubArray();
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int result = maxSumSubarray.maxSumSubarray(nums, k);
        System.out.println("Maximum sum of subarray of size " + k + ": " + result);
    }
}
