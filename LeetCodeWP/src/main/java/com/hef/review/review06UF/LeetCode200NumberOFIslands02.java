package com.hef.review.review06UF;

/**
 * @Date 2021/8/15
 * @Author lifei
 */
public class LeetCode200NumberOFIslands02 {

    public static void main(String[] args) {
        LeetCode200NumberOFIslands02 numberOFIslands02 = new LeetCode200NumberOFIslands02();
//        char[][] grid = {
//                {'1','1','1','1','0'},
//                {'1','1','0','1','0'},
//                {'1','1','0','0','0'},
//                {'0','0','0','0','0'}
//        };
        char[][] grid = {
                {'1'},
                {'1'}
        };
        int res = numberOFIslands02.numIslands(grid);
        System.out.println(res);
    }

    public int numIslands(char[][] grid) {
        if (grid==null || grid.length==0) return 0;
        int[] dx = {0, 1};
        int[] dy = {1, 0};
        int n = grid.length;
        int m = grid[0].length;
        UF uf = new UF(n*m);
        int zeroNum = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j]=='1') {
                    for (int k=0; k<dx.length; k++) {
                        int x= i + dx[k], y = j+ dy[k];
                        if (x<0 || x>=n || y<0 || y>=m || grid[x][y]!='1') {
                            continue;
                        }
                        uf.union(i*m+j, x*m+y);
                    }
                }else {
                    zeroNum ++ ;
                }
            }
        }
        return uf.count() - zeroNum;
    }


    public static class UF {
        private int[] id;
        private int[] sz;
        private int count;

        public UF(int N) {
            id = new int[N];
            sz = new int[N];
            count  = N;
            for (int i=0; i<N; i++) {
                id[i] = i;
                sz[i] = 1;
            }
        }

        public int count() {
            return count;
        }

        public int find(int p) {
            while(p!=id[p]) p = id[p];
            return p;
        }

        public void union(int p, int q) {
            int pid = find(p);
            int qid = find(q);
            if (pid==qid) return;
            if (sz[pid]>sz[qid]) {
                id[pid] = id[qid];
                sz[qid] += sz[pid];
            }else {
                id[qid] = id[pid];
                sz[pid] += sz[qid];
            }
            count--;
        }
    }

}
