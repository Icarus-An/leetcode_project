package binary_search;

/*
 * @lc app=leetcode id=378 lang=java
 *
 * [378] Kth Smallest Element in a Sorted Matrix
 */

// @lc code=start

// Binary Search plus Two Pointers
class Solution {

    public int myCount(int[][] matrix, int param) {
        int len = matrix.length, count = 0, row = 0, col = len - 1;
        while (row < len && col >= 0) {
            if (matrix[row][col] <= param) {
                count += col + 1;
                row++;
            } else {
                col--;
            }
        }
        return count;
    }

    public int kthSmallest(int[][] matrix, int k) {
        int l = matrix[0][0];
        int r = matrix[matrix.length - 1][matrix.length - 1];

        while (l < r) {
            int mid = l + (r - l) / 2;
            // calculate the elements before the mid value
            int total = myCount(matrix, mid);
            if (total >= k) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    // Time complex: O(nlog(r-l))
}
// @lc code=end
