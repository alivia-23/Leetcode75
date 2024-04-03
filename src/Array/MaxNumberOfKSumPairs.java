package Array;

import java.util.Arrays;

/**
 * You are given an integer array nums and an integer k.
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 * Return the maximum number of operations you can perform on the array.
 * Example 1:
 * Input: nums = [1,2,3,4], k = 5
 * Output: 2
 * Example 2:
 * Input: nums = [3,1,3,4,3], k = 6
 * Output: 1
 */
public class MaxNumberOfKSumPairs {
    public int maxOperation(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        int numOperation = 0;
        Arrays.sort(nums);

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) { // happy case, i.e. yay! we found a match!
                numOperation++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return numOperation;
    }
}
