# BFS Alogorithm

问题的本质就是让你在一幅「图」中找到从起点 start 到终点 target 的最近距离

- BFS 相对 DFS 的最主要的区别是：BFS 找到的路径一定是最短的，但代价就是空间复杂度可能比 DFS 大很多

框架如下：
```
// 计算从起点 start 到终点 target 的最近距离
int BFS(Node start, Node target) {
    Queue<Node> q; // 核心数据结构
    Set<Node> visited; // 避免走回头路
    
    q.offer(start); // 将起点加入队列
    visited.add(start);
    int step = 0; // 记录扩散的步数

    while (q not empty) {
        int sz = q.size();
        /* 将当前队列中的所有节点向四周扩散 */
        for (int i = 0; i < sz; i++) {
            Node cur = q.poll();
            /* 划重点：这里判断是否到达终点 */
            if (cur is target)
                return step;
            /* 将 cur 的相邻节点加入队列 */
            for (Node x : cur.adj()) {
                if (x not in visited) {
                    q.offer(x);
                    visited.add(x);
                }
            }
        }
        /* 划重点：更新步数在这里 */
        step++;
    }
}
```
cur.adj() 泛指 cur 相邻的节点，比如说二维数组中，cur 上下左右四面的位置就是相邻节点；visited 的主要作用是防止走回头路，大部分时候都是必须的，但是像一般的二叉树结构，没有子节点到父节点的指针，不会走回头路就不需要 visited。

---

用先进先出的队列存储要遍历的节点，就是BFS；用先进后出的栈来存储即将遍历的节点就是DFS；

BFS可以用集合，需要在遍历当前层级的节点时，把下层节点存储到临时集合变量中，保证先处理当前层节点，队列本身就能做到，所以不用临时变量。

回溯法是DFS，是因为它用函数递归的方法，相当于是用函数栈存储的节点信息，转换成迭代法就是自己用个栈结构存储节点就行了；

双向BFS不只要知道目标在哪里，是不是还必须有逆向路径，比如用链表实现二叉树，知道目标是那个节点，想知道从根到它的路径，如果是双向链表，就可以从目标往根找，否则只能从根往目标找。
