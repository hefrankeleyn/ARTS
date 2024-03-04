# LeetCode: Move Zeroes

https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/

##  我的方案

```java
class Solution {
    /**
     * 思路： 从后往前查，移动0到最后
     */
    public void moveZeroes(int[] nums) {
        if(nums==null || nums.length==0) return;
        int zoreNum = 0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==0){
                for(int j=nums.length-1-zoreNum; j>i;j--){
                    exchange(nums, i, j);
                }
                ++zoreNum;
            }
            
        }
    }
    
    private void exchange(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```

