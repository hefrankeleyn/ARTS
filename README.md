# 数据结构与算法

[toc]

## 一、数据结构

### 1.1 BST、AVL、Red-Black BST

- [BST 二分搜索树](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/review1/tree/BinarySearchTree.java)
- [AVL 平衡二分搜索树](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/review1/tree/AVLTree.java)
- [Red-Black BST 红黑二分搜索树](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/review1/tree/RedBlackBST.java)

### 1.2 Trie 字典树、LRU Cache、布隆过滤器

- [Trie 字典树](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-03-%E5%AD%97%E5%85%B8%E6%A0%91%E5%8F%8A%E7%BB%8F%E5%85%B8%E9%A2%98%E7%9B%AE.md)
- [LRU Cache](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/lur/LRUCache.java)
- [布隆过滤器](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03PyWP/BooleanFilter.py)

### 1.3 Union-find 并查集

- [Union-Find 并查集](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-04-UnionFind%E5%B9%B6%E6%9F%A5%E9%9B%86%E5%8F%8A%E7%9B%B8%E5%85%B3%E9%A2%98%E7%9B%AE.md)

### 1.4 数组 Array List、链表 LinkedList、跳表 SkipList

- 数组：随机查询的时间复杂度为O(1) ，插入、删除的时间复杂度为O(n)

- 链表：随机查询的时间复杂度为O(n)，插入、删除的时间复杂度为O(1)

#### 跳表 [Skip list](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/stack/SkipList.java)

