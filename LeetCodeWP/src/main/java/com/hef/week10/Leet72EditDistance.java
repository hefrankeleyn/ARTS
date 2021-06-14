package com.hef.week10;

/**
 * @Date 2021/6/14
 * @Author lifei
 */
public class Leet72EditDistance {

    public static void main(String[] args) {
        Leet72EditDistance editDistance = new Leet72EditDistance();
        String word1 = "horse", word2 = "";
        int res = editDistance.minDistance(word1, word2);
        System.out.println(res);
    }

    public int minDistance(String word1, String word2) {
        int n1 = word1.length(), n2 = word2.length();
        int rowNum = n1 + 1, colNum = n2 + 1;
        int[][] dp = new int[rowNum][colNum];
        dp[0][0] = 0;
        for (int i=1; i<dp[0].length; i++) {
            dp[0][i] = i;
        }
        for (int j=1; j<dp.length; j++) {
            dp[j][0] = j;
        }
        for (int i=1;i<dp.length; i++) {
            for (int j=1;j<dp[i].length; j++) {
                if (i<=n1 && j<=n2 && word1.charAt(i-1)==word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j-1], dp[i][j-1]), dp[i-1][j]) + 1;
                }
            }
        }
        return dp[rowNum-1][colNum-1];
    }


}
