package heap;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (Integer num : nums) {
            if (minHeap.size() < k) {
                minHeap.add(num);
            } else if (minHeap.peek() < num) {
                minHeap.add(num);
            }
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
        return minHeap.peek();
    }
}
// @lc code=end
