/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start

class Solution {
    public int maxArea(int[] height) {
        // initialize the pointers
        int i = 0, j = height.length - 1, result = 0;

        while (i < j) {
            result = Math.max(Math.min(height[i], height[j]) * (j - i), result);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
// @lc code=end
