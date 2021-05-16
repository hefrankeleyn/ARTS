package com.hef.week06;

import java.util.*;

/**
 * @Date 2021/5/16
 * @Author lifei
 */
public class Leet322CoinChange {

    public static void main(String[] args) {
        Leet322CoinChange leet322CoinChange = new Leet322CoinChange();
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        int res = leet322CoinChange.coinChange(coins, amount);
        System.out.println(res);

    }

    public int coinChange(int[] coins, int amount) {
        if (coins==null || coins.length == 0 || amount<0) return -1;
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for (int i=1; i<=amount; i++) {
            for (int c : coins) {
                if (c<=i) {
                    dp[i] = Math.min(dp[i-c] + 1, dp[i]);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
