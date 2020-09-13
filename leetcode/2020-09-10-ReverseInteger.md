# leetCode: Reverse Integer

> https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/

## 我的解决方案

```java
class Solution {
    
    /**
     * 思路： 
     *  1. 将 x 转换成 char 数组；
     *  2. 比较数组 与最小值数组的长度及大小；
     *  3. 比较数组 与最大值数组的长度及大小；
     *
     */
    public int reverse(int x) {
        char[] currentV = intToReverseCharArrayAndWithoutBeforeZeros(x);
        char[] minV = strToCharArray(Integer.MIN_VALUE);
        char[] maxV = strToCharArray(Integer.MAX_VALUE);
        if(currentV[0]=='-'){
            if(currentV.length>minV.length){
                return 0;
            }else if(currentV.length==minV.length){
                int blackIndex = 0;
                while(blackIndex<currentV.length && currentV[blackIndex]==minV[blackIndex]){
                    blackIndex++;
                }
                if(blackIndex==currentV.length || currentV[blackIndex]<minV[blackIndex]){
                    return charArrayToInt(currentV);
                }
                return 0;
            }else{
                return charArrayToInt(currentV);
            }
        }else{
            if(currentV.length>maxV.length){
                return 0;
            }else if(currentV.length==maxV.length){
                int blackIndex = 0;
                while(blackIndex<currentV.length && currentV[blackIndex]==maxV[blackIndex]){
                    blackIndex++;
                }
                if(blackIndex==currentV.length || currentV[blackIndex]<maxV[blackIndex]){
                    return charArrayToInt(currentV);
                }
                return 0;
            }else{
                return charArrayToInt(currentV);
            }
        }
        
    }
    
    private int charArrayToInt(char[] v){
        String s = new String(v);
        return Integer.valueOf(s);
    }
    
    private char[] strToCharArray(int value){
        String valueStr = value + "";
        return valueStr.toCharArray();
    }
    
    private char[] intToReverseCharArrayAndWithoutBeforeZeros(int value){
        char[] strCharArray = strToCharArray(value);
        int maxIndex = strCharArray.length-1;
        while(strCharArray[maxIndex]=='0' && maxIndex>0){
            maxIndex--;
        }
        int beginIndex = 0;
        if(strCharArray[beginIndex]=='-'){
            beginIndex++;
        }
        char[] result = new char[maxIndex+1];
        for(int i=beginIndex,j=maxIndex;i<=j;i++,j--){
            result[i] = strCharArray[j];
            result[j] = strCharArray[i];
        }
        if(beginIndex!=0){
            result[0] = '-';
        }
        return result;
    }
}
```



## 在读C语言书读时候，理解了第二种方案：

```java
    public int reverse(int x){
        int sign = x;
        if (sign<0){
            x = -x;
        }
        long result = 0;
        do {
            result = result*10 + x%10;
        }while ((x/=10)>0);

        if (sign<0){
            if((result = -result)<Integer.MIN_VALUE){
                return 0;
            }
            return (int)result;
        }else {
            if (result>Integer.MAX_VALUE){
                return 0;
            }
            return (int)result;
        }
    }
```

