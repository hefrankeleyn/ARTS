package com.hef.review.review06UF;

/**
 * @Date 2021/8/12
 * @Author lifei
 */
public class WeightQuickUnionUF implements UF{

    private int[] id;
    private int[] sz;
    private int count;

    public WeightQuickUnionUF(int N) {
        id = new int[N];
        count = N;
        sz = new int[N];
        for (int i=0; i<N; i++) {
            id[i] = i;
            sz[i] = 1;
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

        if (sz[pid]>sz[qid]) {
            id[pid] = qid;
            sz[qid] += sz[pid];
        }else {
            id[qid] = pid;
            sz[pid] += sz[qid];
        }
    }
}
