
class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        def solve(rows, pies, nas):
            l = len(rows)
            if l>=n:
                result.append(rows)
                return
            for row in range(n):
                if row not in rows and row+l not in pies and row-l not in nas:
                    solve(rows+[row], pies+[row+l], nas+[row-l])
        result=[]
        solve([],[],[])
        return [['.'*i+'Q'+'.'*(n-1-i) for i in a] for a in result]

