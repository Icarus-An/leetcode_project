# Dynamic Programming

通过分解问题计算出答案

- The general form of the DP problem is to find the maximum value 

- The core of solving DP problem is exhausitive method

- 首先，动态规划的穷举有点特别，因为这类问题存在「重叠子问题」，如果暴力穷举的话效率会极其低下，所以需要「备忘录」或者「DP table」来优化穷举过程，避免不必要的计算。

- 而且，动态规划问题一定会具备「最优子结构」，才能通过子问题的最值得到原问题的最值。要符合「最优子结构」，子问题间必须互相独立。

- 如何列出正确的「状态转移方程」
  1. 确定 base case
  2. 确定 状态，也就是员问题和子问题中会变化的量
  3. 确定 选择，也就是导致 状态 缠上变化的行为
  4. 明确 dp 函数/数组的定义

- 递归：由顶向下再返回 递推：由底向上
