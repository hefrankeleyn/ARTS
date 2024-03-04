# LeetCode:  Remove Duplicates from Sorted Array. 

Come and join the fun! http://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/#.Xy4YFKuC_qI.sinaweibo

```java
class Solution {
    /**
     * 思路： 通过不断的交换位置，将不重复的值按照顺序放到最前面。
     *  1. 设置三个角标： 
     *     baseIndex 代表按照顺序排列的不重复值的数组的最大角标，
     *     changeIndex 代表下一个更大值的角标，
     *     nextIndex 代表下一个更大值第一次出现的角标；
     *  2. 让 changeIndex 从 1开始，遍历数组，找到下一个和前面值都不相同角标；
     *  3. 找到之后下一个值之后，将这个值第一次出现位置 和 baseIndex的下一个角标位进行置换；
     *  4. 置换位置之后，将baseIndex 加 1， changeIndex 加 1；
     *  5. 一直循环，直到遍历完数组的所有元素。
     */
    public int removeDuplicates(int[] nums) {
        int baseIndex = 0, changeIndex=baseIndex+1, nextIndex=changeIndex;
        while(changeIndex<nums.length){
            nextIndex = changeIndex;
            if(nums[baseIndex]!=nums[nextIndex]){
                if(nextIndex!=baseIndex+1){
                    exchange(nums, changeIndex, baseIndex+1);
                }
                baseIndex++;
                changeIndex++;
                continue;
            }else{
                while(changeIndex<nums.length && nums[changeIndex]==nums[nextIndex]){
                    changeIndex++;
                }
            }
        }
        return baseIndex+1;
    }
    
    private void exchange(int[] nums, int i, int j){
        int temp = nums[i];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
```

## 下面是参考其他的解答方案：

```java
public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}
```
