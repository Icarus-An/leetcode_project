package stack;
import java.util.ArrayDeque;
import java.util.Deque;
/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Deque<Integer> stack = new ArrayDeque<>();
        int n = temperatures.length;
        int[] result = new int[n];
        for(int i = n-1; i>=0; i--){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }
        return result;
    }
}

/*
 * High level Idea:
 * 1. Initialize stack
 * 2. For each element arr[i] backwards
 * a. Pop until stack is empty or top of stack > arr[i]
 * 3. Calculate distance from arr[i] to top of stack
 * 4. Repeat
 */
// @lc code=end
