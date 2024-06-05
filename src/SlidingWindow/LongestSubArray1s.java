package SlidingWindow;

/**
 * Given a binary array nums, you should delete one element from it.
 * Return the size of the longest non-empty subarray containing only 1's in the resulting array.
 * Return 0 if there is no such subarray.
 * Example 1:
 * Input: nums = [1,1,0,1]
 * Output: 3
 *
 * Example 2:
 * Input: nums = [0,1,1,1,0,1,1,0,1]
 * Output: 5
 * Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
 */
public class LongestSubArray1s {
    public static int longestSubArray(int[] nums) {
        int start = 0;
        int numZero = 0;
        int maxOnes = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] != 1) {
                numZero++;
            }
            while (numZero > 1) {
                if (nums[start] == 0) {
                    numZero--;
                }
                start++;
            }
            maxOnes = Math.max(maxOnes, end - start);
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        //int[] nums = {1,1,0,1};
        int[] nums = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubArray(nums));
    }
}
