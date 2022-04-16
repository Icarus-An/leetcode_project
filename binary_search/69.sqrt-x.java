package binary_search;

/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if (x == 1 || x == 0)
            return x;
        // initialize the result
        int left = 0, right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // determine
            if (x / mid < mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left - 1;
    }
}
// @lc code=end
