/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        // init variables
        int i = 1, result = 0;
        while (i < height.length - 1) {
            int j = 0, tempRight = 0, tempLeft = 0, temp = 0;
            while (j < i) {
                tempLeft = Math.max(height[j], tempLeft);
                j++;
            }
            j++;
            while (j <= height.length - 1) {
                tempRight = Math.max(height[j], tempRight);
                j++;
            }
            temp = Math.min(tempLeft, tempRight) - height[i];
            if (temp > 0) {
                result += temp;
            }
            i++;
        }
        return result;
    }
}
// @lc code=end
