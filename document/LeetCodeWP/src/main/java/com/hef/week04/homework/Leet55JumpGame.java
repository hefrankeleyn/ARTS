package com.hef.week04.homework;

/**
 * 跳跃游戏： 贪心法
 * @Date 2021/4/26
 * @Author lifei
 */
public class Leet55JumpGame {

    public static void main(String[] args) {
//        int[] nums = {2,3,1,1,4};
        int[] nums = {3,2,1,0,4};
        Leet55JumpGame jumpGame = new Leet55JumpGame();
        System.out.println(jumpGame.canJump(nums));
    }

    public boolean canJump(int[] nums) {
        int rightMax = 0;
        for (int i=0; i<nums.length; i++) {
            if (i<=rightMax) {
                rightMax = Math.max(rightMax, i + nums[i]);
                if (rightMax>=nums.length-1) {
                    return true;
                }
            }
        }
        return false;
    }
}
