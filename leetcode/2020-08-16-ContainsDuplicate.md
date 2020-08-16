# leetCode: Contains Duplicate

## 我想到的方案：
这种方案存在问题——花费的时间比较长

```java
class Solution {
    /**
     * 思路： 从第一个元素开始遍历，查找后面元素和这个元素相同的元素
     */
    public boolean containsDuplicate(int[] nums) {
        if (nums==null || nums.length ==0) return false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
```

## 参考他人的解决方案：

class Solution {
    /**
     * 参考他人的思路
     */
    public boolean containsDuplicate(int[] nums) {
         Set<Integer> set = new HashSet<Integer>();
		 for(int i : nums)
			 if(!set.add(i))// if there is same
				 return true; 
		 return false;
    }
}


