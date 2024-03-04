# LeetCode: Longest Common Prefix

> https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/

## 我的解决方案

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        char[] firstA = strs[0].toCharArray();
        if(firstA.length==0) return "";
        int[] commonA = new int[firstA.length];
        int maxIndex = 0;
        boolean conFlag = true;
        while(maxIndex<commonA.length && conFlag){
            commonA[maxIndex] ++;
            for(int i=1;i<strs.length;i++){
                if(strs[i].length()-1<maxIndex || strs[i].charAt(maxIndex)!=firstA[maxIndex]){
                    conFlag = false;
                    break;
                }else{
                    commonA[maxIndex]++;
                }
            }
            if(commonA[maxIndex]==strs.length){
                maxIndex++;
            }
        }
        if(maxIndex>=firstA.length || commonA[maxIndex]!=strs.length){
            maxIndex--;
        }
        if(maxIndex<0){
            return "";
        }else{
            char[] resCA = new char[maxIndex+1];
            for(int i=0;i<=maxIndex;i++){
                resCA[i] = firstA[i];
            }
            return new String(resCA);
        }
    }
}
```


