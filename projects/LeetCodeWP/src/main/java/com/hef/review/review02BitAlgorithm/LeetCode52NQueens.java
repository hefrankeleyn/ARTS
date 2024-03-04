package com.hef.review.review02BitAlgorithm;

/**
 * @Date 2021/7/13
 * @Author lifei
 */
public class LeetCode52NQueens {

    public static void main(String[] args) {
        LeetCode52NQueens nQueens = new LeetCode52NQueens();
        int res = nQueens.totalNQueens(4);
        System.out.println(res);
    }

    private int size;
    private int count;
    public int totalNQueens(int n) {
        if (n<1) return 0;
        size = (1<<n)-1;
        count = 0;
        searchNQueens(0, 0, 0);
        return count;
    }

    private void searchNQueens(int rows, int ld, int rd) {
        System.out.printf("%s, %s, %s\n", Integer.toBinaryString(rows),
                Integer.toBinaryString(ld),
                Integer.toBinaryString(rd));
        if (rows==size) {
            count++;
            return;
        }
        int pos = size & (~(rows|ld|rd));
        while(pos!=0) {
            int k = pos & (-pos);
            pos = pos & (pos-1);
            searchNQueens(rows|k, (ld|k)<<1, (rd|k)>>1);
        }
    }
}
