package com.hef.review.review06UF;

/**
 * @Date 2021/8/12
 * @Author lifei
 */
public class QuickFindUF implements UF{

    private int count;
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        count = N;
        for (int i=0; i<N; i++) {
            id[i] = i;
        }
    }

    @Override
    public int find(int p) {
        return id[p];
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

        for (int i=0; i<id.length; i++) {
            if (id[i]==pid) {
                id[i] = qid;
            }
        }
        count--;
    }
}
