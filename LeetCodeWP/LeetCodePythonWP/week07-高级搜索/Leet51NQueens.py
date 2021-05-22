class Solution:
    def solveNQueens(self, n: int):
        def solve(cols, pies, nas):
            l = len(cols)
            if l>=n:
                result.append(cols)
                return
            for col in range(n):
                if not col in cols and not (l+col) in pies and not (l-col) in nas:
                    solve(cols+[col], pies+[l+col], nas+[l-col])
        result = []
        solve([], [], [])
        return [["."*i+"Q"+"."*(n-1-i) for i in a] for a in result]