> 跳表的实现，参考[跳表(skiplist)分析设计与实现(Java)](https://zhuanlan.zhihu.com/p/339750543)

- 跳表只能用于（链表里的）元素有序的情况。

- 跳表对标的是平衡树（AVL Tree）、二分查找，是一种插入、删除、搜索时间复杂度搜是O(logn)的数据结构。

跳表的使用案例：Redis、LevelDB



redis: 有序集合是如何存储的

```
1. 当有序集合中的节点数量小于128的时候，并且所有节点member的长度小于64 的时候使用ziplist；
2. 当有序集合不满足上面两个任意一个条件的时候，改为使用skiplist；
(ziplist 是一个字节数组)
```

redis 如何解决：数据量小的时候没有体现出跳表的优势（会出现多层级）：

```
1. 节点数量小于128 的时候使用ziplist；
2. redis 跳表 最大层级 32 （）
```

```
redis 的对象类型有哪些？底层的数据结构（有序集合 hash）；
字符串、整数、hash dict、压缩列表、set、跳表、字符串、list、消息队列
zset的底层使用什么数据结构实现的
```

redis为啥使用跳表，而不使用红黑树？

```
1. 红黑树实现复杂，跳表实现简单；
2. zrange(0, -1) 和红黑树一样， 但 zrange(10, 100) 红黑树很难做到；
```

- [双指针的算法题目](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-05-%E5%8F%8C%E6%8C%87%E9%92%88%E6%B3%95.md)

### 1.5 栈、队列、双端队列Deque、优先队列Priority Queue

[栈 Stack](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/stack/MyStack.java)： 先入后出；添加、删除皆为O(1)；

[队列 Queue](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/stack/MyQueue.java)：先入先出：添加、删除皆为O(1);

> 补充：java种 stack、queue、priority queue 的源码分析

[大顶堆 MinHeap](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/stack/MaxHeap.java)、[小顶堆](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/stack/MinHeap.java)、[堆排序](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/stack/HeapSort.java)

### 1.6 哈希表 HashMap、集合 Set

> 补充：HashMap的源码分析

- [HashMap相关题目](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-16-%E5%93%88%E5%B8%8Cmap%E7%9B%B8%E5%85%B3%E9%A2%98%E7%9B%AE.md)

### 1.7 树、二叉树

- 树的遍历

  前per-order、中in-order、后序post-order

- 二叉搜索树

- [树的遍历相关题目](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-17-%E6%A0%91%E7%9A%84%E9%81%8D%E5%8E%86.md)

### 1.8 堆 Heap

- 可以迅速找到一堆数中的最大值或者最小值的数据结构：[大顶堆（或大根堆）](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/heap/MaxHeap.java)、[小顶堆（或小根堆）](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/heap/MinHeap.java)
- 二叉堆是堆的一种实现方式：完全二叉树实现堆；
- [堆排序](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/heap/HeapSort.java)

### 1.9 图

- DFS、BFS：因为可能成环，所以一定要加visited
- 连通图的个数；
- 拓扑排序
- 最短路径
- 最小生成树



##  二、算法

### 2.1 [动态规划](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-09-14-%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92.md)

### 2.2 [双指针法](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-05-%E5%8F%8C%E6%8C%87%E9%92%88%E6%B3%95.md)

### 2.3 [HashMap相关题目](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-16-%E5%93%88%E5%B8%8Cmap%E7%9B%B8%E5%85%B3%E9%A2%98%E7%9B%AE.md)

### 2.4 用栈来解决：

- 最近相关性、洋葱一样的结构
- 经典题目：括号匹配、直方图

（遇到用队列来解决栈、或用栈来解决队列，一般的思路为使用两个栈或两个队列）

- [栈相关算法题目](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-16-%E6%A0%88%E7%9B%B8%E5%85%B3%E9%A2%98%E7%9B%AE.md)

### 2.5 用队列来解决

- [滑动窗口](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/heap/MaxSlidingWindow.java)

### 2.6 用堆来解决（PriorityQueue）

- 滑动窗口(使用堆，没有队列方便)

[堆相关题目](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-18-%E5%A0%86%E7%9B%B8%E5%85%B3%E9%A2%98%E7%9B%AE.md)

### 2.7 递归的算法题目

递归代码模版

- 递归终止条件；
- 处理当前层
- 下探到下一层
- 恢复状态

经典题目：

- [递归算法题目](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-18-%E9%80%92%E5%BD%92%E7%9B%B8%E5%85%B3%E9%A2%98%E7%9B%AE.md)

### 2.8 分治和回溯（递归的细分）

找重复性

- [分治和回溯的算法题目](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-23-%E5%88%86%E6%B2%BB%E5%92%8C%E5%9B%9E%E6%BA%AF%E7%9B%B8%E5%85%B3%E9%A2%98%E7%9B%AE.md)

### 2.9 BFS和DFS

#### 2.9.1 DFS 的代码模版

```python
visited = set()
def dfs(node):
  visited.add(node)
  # process current node here
  # ... ...
  for node in node.children():
      if not node in visited:
          dfs(node)
```

#### 2.9.2 BFS 的代码模版

使用队列（FIFO）

```python
def bfs(root):
   queue = []
   queue.append(root)
   while queue:
       node = queue.popleft()
       
       process(node)
       nodes = generate_retated_nodes(node)
       queue.push(nodes)
       
```

#### 2.9.3 BFS和DFS相关题目

- [BFS和DFS相关题目](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-23-BFS%E5%92%8CDFS%E7%9B%B8%E5%85%B3%E9%A2%98%E7%9B%AE.md)

### 2.10 贪心算法

- 贪心算法是一种在每一步选择中都采取在当前状态下最好或最优（即最有利的选择），从而希望导致结果是全局最好或最优的算法。

- 贪心算法与动态规划不同的地方在于它对每个子问题的解决方案都做出选择，不能回退。动态规划则可以保存之前的运算结果，并根据以前的结果对当前进行选择，有回退功能。

- 贪心：当下做局部最优判断；
- 回溯：能够回退
- 动态规划：最优判断+回退

- [贪心算法相关题目](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-24-%E8%B4%AA%E5%BF%83%E7%AE%97%E6%B3%95%E7%9B%B8%E5%85%B3%E9%A2%98%E7%9B%AE.md)

### 2.11 二分查找 和 [牛顿迭代法](https://www.beyond3d.com/content/articles/8/)

#### 二分查找的特性：

- 目标函数单调性（单调递增或递减）
- 存在上下界
- 能够进行索引访问

#### 代码模版

```python
left, right = 0, len(array)-1
while right>=left:
   mid = (left+right)/2;
   if (array[mid]==target):
      return mid
   elif array[mid]>target:
      right = mid-1;
   else:
      left = mid+1;
```

- [二分查找相关题目](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-24-%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE%E7%9B%B8%E5%85%B3%E9%A2%98%E7%9B%AE.md)

### 2.12 排序算法

- 选择排序：[选择排序O(n^2)](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/sort/MySelectSort.java)、[堆排序O(nlogn)](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/sort/MyHeapSort.java)
- 交换排序：[冒泡排序O(n^2)](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/sort/MyMaoPaoSort.java)、[快速排序O(nlogn)](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/sort/MyQuickSort.java) 、[三路快排O(nlogn)](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/sort/MyQuickSortOf3Way.java)
- 插入排序：[插入排序O(n^2)](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/sort/MyInsertSort.java)、[希尔排序(n^1.3)](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/sort/MyShellSort.java)
- 归并排序：[从上到下归并排序O(nlogn)](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/sort/MyUpDownMergeSort.java)、[从下到上归并O(nlogn)](https://github.com/hefrankeleyn/ARTS/blob/master/projects/pro03Algorithm/src/main/java/com/hef/sort/MyDownUpMergeSort.java)

### 2.13 位元算

- [位元算相关题目](https://github.com/hefrankeleyn/ARTS/blob/master/document/2021-10-31-%E4%BD%8D%E8%BF%90%E7%AE%97.md)

## 三、方法论

### 3.1 做题四步

- 确认题意（审题）；
- 思考所有可能的方案，并选择最佳方案；
- 编写代码；
- 测试；

### 3.2 最大的误区

题目只做一遍。

