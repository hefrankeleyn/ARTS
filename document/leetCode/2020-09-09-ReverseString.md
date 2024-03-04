# leetcode: Reverse String

> https://leetcode.com/submissions/detail/393301789/?from=/explore/interview/card/top-interview-questions-easy/127/strings/879/

## 我的解决方案

```java
class Solution {
    public void reverseString(char[] s) {
        if(s==null || s.length<=1) return;
        for(int i=0,j=s.length-1;i<j;i++,j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
```

