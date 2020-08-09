# LeetCode: Best Time to Buy and Sell Stock II
 
I have solved Best Time to Buy and Sell Stock II. Come and join the fun! http://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/#.Xy99LOQGzo0.sinaweibo

```java
class Solution {
    /**
     * 说明： 最初读这道题目的时候，基本没有思路，在讨论区看了其他人的解决方案之后，有了解题思路
     * 1. 将这些内容想像成波浪曲线；
     * 2、需要做的就是： 找到第一个低峰点，从低峰点往后找到第一个高峰点，两点的值做差，得到第一个profit01；
     * 3、沿着波浪线往后遍历，不断重复第二个步骤，直至结束；
     */
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        int maxProfit = 0, i=0;
        // 沿着波浪线往后遍历
        while(i<prices.length){
            // 查找第一个低峰点
            while(i<prices.length-1 && prices[i+1]<=prices[i]) i++;
            int minPrice = prices[i++];
            // 查找下一个高峰点，注： 下一个高峰点可能不存在
            while(i<prices.length-1 && prices[i+1]>=prices[i]) i++;
            maxProfit += i<prices.length?prices[i++]-minPrice:0;
        }
        return maxProfit;
    }
}
```
