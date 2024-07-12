package javacodingquestions;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = majorityElement(nums);
        System.out.println(result);
    }

    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++; // Increment count if current number is the same as candidate
            } else {
                count--; // Decrement count if current number is different
                if (count == 0) {
                    candidate = nums[i]; // Update candidate if count drops to zero
                    count = 1;
                }
            }
        }

        return candidate; // Majority element found
    }
}
