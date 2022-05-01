import java.util.HashMap;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> temp = new HashMap<>();
        int result = 0, start = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (temp.containsKey(ch)) {
                start = Math.max(temp.get(ch) + 1, start);
            }
            result = Math.max(result, end - start + 1);
            temp.put(ch,end);
        }
        return result;
    }
}
// @lc code=end
