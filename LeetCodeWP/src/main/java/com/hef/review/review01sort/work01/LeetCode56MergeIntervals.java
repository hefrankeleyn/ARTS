package com.hef.review.review01sort.work01;

import java.util.*;

/**
 * @Date 2021/7/3
 * @Author lifei
 */
public class LeetCode56MergeIntervals {

    public static void main(String[] args) {
        LeetCode56MergeIntervals mergeIntervals = new LeetCode56MergeIntervals();
        int[][] intervals = {{1,3},{2,6},{8,10}, {15,18}};
        int[][] res = mergeIntervals.merge(intervals);
        for (int i=0; i<res.length; i++) {
            System.out.print(Arrays.toString(res[i])+",");
        }
        System.out.println();
    }

    public int[][] merge(int[][] intervals) {
        // 第一步；对区间进行排序
        List<QuJian> list = new ArrayList<>();
        for (int i=0; i<intervals.length; i++) {
            list.add(new QuJian(intervals[i][0], intervals[i][1]));
        }
        Collections.sort(list);
        List<QuJian> resList = new ArrayList<>();
        QuJian oneV = null;
        for (int i=0; i<list.size(); i++) {
            QuJian v = list.get(i);
            System.out.println(v);
            if (oneV==null) {
                oneV = new QuJian(v.value01, v.value02);
            }
            if (v.value01>=oneV.value01 && v.value01<=oneV.value02) {
                oneV.value02 = Math.max(v.value02, oneV.value02);
            }else {
                resList.add(new QuJian(oneV.value01, oneV.value02));
                oneV = new QuJian(v.value01, v.value02);
            }
            if (i==list.size()-1) {
                resList.add(new QuJian(oneV.value01, oneV.value02));
            }
        }
        int[][] res = new int[resList.size()][2];
        for (int i=0;i<resList.size(); i++) {
            res[i][0] = resList.get(i).value01;
            res[i][1] = resList.get(i).value02;
        }
        return res;
    }

    private static class QuJian implements Comparable<QuJian> {
        int value01;
        int value02;

        public QuJian(int value01, int value02) {
            this.value01 = value01;
            this.value02 = value02;
        }

        public int compareTo(QuJian other) {
            if (this.value01<other.value01) {
                return -1;
            }else if (this.value01>other.value01){
                return 1;
            }else if (this.value02<other.value02) {
                return -1;
            }else if (this.value02>other.value02){
                return 1;
            }
            return 0;
        }

    }
}
