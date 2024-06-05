package SlidingWindow;

/**
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if
 * you can flip at most k 0's.
 *
 * Example 1:
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * Output: 6
 */
public class MaxConsecutiveOnes {
    public static int longestOnes(int[] nums, int k) {
        int start = 0;
        int countZero = 0;
        int maxOnes = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                countZero++;
            }
            while (countZero > k) {
                if (nums[start] == 0) {
                    countZero--;
                }
                start++;
            }
            maxOnes = Math.max(maxOnes, end - start + 1);
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int result = longestOnes(nums, k);
        System.out.println(result);
    }
}
