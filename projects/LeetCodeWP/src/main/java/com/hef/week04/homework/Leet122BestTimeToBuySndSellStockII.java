package com.hef.week04.homework;

/**
 * @Date 2021/4/24
 * @Author lifei
 */
public class Leet122BestTimeToBuySndSellStockII {

    public static void main(String[] args) {
        Leet122BestTimeToBuySndSellStockII bestTimeToBuySndSellStockII = new Leet122BestTimeToBuySndSellStockII();
        System.out.println(bestTimeToBuySndSellStockII.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public int maxProfit(int[] prices) {
        if (prices==null || prices.length==0) {
            return 0;
        }
        int sum = 0;
        for (int i=1; i<prices.length; i++) {
            if (prices[i]>prices[i-1]) {
                sum += prices[i]-prices[i-1];
            }
        }
        return sum;
    }
}
