# LeetCode : Single Number

> https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/#.XzqbFhw-tDs.sinaweibo

## 我的解决方案

```java
class Solution {
    public int singleNumber(int[] nums) {
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            boolean flag = true;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[i] = j;
                    flag = false;
                    break;
                }
            }
            if(flag){
                for(int t=0; t<i;t++){
                    if(nums[t] == i){
                        nums[i] = t;
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                return nums[i];
            }
        }
        return temp;
    }
}
```

