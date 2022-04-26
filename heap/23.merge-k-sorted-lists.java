package heap;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode list : lists) {
            if (list != null) {         // consider null input
                heap.offer(list);
            }
        }
        ListNode result = heap.peek();
        while (heap.size() > 0) {
            ListNode temp = heap.poll();
            if (temp.next != null) {
                heap.offer(temp.next);
                temp.next = heap.peek();
            }else{
                temp.next = heap.peek();
            }
        }
        return result;
    }
}

// Time complexity: O(nlogk), n = the total number of all nodes.
/*
 * 1. Initialize min heap with all List head references
 * 2. While heap is not empty
 * a. Poll out top of heap (smallest pointer)
 * b. Add it to result list
 * c. Add its next node if there exists
 * 
 * It's an online Algorithm since LinkedList can be considered as a data stream
 * (unknown length)
 */

// @lc code=end
