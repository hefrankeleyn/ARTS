# LeetCode: Valid Anagram

> https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/

## 我第一次的解题方案（Time Limit Exceeded)

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        shellSortCharArray(sc);
        shellSortCharArray(tc);
        for(int i=0;i<sc.length;i++){
            if(sc[i]!=tc[i]){
                return false;
            }
        }
        return true;
    }
    
    private void shellSortCharArray(char[] c){
        for(int step=c.length/2;step>0;step/=2){
            for(int i=0;i+step<c.length;i++){
                for(int j=i;j>=0;j-=step){
                    if(c[j]>c[j+step]){
                        char t = c[j];
                        c[j] = c[j+step];
                        c[j+step] = t;
                    }
                }
            }
        }
    }
}
```

## 我的第二种方案： 在leetCode上能够提交成功

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int len = 'z'-'a'+1;
        int[] si = new int[len];
        int[] ti = new int[len];
        fillValue(si, s);
        fillValue(ti, t);
        for(int i=0;i<si.length;i++){
            if(si[i]!=ti[i]){
                return false;
            }
        }
        return true;
    }
    
    private void fillValue(int[] a, String s){
        char[] cs = s.toCharArray();
        for(int i=0;i<cs.length;i++){
            a[cs[i]-'a']++;
        }
    }
    
}
```
