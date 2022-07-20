# 代码模版

# 递归代码模版
def recursion(level, param1, param2, ...):
    if level> MAX_LEVEL:
        process_result
        return
    # process logic current level
    process(level, param1, param2,...)
    # drill down
    this.recursion(level+1, param1, param2,...)
    # reverse current level status if needed


# 分治代码模版
def divide_conquer(problem, param1, param2,...):
    # recursion terminator
    if problem is None:
        print_result
        return
    
    # prepare data
    data = prepare_data(problem)
    subproblems = split_problem(problem, data)

    subresult1 = this.divide_conquer(subproblems[0], p1,...)
    subresult2 = this.divide_conquer(subproblems[1], p1,...)
    subresult3 = this.divide_conquer(subproblems[2], p1,...)
    # ....
    
    # process and generate the final result
    result = process_result(subresult1, subresult2, subresult3,...)

     # reverse current level status if needed

# DFS, 递归的写法
def dfs(node, visited):
    if node in visited:
        # already visited
        return
    
    visited.add(node)
    # process current node here.
    # ...
    for next_node in node.chilren():
        if next_node not in visited:
            dfs(next_node, visited)


# DFS，非递归的写法
def dfs(self, tree):
    if tree.root is None:
        return []
    
    visited, stack = [], [tree.root]
    while stack:
        node = stack.pop()
        visited.add(node)

        process(node)
        nodes = generate_related_nodes(node)
        stack.push(nodes)
    # other processing work

# BFS， 代码模版
def bfs(self, start):
    visited = set()
    queue = []
    queue.append(start)
    while queue:
        node = queue.pop(start)
        visited.add(node)
        process(node)
        nodes = generate_related_nodes(node)
        queue.push(nodes)
    # other processing work

# Trie 树， 代码模版
class Trie(Object):
    def __init__(self):
        self.root = {}
        self.end_of_word = "#"
    def insert(self, word):
        node = self.root;
        for char in word:
            node = node.setdefault(char, {})
        node[self.end_of_word] = self.end_of_word
    
    def search(self, word):
        node = self.root
        for char in word:
            if char not in node:
                return False
            node = node[char]
        return self.end_of_word in node
    
    def startWith(self, word):
        node = self.root
        for char in word:
            if char not in node:
                return False
            node = node[char]
        return True


