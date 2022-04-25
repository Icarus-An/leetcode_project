package stack;
import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode id=735 lang=java
 *
 * [735] Asteroid Collision
 */

// @lc code=start
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int ast : asteroids) {
            if (ast > 0) {
                stack.push(ast);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -ast) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == -ast) {
                    stack.pop();
                }else if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(ast);
                }
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--)
            result[i] = stack.pop();

        return result;

    }
}
// @lc code=end
