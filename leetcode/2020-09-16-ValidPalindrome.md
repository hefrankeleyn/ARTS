# LeetCode: Valid Palindrome

> https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/

## 我的解决方案

```java
class Solution {
    /**
     * 思路： 
     *   1.将字符串换成小写；
     *   2.从前面取一个字母或数字，从后面取一个字母或数字；
     *   3.对比前后两个值是否相同，如果不相同返回false；
     *   4. 重复2 和 3 步；
     */
    public boolean isPalindrome(String s) {
        char[] sc = s.toLowerCase().toCharArray();
        int i=0,j=sc.length-1;
        while(i<j){
            while(i<j && !isValueRange(sc[i])) i++;
            while(i<j && !isValueRange(sc[j])) j--;
            if(i<j && sc[i]!=sc[j]) {
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    
    private boolean isValueRange(char c){
        if((c>='a' && c<='z') || (c>='0' && c<='9')){
            return true;
        }
        return false;
    }
}
```


