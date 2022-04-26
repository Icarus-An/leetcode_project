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

/*
    1. Intialize a min map
    2. For each element x in the array
        a. Offer to heap if heap size < k or x >= top of heap 
        b. Adjust heap size if necessary
    3. Return the top of heap

    It's an online algorithm since each time the top of heap is the kth largest element,
    and it's sclable if the input is a stream.
*/


// @lc code=end
