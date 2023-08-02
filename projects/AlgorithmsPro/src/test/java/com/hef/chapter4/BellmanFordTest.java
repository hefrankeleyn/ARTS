package com.hef.chapter4;

import org.junit.Test;

/**
 * @author lifei
 * @since 2021/1/24
 */
public class BellmanFordTest {

    private int cost;

    @Test
    public void test01(){
        if (cost++ % 3 ==0){
            System.out.println("entry if, cost: " + cost);

        }
    }
}
