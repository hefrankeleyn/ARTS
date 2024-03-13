package org.hef.algorithm.m202403.d06;

import org.junit.Test;

import java.util.List;

/**
 * @Date 2024/3/6
 * @Author lifei
 */
public class VerifySolution01 {

    @Test
    public void solution01Test() {
        int[] nums = new int[]{5,2,6,1};
        Solution01 solution = new Solution01();
        List<Integer> res = solution.countSmaller(nums);
        System.out.println(res);
    }
}
