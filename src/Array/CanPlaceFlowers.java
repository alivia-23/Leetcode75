package Array;

/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
 * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 *
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 *
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 */
public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        int len = flowerbed.length;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean isLeftVacant = (i == 0) || (flowerbed[i - 1] == 0);
                boolean isRightVacant = (i == len - 1) || (flowerbed[i + 1] == 0);
                if (isLeftVacant && isRightVacant) {
                    flowerbed[i] = 1;
                    n--;
                    if (n == 0) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
//        int[] flowerbed = {1,0,0,0,1};
//        int n = 1;
//        int[] flowerbed = {1,0,0,0,1};
//        int n = 2;
//        int[] flowerbed = {1,0,1,0,1,0,1};
//        int n = 0;
        int[] flowerbed = {0,0,1,0,1};
        int n = 1;
        boolean result = canPlaceFlowers(flowerbed, n);
        System.out.println(result);
    }
}
