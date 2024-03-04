# LeetCode: Rotate Array

http://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/#.XzVOLNmlMl4.sinaweibo

## 我的解决方案

```java
class Solution {
    /**
     *  思路： 将数组遍历 7次， 每次遍历 都将最后一个值放到最前面
     */
    public void rotate(int[] nums, int k) {
        for(int i=0;i<k;i++){
            for(int x=nums.length-1,y=x-1;y>=0;x--,y--){
                int temp = nums[x];
                nums[x] = nums[y];
                nums[y] = temp;
            }
        }
    }
}
```

## 对比其它的解决方案
```java
public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
}

public void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
```
