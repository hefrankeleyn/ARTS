package org.hef.algorithm.m202403;

import org.hef.algorithm.m202403.d04.Solution01;
import org.junit.Test;

/**
 * @Date 2024/3/4
 * @Author lifei
 */
public class VerifySolution01 {

    @Test
    public void testReverseSolution() {
        int[] record = new int[]{9, 7, 5, 4, 6};
        Solution01 solution01 = new Solution01();
        int res = solution01.reversePairs(record);
        System.out.println(res);
    }
}
