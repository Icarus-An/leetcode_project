package binary_search;

/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

// @lc code=start
import java.util.Arrays;

class Solution {
    public int calcEatingHours(int[] piles, int speed) {
        int result = 0;
        for (int pile : piles) {
            result += (pile + speed - 1) / speed; // get the ceil result of division
        }
        return result;
    }

    public int minEatingSpeed(int[] piles, int h) {
        // select eating speed bananas/hour between 1 and max pile
        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (calcEatingHours(piles, mid) <= h) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
// @lc code=end
