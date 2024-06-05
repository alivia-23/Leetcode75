package TwoPointer;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int low = 0;
         int high = 0;
         while (low < nums.length) {
             if (nums[low] != 0) {
                 nums[high] = nums[low];
                 high++;
             }
             low++;
         }
         while (high < nums.length) {
             nums[high] = 0;
             high++;
         }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
