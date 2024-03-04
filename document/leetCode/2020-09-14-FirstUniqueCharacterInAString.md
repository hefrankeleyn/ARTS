# LeetCode: First Unique Character in a String

> https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/

## 我的解题方案

```java
class Solution {
    
    /**
     * 思路： 借鉴图搜索
     * 进行查询
     */
    public int firstUniqChar(String s) {
        char[] sArray = s.toCharArray();
        int len = 'z'-'a'+1;
        int[] n = new int[len];
        for(char c:sArray){
            int i = c-'a';
            n[i]++;
        }
        for(int i=0;i<sArray.length;i++){
            int ci = sArray[i]-'a';
            if(n[ci]==1){
                return i;
            }
        }
        return -1;
    }
}
```

