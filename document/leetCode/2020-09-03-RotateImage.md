# Leetcode: Rotate Image

> https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/

## 我的解题方案

```java
class Solution {
    /**
     * 思路： 四边形一周：可以切分成四段：（4,1）（2,3）（6,9）（8,7）
     *    1. 先让第一对和第三对进行交换；4<->6,1<->9  => (6,9) (2,3) (4,1) (8,7)
     *    2. 再让第二对和第三对进行交换；2<->4,3<->1  => (6,9) (4,1) (2,3) (8,7) 
     *    3. 再让第四对和第一对进行交换；8<->6,7<->9  => (8,7) (4,1) (2,3) (6,9)
     *     
     *   1 2 3      7 4 1
     *   4 5 6  =>  8   2 
     *   7 8 9      9 6 3
     */
    public void rotate(int[][] matrix) {
        int oneLen = matrix[0].length;
        int currentLen = oneLen;
        int timeNum = 0;
        // 从外向里旋转 当oneLen<=1 的时候旋转完成
        while (currentLen > 1) {
            // 左右交换
            int leftX = 0 + timeNum, leftY = timeNum + (currentLen - 1) - 1;
            int rightX = timeNum + currentLen - 1, rightY = timeNum + 1;
            while (leftY > timeNum-1) {
                exchange(matrix, leftX, leftY--, rightX, rightY++);
            }
            leftY++;
            rightY--;
            // 上右交换
            int topX = 0 + timeNum + currentLen -1, topY = 0 + timeNum;
            int minX = 0 + timeNum;
            while (topX > minX) {
                exchange(matrix, topX--, topY, rightX, rightY--);
            }
            // 下左交换
            int bottomX = 0 + timeNum , bottomY = 0 + timeNum + currentLen - 1;
            int maxX = 0 + timeNum + currentLen-1;
            while (bottomX < maxX) {
                exchange(matrix, bottomX++, bottomY, leftX, leftY++);
            }
            // 一圈旋转完毕
            timeNum++;
            currentLen = oneLen - timeNum * 2;
        }
    }
    
    
    
    /**
     * 值的转换
     */
    private void exchange(int[][] matrix, int x, int y, int x2, int y2){
        int temp = matrix[y][x];
        matrix[y][x] = matrix[y2][x2];
        matrix[y2][x2] = temp;
    }
}
```
