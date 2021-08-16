package com.hef.review.review06UF;

/**
 * @Date 2021/8/16
 * @Author lifei
 */
public class LeetCode130SurroundedRegions {

    public void solve(char[][] board) {
        if (board==null || board.length==0) return;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        char errorC = '@';
        // 第一行和最后一行
        for (int i=0; i<board[0].length; i++) {
            if (board[0][i]=='O') {
                dfs(board, 0, i, errorC, dx, dy);
            }
        }
        for (int i=0; i<board[0].length; i++) {
            if (board[board.length-1][i]=='O') {
                dfs(board, board.length-1, i, errorC, dx, dy);
            }
        }
        // 第一列和最后一列
        for (int i=0; i<board.length; i++) {
            if (board[i][0]=='O') {
                dfs(board, i, 0, errorC, dx, dy);
            }
        }
        for (int i=0; i<board.length; i++) {
            if (board[i][board[0].length-1]=='O') {
                dfs(board, i, board[0].length-1, errorC, dx, dy);
            }
        }
        // 纠正结果
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                if (board[i][j]=='X') continue;
                else if (board[i][j]=='O') board[i][j]='X';
                else board[i][j] = 'O';
            }
        }

    }

    private void dfs(char[][] board, int i, int j, char c, int[] dx, int[] dy) {
        if (board[i][j]!='O') return;
        board[i][j] = c;
        for (int k=0; k<dx.length; k++) {
            int x = i + dx[k], y = j + dy[k];
            if (x<0 || x>=board.length || y<0 || y>=board[0].length || board[x][y]!='O') {
                continue;
            }
            dfs(board, x, y, c, dx, dy);
        }
    }
}
