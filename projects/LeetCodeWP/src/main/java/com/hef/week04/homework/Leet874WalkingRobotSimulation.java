package com.hef.week04.homework;

import java.util.*;

/**
 * 模拟机器人走布
 * @Date 2021/4/25
 * @Author lifei
 */
public class Leet874WalkingRobotSimulation {

    public static void main(String[] args) {
        Arrays.asList("aa".toCharArray());
        int[] commands = {4,-1,3};
        int[][] obstacles = {{}};
        Leet874WalkingRobotSimulation walkingRobotSimulation = new Leet874WalkingRobotSimulation();
        System.out.println(walkingRobotSimulation.robotSim(commands, obstacles));
    }

    public int robotSim(int[] commands, int[][] obstacles) {
        int[] xD = {1, 0, -1, 0};
        int[] yD = {0, 1, 0, -1};
        int x = 0, y = 0, dir = 1, res = 0;
        Set<Pair> set = new HashSet<>();
        for (int[] oneV: obstacles) {
            if (oneV!=null && oneV.length>=2) {
                set.add(new Pair(oneV[0], oneV[1]));
            }
        }
        for (Integer v: commands) {
            if (v==-1) {
                dir = (dir+3)%4;
            }else if (v==-2) {
                dir = (dir+1)%4;
            }else {
                for (int i=0; i<v; i++) {
                    int tmpX = x + xD[dir];
                    int tmpY = y + yD[dir];
                    if (!set.contains(new Pair(tmpX, tmpY))) {
                        x = tmpX;
                        y = tmpY;
                        res = Math.max(res, x*x + y*y);
                    }
                }
            }
        }
        return res;
    }

    private class Pair{
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o){
            Pair other = (Pair)o;
            return this.x==other.x && this.y==other.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
