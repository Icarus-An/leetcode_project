package binary_search;

/*
 * @lc app=leetcode id=378 lang=java
 *
 * [378] Kth Smallest Element in a Sorted Matrix
 */

// @lc code=start

// Binary Search plus Two Pointers
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int l = matrix[0][0];
        int r = matrix[matrix.length - 1][matrix.length - 1];

        while (l < r) {
            int mid = l + (r - l) / 2;
            int total = 0;
            // calculate the elements before the mid value
            int i = 0, j = 0;
            
            if (total >= k) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
// @lc code=end
