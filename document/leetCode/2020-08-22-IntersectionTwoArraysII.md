# LeetCode: Intersection of Two Arrays II

> http://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/#.X0CISB-__X0.sinaweibo

## 我的解决方案：

```java
class Solution {
    /**
     * 思路： 
     *   1. 依次从数组1中取一个元素，遍历数组2，找到和其相同元素的角标；
     *   2. 将该元素放到临时数组中，并把有效位加1；
     *   3. 将该元素放置换到数组2的开始位置，并将遍历的开始位置加1；
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length];
        int rightIndex = 0;
        int seconeLoopIndex = 0;
        for(int i=0;i<nums1.length;i++){
            for(int j=seconeLoopIndex;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    temp[rightIndex++] = nums2[j];
                    exchange(nums2, j, seconeLoopIndex++);
                    break;
                }
            }
        }
        if(rightIndex==0) return new int[0];
        int[] result = new int[rightIndex];
        for(int i=0;i<rightIndex;i++){
            result[i] = temp[i];
        }
        return result;
    }
    
    private void exchange(int[] nums, int i, int j){
        int tempV = nums[i];
        nums[i] = nums[j];
        nums[j] = tempV;
    }
}
```


