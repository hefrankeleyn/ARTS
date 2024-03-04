package com.hef.review.review06UF;

/**
 * @Date 2021/8/12
 * @Author lifei
 */
public class QuickUnionUF implements UF{

    private int[] id;
    private int count;

    public QuickUnionUF(int N) {
        id = new int[N];
        count = N;
        for (int i=0; i<N; i++) {
            id[i] = i;
        }
    }
    @Override
    public int find(int p) {
        while (p!=id[p]) p = id[p];
        return p;
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public void union(int p, int q) {
        int pid = find(p);
        int qid = find(q);

        if (pid==qid) return;

        id[pid] = qid;

        count--;
    }
}
