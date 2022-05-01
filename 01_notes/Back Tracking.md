# Back Tracking
其实回溯算法其实就是我们常说的 DFS 算法，本质上就是一种暴力穷举算法。
**解决一个回溯问题，实际上就是一个决策树的遍历过程。**


站在回溯树的一个节点上，你只需要思考3个问题
1. 路径：也就是已经做出的选择
2. 选择列表：也就是你当前可以做的选择
3. 结束条件：也就是到达决策树底层，无法再做选择的条件

```
result = []
def backtrack(路径, 选择列表):
    if 满足结束条件：
        result.add(路径)
        return
        
    for 选择 in 选择列表：
        做选择
        backtrack(路径，选择列表)
        撤销选择
```
