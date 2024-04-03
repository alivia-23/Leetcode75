package Array;

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 *
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 *
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int first = 0;
        int last = height.length - 1;
        int maxArea = Integer.MIN_VALUE;

        while (first < last) {
            int width = last - first;
            maxArea = Math.max(maxArea, Math.min(height[first], height[last]) * width);
            if (height[first] <= height[last]) {
                first++;
            } else {
                last--;
            }
        }
        return maxArea;
    }
}
