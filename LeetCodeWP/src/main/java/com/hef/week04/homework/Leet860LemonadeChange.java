package com.hef.week04.homework;

import java.util.*;

/**
 * @Date 2021/4/24
 * @Author lifei
 */
public class Leet860LemonadeChange {

    public static void main(String[] args) {
        Leet860LemonadeChange leet860LemonadeChange = new Leet860LemonadeChange();
//        int[] bills = {5,5,5,10,20};
//        int[] bills = {5,5,10};
//        int[] bills = {10,10};
        int[] bills = {5,5,5,5,5,5,5,5,5,5,5,20,20,5,10,10,10,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,5,20,5,20,20,5,5,20,10,5,20,5,20,20,10,20,5,5,10,5,5,5,5,10,5,5,5,10,5,20,20,10,5,20,20,20,5,5,5,5,20,20,5,10,5,20,5,5,5,5,5,5,5,10,10,5,20,5,5,5,5,20,5,5,5,5,5,5,5,5,20,5,5,10,20,20,20,20,10,5,10,10,5,5,20,5,5,20,10,5,20,5,5,10,5,5,10,5,10,5,5,10,5,10,10,10,5,10,10,5,5,5,5,20,5,10,20,5,10,20,5,5,5,10,5,20,5,5,5,20,5,10,10,5,5,5,10,10,5,10,5,20,5,5,5,5,20,5,5,5,10,5,5,5,10,5,5,5,5,5,10,20,10,5,5,10,10,5,5,10,10,5,5,20,10,5,5,5,5,5,5,5,5,10,20,10,5,10,5,5,5,5,5,10,20,5,5,5,5,20,5,5,5,20,5,5,5,5,5,20,20,10,5,5,5,10,20,10,5,5,10,5,20,20,10,5,10,10,5,10,10,10,5,20,5,20,20,5,10,10,5,10,10,5,20,10,10,20,20,5,10,5,5,5,5,5,5,5,20,10,10,20,10,5,10,20,20,5,20,5,10,10,5,5,5,20,5,10,5,5,20,10,20,5,5,20,20,5,5,20,5,10,20,5,20,20,5,5,10,5,5,20,10,5,5,5,20,5,20,5,5,10,10,20,5,5,5,5,5,20,5,20,5,10,5,5,5,10,10,5,20,5,5,5,20,20,10,20,5,20,5,5,5,10,10,10,5,20,5,5,10,20,20,5,5,10,5,5,10,10,5,5,10,5,5,20,10,10,20,10,20,5,5,5,5,5,5,5,10,5,20,5,5,5,5,20,20,5,5,5,20,5,20,5,20,5,20,5,10,5,5,20,5,10,5,10,5,5,5,10,5,20,5,20,20,5,5,5,5,5,5,5,5,5,10,10,10,5,20,5,5,5,20,5,20,5,10,5,5,5,5,20,5,5,5,20,5,10,5,5,5,10,5,5,5,5,10,5,5,20,20,5,10,10,5,20,10,5,10,5,20,10,5,20,5,5,5,5,10,10,5,5,5,5,5,5,5,20,20,5,5,5,10,5,5,5,5,10,5,5,10,5,20,5,5,5,10,5,5,20,10,5,5,5,5,5,20,5,20,5,5,20,20,20,20,5,20,5,5,20,10,20,5,5,5,10,10,5,5,5,5,5,5,5,10,20,5,20,5,5,5,10,5,5,5,5,5,20,5,10,5,5,5,5,5,5,5,5,5,20,10,5,5,5,5,5,5,5,5,10,5,10,20,5,5,5,5,5,10,10,5,5,10,5,10,5,5,20,5,5,10,10,10,10,5,10,5,10,5,20,5,5,20,10,5,5,20,5,5,5,5,5,20,5,5,5,5,10,20,5,10,5,5,5,5,10,20,5,5,5,5,20,10,5,20,20,10,10,5,20,20,5,10,10,20,5,10,5,10,5,10,5,5,5,10,20,5,5,5,5,5,20,5,10,5,5,5,20,10,5,10,5,5,5,5,5,10,20,5,10,5,10,20,5,20,10,20,10,5,20,20,20,5,5,10,10,20,5,5,20,5,5,5,5,5,5,5,5,5,5,10,5,5,5,5,5,20,5,20,20,5,20,20,20,10,5,10,5,10,5,5,20,5,20,5,5,10,5,5,5,5,5,20,20,20,20,20,5,5,10,5,5,5,20,5,10,5,5,5,5,10,10,5,5,5,10,20,5,5,10,5,20,5,5,5,5,5,5,5,5,5,10,20,5,20,10,5,10,5,10,5,5,5,5,5,5,5,5,5,5,5,20,5,20,5,10,5,5,10,5,5,10,5,5,5,20,5,5,10,20,20,5,10,5,20,5,10,5,5,10,5,20,5,5,5,5,5,5,20,20,20,5,10,5,5,5,10,20,5,20,20,5,10,10,10,5,5,5,5,10,5,20,20,5,5,5,20,5,5,5,5,20,5,5,20,5,5,5,5,5,20,5,5,20,10,5,5,10,10,5,5,20,5,20,5,10,5,5,5,5,10,20,5,5,20,10,5,5,10,5,5,10,10,5,20,5,20,10,20,5,20,5,5,20,20,5,10,5,5,10,20,5,10,5,20,20,20,20,5,20,5,20,5,5,20,5,5,20,10,5,5,5,5,5,20,5,20,5,5,5,10,5,5,5,10,5,10,20,5,5,5,20,10,5,20,5,10,5,10,10,20,20,10,20,20,5,5,5,20,5,10,5,5,10,5,20,10,5,5,5,20,5,20,5,5,5,5,20,10,5,5,10,5,10,10,5,5,5,10,5,5,5,10,5,5,5,5,5,20,10,20,5,5,5,5,5,10,5,10,10,5,5,5,5,5,5,5,5,5,5,5,20,20,20,5,5,5,20,10,10,20,20,10,10,5,5,5,20,20,5,20,5,20,10,10,10,5,20,10,20,5,20,20,5,10,5,5,20,5,20,20,5,5,10,10,5,5,5,5,5,5,10,10,5,20,5,5,5,5,20,20,5,10,20,5,5,5,5,5,20,10,5,5,5,5,20,5,5,20,5,5,20,10,5,5,5,5,5,5,20,5,20,5,5,5,5,5,5,5,5,5,5,5,5,10,20,5,5,5,5,20,5,5,20,5,20,5,5,5,10,5,5,5,20,20,5,20,20,5,5,20,20,10,5,5,5,5,5,5,5,10,5,5,5,5,10,5,5,5,5,5,10,5,10,20,10,5,20,5,5,10,5,5,5,10,10,5,5,20,5,5,5,10,5,20,20,10,5,5,20,10,20,5,10,10,5,5,5,5,20,5,5,10,20,20,5,5,5,5,5,5,10,20,10,20,10,10,20,10,10,5,20,10,5,5,20,10,5,10,5,20,5,5,10,10,5,20,20,5,20,5,10,5,20,5,5,20,5,5,20,10,5,5,5,5,20,10,5,20,20,5,10,5,5,5,5,5,5,10,5,20,10,10,5,5,5,5,5,5,10,5,20,10,10,10,10,20,5,10,20,5,5,5,5,5,10,20,5,5,5,5,5,10,20,5,5,5,5,5,20,10,5,5,20,5,20,10,5,20,5,5,5,5,5,5,20,5,10,20,10,5,5,20,5,10,20,20,5,5,5,10,5,5,10,5,20,5,5,5,20,10,10,20,10,5,5,5,10,10,5,5,5,20,5,20,20,5,20,5,20,20,20,10,10,20,5,5,10,20,5,5,5,10,5,20,5,5,5,20,5,10,20,5,20,20,5,10,10,5,5,20,20,5,5,10,5,5,5,5,5,5,5,5,5,20,5,5,5,20,10,10,5,5,5,20,5,5,10,5,5,5,5,5,20,5,20,10,20,5,10,10,20,5,10,20,5,5,10,5,5,10,5,5,20,10,5,5,5,20,5,20,20,5,5,5,5,5,5,5,5,10,10,5,5,5,5,5,5,5,5,10,5,5,5,5,10,10,20,5,5,5,5,5,10,5,5,20,10,5,5,5,20,5,5,5,5,5,20,5,5,5,5,5,10,20,5,20,5,20,20,5,10,5,20,5,5,10,5,20,5,5,5,5,10,5,5,5,10,5,5,10,5,5,10,20,5,10,10,5,10,5,5,5,10,5,20,5,20,10,20,5,5,5,20,10,20,5,5,20,5,20,5,5,5,20,20,5,5,20,5,5,5,5,5,5,5,5,10,5,10,5,5,5,5,20,5,5,5,5,10,5,5,5,20,5,5,20,5,5,20,5,20,20,20,5,10,5,5,5,5,5,5,5,5,5,5,5,20,20,5,5,10,10,5,10,20,20,20,20,5,5,5,5,5,5,10,5,20,5,5,5,5,10,5,5,20,5,5,20,20,5,5,5,10,5,5,5,20,10,5,5,5,5,5,10,10,10,20,10,5,10,20,5,10,5,5,5,5,10,20,20,20,20,10,5,10,5,20,5,5,20,10,20,5,5,5,10,5,5,10,5,20,5,5,20,5,5,5,10,5,5,10,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,10,5,5,5,5,5,10,5,10,5,5,5,10,20,5,5,10,5,5,5,5,5,5,5,5,10,10,5,5,5,5,5,20,5,10,5,5,5,5,5,5,10,10,20,10,5,20,5,5,10,10,5,5,5,20,5,5,5,5,10,5,20,20,10,5,20,5,10,5,5,5,5,20,5,5,5,20,5,5,5,5,5,5,10,5,5,10,5,5,10,5,10,5,5,5,10,5,10,5,10,20,5,5,10,5,5,10,5,5,5,5,5,5,5,5,5,5,10,20,5,5,5,5,20,20,20,5,20,10,5,20,10,5,5,5,20,5,20,5,5,5,5,5,10,20,10,5,5,5,10,20,5,5,5,5,10,5,5,5,20,5,5,20,5,10,10,20,20,5,10,5,5,5,5,5,5,20,10,20,5,5,20,5,5,20,5,10,20,10,5,5,5,5,20,5,5,5,20,5,5,10,5,5,5,10,5,5,5,10,10,5,10,5,5,20,10,20,5,5,5,5,5,5,5,5,20,5,10,5,5,5,5,5,10,5,5,10,5,10,10,5,5,5,5,5,5,5,20,10,5,5,5,5,5,5,10,5,5,5,5,20,5,5,5,20,5,5,5,5,5,5,5,20,5,20,5,20,5,5,5,5,10,10,5,10,5,5,5,20,10,10,5,5,5,10,5,5,20,5,5,5,10,5,20,20,20,5,5,20,5,5,5,5,5,20,5,5,5,20,20,5,5,5,5,20,5,20,10,5,10,20,10,5,5,5,5,20,5,5,5,5,5,5,10,5,20,5,10,5,5,20,5,5,5,5,5,5,5,20,5,5,20,5,10,5,20,5,5,5,10,5,5,5,5,5,10,5,5,10,10,5,20,20,5,5,5,5,5,20,5,20,5,5,5,5,5,5,20,5,5,5,5,20,5,5,10,5,5,20,5,10,20,5,5,5,5,5,5,5,20,5,10,5,5,20,10,10,5,10,20,10,5,5,10,5,10,5,20,5,5,5,10,5,5,20,10,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,10,5,5,5,10,5,5,20,20,5,10,5,20,10,10,10,10,5,5,5,20,5,20,5,5,10,5,5,10,5,5,10,5,20,5,5,5,5,20,5,5,20,5,5,10,5,10,5,5,10,20,5,10,10,10,5,5,5,5,5,5,10,5,5,5,5,5,5,10,5,10,5,5,5,10,5,5,10,20,20,5,5,5,5,10,5,5,5,5,10,10,10,5,20,10,5,10,5,5,5,5,10,20,5,5,10,5,10,10,5,10,5,5,5,5,5,10,5,5,20,5,5,10,5,5,10,10,5,5,5,20,5,5,5,20,5,20,10,5,5,5,5,5,5,10,5,5,5,5,20,5,5,20,10,5,20,5,5,10,5,5,20,20,5,5,5,5,5,10,20,5,20,5,20,5,5,20,5,5,5,5,20,5,5,5,10,5,5,10,10,20,5,10,5,5,5,20,5,20,5,20,10,20,20,5,5,20,5,5,5,5,5,5,20,20,5,5,5,5,5,20,5,5,20,10,20,5,20,20,5,20,5,5,10,10,10,5,20,5,5,20,5,10,5,10,5,20,5,5,10,5,10,20,5,5,10,5,5,5,5,10,20,5,5,10,5,20,5,5,5,5,5,5,10,5,20,10,5,5,5,5,10,20,5,10,5,5,10,10,20,10,5,5,20,5,20,5,20,10,5,5,5,10,5,20,20,5,20,20,20,20,10,5,5,5,5,20,20,5,5,5,5,10,20,10,5,5,5,5,20,5,20,5,5,5,20,5,5,10,5,20,5,5,20,10,5,10,5,5,10,5,5,5,5,5,10,20,20,10,20,5,5,10,5,10,5,5,5,20,20,20,20,10,10,5,10,5,20,5,5,20,5,5,5,5,5,5,10,5,20,20,20,5,5,5,5,5,5,5,20,5,5,10,5,5,10,5,5,10,10,20,10,20,5,10,5,5,20,20,10,10,5,10,5,10,20,10,10,20,20,20,5,5,10,5,5,5,10,5,5,20,5,5,5,5,10,5,5,5,20,20,5,5,20,5,20,5,20,5,5,5,5,5,5,5,5,20,5,5,5,5,5,5,5,5,5,10,10,10,5,5,5,5,5,5,5,5,5,20,10,20,5,5,10,10,5,5,5,5,5,20,5,5,5,5,10,5,5,5,10,5,10,20,20,5,10,5,5,5,20,20,5,5,5,5,5,5,5,5,10,5,5,20,5,5,5,20,5,20,5,5,20,20,20,5,10,20,20,20,5,5,5,10,20,10,20,5,5,20,5,20,10,5,5,5,5,20,10,5,10,5,5,5,10,10,5,10,5,20,5,5,5,20,5,20,20,10,5,20,20,20,5,5,5,20,5,5,5,5,20,10,5,5,10,20,5,5,5,20,5,20,20,5,5,5,5,10,20,5,5,5,5,5,5,5,10,20,5,10,5,5,10,20,10,5,5,5,5,5,5,20,5,5,5,5,5,20,10,20,10,5,5,5,5,5,5,5,5,5,5,5,5,10,20,20,20,5,5,5,10,10,5,5,5,5,10,5,10,5,5,20,5,5,5,5,5,10,5,20,10,5,5,5,20,20,20,20,5,5,5,5,20,10,5,5,20,5,5,5,5,5,5,20,5,20,5,20,20,5,5,10,5,5,5,5,5,10,5,10,10,5,5,5,20,5,5,5,5,5,5,10,20,5,20,20,20,5,20,5,10,10,20,20,20,5,20,5,5,5,5,5,5,5,5,5,5,5,20,5,5,5,10,5,10,20,5,5,5,5,20,5,5,5,5,5,10,20,5,20,10,5,20,10,5,5,5,10,5,5,5,20,20,5,5,5,5,5,5,5,20,5,20,5,5,10,5,5,20,5,5,5,20,5,5,5,5,5,5,5,10,5,10,5,10,5,20,10,5,5,5,10,10,5,5,5,20,5,5,20,20,5,5,5,5,5,5,5,5,10,10,5,5,5,10,5,5,5,5,5,5,5,5,20,10,20,20,5,5,20,10,5,10,20,10,5,10,5,5,5,5,5,5,20,20,20,5,5,10,10,20,10,10,20,5,5,5,5,5,20,10,5,20,5,5,5,5,5,5,5,20,5,5,5,10,5,20,5,5,5,20,10,5,5,20,20,5,5,20,20,20,5,10,20,10,5,20,5,20,5,20,10,5,5,5,5,20,5,10,20,5,20,20,10,20,5,5,5,5,5,20,5,5,5,5,5,5,10,5,5,5,5,5,10,10,5,5,5,20,20,20,10,10,10,5,5,5,5,5,10,5,10,10,5,10,10,20,5,10,10,10,5,5,5,5,5,5,5,5,5,20,5,5,20,20,5,5,10,5,20,10,20,10,5,5,5,5,5,5,20,20,5,5,20,20,5,5,5,5,5,5,5,10,5,10,20,10,5,20,5,20,20,20,10,5,5,5,5,5,5,5,20,5,5,5,5,5,20,10,5,5,5,20,5,5,5,20,20,5,5,5,5,5,5,5,5,20,5,20,20,5,5,5,20,5,5,5,10,20,5,5,5,5,5,5,5,20,20,20,5,5,5,5,5,5,5,5,5,20,10,5,20,10,5,5,5,5,20,5,20,5,10,10,5,20,5,5,5,5,10,5,20,5,5,10,10,5,20,20,10,5,5,20,10,5,5,10,10,5,10,5,5,5,5,5,10,20,20,5,5,5,5,5,5,5,5,20,10,5,5,5,5,10,10,5,10,10,5,5,5,5,5,10,5,5,10,5,5,5,5,20,5,20,5,5,5,20,5,20,5,5,20,10,20,5,5,5,20,10,20,5,5,5,10,5,5,5,5,5,10,5,10,10,5,5,5,20,5,5,10,10,5,5,20,20,5,5,20,5,10,5,5,5,5,20,5,20,10,5,20,20,5,10,20,20,10,5,10,20,5,5,5,10,10,5,5,5,5,5,10,10,5,5,5,5,10,5,5,5,5,5,5,5,20,5,10,10,20,20,20,5,20,5,5,5,20,5,10,20,5,5,10,5,5,5,10,20,20,5,5,5,20,5,5,5,20,20,5,20,5,5,10,20,5,20,5,10,5,20,5,5,5,20,5,5,20,5,10,5,5,10,10,5,20,5,10,10,5,5,5,10,20,5,5,20,5,5,5,5,10,10,5,10,20,20,5,10,5,5,5,20,5,20,5,5,20,5,10,5,5,20,5,5,20,5,20,20,5,5,5,20,5,20,5,5,20,5,5,5,5,20,5,5,5,5,5,5,20,5,5,10,5,5,5,10,5,20,10,5,5,5,5,20,20,5,5,20,5,5,5,5,5,10,5,10,20,5,5,10,10,5,5,5,20,10,10,5,5,10,5,5,10,5,5,5,5,5,5,5,5,20,5,10,5,5,5,5,10,5,20,5,5,10,10,5,10,5,10,10,20,20,5,20,5,5,5,5,20,5,10,5,5,5,10,5,5,5,5,10,20,5,10,5,5,5,5,20,5,5,10,5,20,20,10,5,10,20,20,5,20,5,5,5,5,20,20,5,20,10,5,5,20,10,20,10,10,5,5,5,5,20,5,5,10,5,5,5,10,5,20,5,5,10,5,5,10,10,5,20,10,5,10,10,5,10,10,5,5,20,10,5,20,5,20,10,20,10,5,5,20,5,10,20,20,5,10,20,10,10,10,5,5,5,5,20,10,10,5,5,10,5,5,5,5,20,10,5,20,5,5,10,10,5,5,5,5,20,10,10,10,20,5,5,10,5,20,10,10,10,20,10,5,5,5,20,5,5,10,5,20,5,5,20,20,5,5,5,5,10,10,5,20,5,20,5,20,10,10,20,5,5,5,10,5,5,20,10,20,5,5,5,20,5,20,20,5,5,20,5,20,5,5,5,5,5,5,10,10,10,5,5,5,5,5,20,20,5,5,5,5,5,10,5,5,5,5,20,5,5,5,5,10,20,5,5,5,20,5,5,5,20,20,5,5,5,5,5,10,5,20,10,5,20,5,5,10,10,5,10,5,5,20,5,5,5,20,10,10,10,5,20,10,20,10,10,10,5,5,10,5,5,10,5,5,10,10,5,10,5,5,10,10,20,10,5,5,10,20,20,5,20,5,10,5,5,5,20,5,5,10,10,5,20,5,20,5,10,20,5,5,10,5,20,5,5,5,5,5,5,20,5,20,20,5,5,5,20,5,5,5,5,10,5,20,5,5,5,20,20,20,20,5,5,5,5,5,5,5,5,5,5,5,5,20,10,5,20,10,10,5,5,5,5,5,10,5,20,20,5,5,5,5,10,20,20,5,5,5,5,20,5,20,10,5,5,5,5,10,20,10,5,20,20,20,20,5,10,5,5,20,10,5,10,5,5,5,10,5,5,10,20,5,10,10,5,10,20,5,10,5,5,5,10,20,10,10,10,5,5,20,20,10,20,5,5,20,5,5,5,5,5,10,5,10,5,5,5,5,5,20,5,5,5,5,10,5,10,5,10,5,5,20,5,5,20,5,5,10,5,10,5,20,5,5,20,5,20,5,10,5,5,5,5,10,5,5,5,5,20,5,20,5,5,5,20,20,5,5,5,5,20,20,5,5,10,10,5,20,10,5,20,5,10,5,5,5,5,20,5,20,20,5,20,5,20,20,10,10,10,20,5,10,20,5,20,5,20,10,5,5,5,5,10,5,5,5,20,10,5,5,5,5,5,5,5,20,10,5,5,5,5,5,10,5,5,20,10,5,10,10,10,5,5,10,20,10,20,5,5,5,20,10,5,5,10,20,20,5,10,20,5,20,20,10,20,10,10,10,5,20,20,5,10,5,5,10,5,20,5,5,20,5,10,10,5,5,10,20,10,5,10,5,5,5,5,5,10,5,20,5,10,5,5,20,20,5,5,5,5,5,20,5,5,10,20,5,10,10,5,20,5,5,5,10,10,10,5,5,5,20,5,5,5,5,5,5,20,5,5,10,5,5,5,5,5,5,20,5,10,20,5,5,5,20,10,5,20,20,5,5,10,10,5,5,5,5,5,5,10,10,20,20,10,5,5,20,5,20,5,10,20,20,10,20,5,20,10,5,20,5,5,5,20,20,20,20,5,20,5,5,20,5,5,10,5,5,10,5,5,20,5,5,10,5,5,5,5,10,10,5,10,5,20,5,10,10,5,5,5,5,5,5,5,5,10,20,5,20,10,20,10,20,20,20,5,5,5,10,5,20,20,5,20,5,5,5,5,5,5,10,5,10,10,5,10,5,5,5,5,5,20,5,10,5,5,5,20,5,10,20,5,20,5,5,5,10,10,5,20,5,20,20,5,5,5,10,10,10,20,20,5,5,5,5,5,20,20,5,10,10,5,5,5,5,5,5,5,5,5,5,10,20,5,5,5,5,5,5,20,5,20,5,5,5,5,10,20,5,5,20,5,5,5,5,5,10,5,5,10,5,10,5,20,5,10,5,5,5,5,5,20,5,10,5,5,20,10,20,20,5,5,20,10,5,10,5,10,10,5,10,10,5,10,5,5,10,5,5,5,10,10,5,5,10,5,5,20,5,5,5,5,10,5,20,5,5,5,20,5,10,5,20,5,5,5,10,5,5,20,20,5,10,20,20,5,5,5,20,10,5,5,20,5,5,5,5,10,10,5,5,5,10,5,20,5,5,20,10,5,20,10,5,5,5,5,5,5,10,10,20,20,10,5,10,20,5,10,10,20,5,5,5,20,5,20,5,5,20,5,5,10,5,5,5,5,5,5,5,5,10,5,20,20,20,5,5,5,10,5,5,5,5,10,5,5,20,5,20,5,5,5,5,5,20,20,20,5,10,5,5,5,10,5,5,5,5,5,10,5,20,10,10,20,20,10,5,5,20,5,5,20,10,5,5,10,10,5,5,5,5,5,5,5,5,5,10,5,5,10,5,20,5,5,5,5,5,10,5,10,5,5,20,20,5,5,20,5,10,10,10,5,5,5,5,10,5,20,5,20,20,20,5,5,10,10,5,10,20,10,5,5,5,20,5,5,5,10,5,5,10,5,5,5,5,20,5,5,5,5,5,20,20,5,10,5,10,5,5,20,10,20,5,5,5,5,20,10,5,5,5,10,10,5,5,10,5,10,10,5,5,10,20,5,10,5,10,5,10,5,5,5,5,20,20,5,5,5,10,5,20,20,5,10,5,20,20,5,10,5,5,5,10,5,5,5,5,5,20,5,20,10,5,10,20,5,5,20,10,10,10,5,5,10,10,5,20,5,10,20,10,10,5,5,5,20,5,10,20,5,5,10,5,5,10,5,10,5,5,10,5,20,5,5,20,5,10,20,10,5,5,5,5,5,5,5,20,20,10,5,10,5,5,10,10,5,10,20,20,5,20,5,10,10,20,10,5,10,20,5,5,20,5,5,5,5,20,5,5,10,5,10,5,5,5,10,5,20,5,20,20,5,20,5,20,10,5,5,10,20,5,10,10,5,5,10,5,20,10,5,20,5,5,10,5,10,5,10,10,5,5,5,5,20,10,5,10,10,5,20,5,5,5,20,5,5,5,5,5,5,20,20,20,5,5,5,5,10,5,5,5,5,20,20,5,10,5,20,10,5,5,5,5,20,5,5,5,10,10,20,5,5,20,5,10,5,5,5,20,5,5,20,5,20,20,20,10,10,5,5,5,5,10,10,5,5,5,5,5,5,20,20,5,5,5,5,10,10,5,5,10,5,10,5,5,10,20,20,5,20,5,5,20,5,5,10,5,5,5,5,5,5,20,10,5,5,5,20,5,5,5,5,20,5,5,5,20,5,5,5,5,5,20,5,5,5,5,20,5,10,10,5,5,5,10,5,5,5,5,5,5,5,5,5,10,5,10,20,5,20,10,5,10,5,5,5,20,20,5,20,5,5,5,5,5,10,5,5,10,10,5,5,5,5,20,5,5,5,20,20,5,20,20,10,20,5,20,5,5,5,10,10,20,5,20,20,10,5,20,5,5,10,10,5,5,5,20,20,5,20,5,5,10,10,20,10,5,5,5,5,5,5,5,5,5,5,20,10,5,20,10,20,5,20,5,5,20,10,5,20,5,10,5,5,5,5,5,10,5,10,5,20,5,10,5,5,20,5,5,5,5,20,10,10,10,10,5,5,5,20,5,5,5,5,5,5,20,5,10,5,5,10,20,5,10,5,20,5,10,5,5,10,5,5,20,10,5,5,5,10,10,5,20,5,5,5,10,20,20,10,5,10,5,20,20,5,5,10,5,5,20,5,5,10,5,20,5,20,5,5,5,20,5,10,20,10,5,5,20,5,5,5,5,5,5,10,10,5,5,20,20,20,10,20,5,5,5,10,10,5,5,10,20,5,5,10,5,10,20,20,5,5,5,20,5,5,5,5,20,5,5,5,5,5,20,5,10,5,5,5,5,5,5,10,5,5,5,10,5,20,5,5,5,20,20,10,5,20,5,5,10,5,10,10,5,5,5,5,10,5,5,5,10,5,10,5,5,10,5,10,5,5,5,5,5,20,5,5,5,5,20,5,5,20,5,20,5,20,10,20,20,5,10,20,5,20,10,5,5,5,5,5,5,20,5,5,5,5,5,5,20,10,20,10,10,20,5,5,5,20,10,5,20,5,5,10,5,5,10,5,5,20,20,5,10,10,10,5,20,5,20,5,5,10,5,10,5,5,20,5,10,10,20,5,5,10,20,20,5,5,10,5,10,10,5,10,5,5,10,10,10,5,5,10,10,5,5,20,5,10,5,10,5,5,20,5,10,10,10,10,10,5,20,5,5,20,10,5,5,5,5,5,5,5,10,5,10,5,20,10,5,5,5,5,5,5,20,5,5,5,5,5,20,5,5,5,10,10,5,5,5,10,20,5,20,10,20,5,5,5,5,5,5,5,20,5,20,5,20,5,5,20,5,20,10,5,10,5,5,5,5,10,20,5,5,5,5,20,20,10,10,20,5,10,20,20,10,5,20,5,5,5,10,5,20,5,10,5,5,5,5,5,10,5,20,20,10,5,5,5,5,5,5,5,5,5,5,20,10,5,5,20,5,10,5,5,20,20,5,20,5,5,5,5,5,20,5,5,5,10,5,5,5,20,20,5,5,5,20,20,10,5,10,5,10,10,5,5,10,20,10,5,5,20,5,5,10,10,20,5,5,20,5,10,5,5,20,5,20,10,20,5,5,20,5,5,20,5,20,5,5,5,5,5,5,5,20,5,5,5,5,5,5,5,5,20,5,20,5,5,5,5,5,5,5,10,5,5,10,5,5,5,10,10,5,5,5,10,5,20,5,5,10,5,5,5,20,5,5,5,10,10,10,10,5,20,5,5,5,20,5,5,20,20,20,20,5,5,20,5,5,20,5,20,5,5,20,5,5,10,5,5,20,5,10,5,5,5,10,5,20,10,5,5,5,20,5,10,5,5,5,5,10,5,20,5,5,10,20,5,20,10,5,5,5,5,20,5,20,5,5,10,5,5,5,10,10,5,20,5,5,5,20,5,5,5,5,5,5,10,10,5,10,5,5,5,20,5,5,5,5,20,5,5,5,5,5,10,20,5,10,20,10,5,20,20,5,20,20,5,5,5,5,5,10,5,20,5,5,10,20,20,10,5,10,20,5,20,5,5,10,5,5,20,5,10,5,5,5,5,5,5,5,5,20,5,5,5,20,5,5,5,5,5,10,5,5,5,5,5,5,5,5,5,5,20,5,5,5,10,5,20,10,5,10,5,10,20,5,5,5,20,5,20,10,10,10,20,10,10,5,5,5,20,5,20,20,5,20,5,20,20,10,5,5,5,20,5,5,5,5,10,5,5,5,20,5,5,5,10,5,20,5,5,5,5,5,5,5,20,5,10,5,5,20,20,5,5,5,5,5,5,5,20,20,5,5,5,20,5,10,5,5,5,5,10,5,20,5,5,20,5,5,5,10,20,5,5,10,5,5,20,20,20,20,5,20,5,10,10,5,10,20,5,5,5,5,5,5,5,5,5,5,5,5,10,10,5,20,20,5,5,20,10,5,5,5,5,10,5,5,5,5,5,10,10,5,20,5,10,20,5,10,5,5,5,20,10,20,5,10,10,10,5,5,5,5,5,5,5,10,10,5,5,5,5,20,5,5,20,5,5,5,5,5,20,5,10,10,20,5,20,5,5,5,5,5,10,5,5,5,5,10,5,5,5,5,20,5,5,5,20,5,5,20,5,5,20,20,20,5,5,20,5,20,5,20,20,5,5,20,10,20,10,10,5,5,5,5,10,5,10,5,20,20,5,10,20,5,10,5,20,10,5,5,5,5,20,5,5,10,20,10,10,5,5,20,5,5,20,20,5,20,5,10,20,5,10,5,5,20,20,5,5,5,5,5,5,10,20,20,20,5,20,20,5,5,5,20,5,20,20,20,5,10,5,5,20,10,10,20,5,5,5,5,5,5,5,5,5,5,20,20,5,5,5,5,5,5,5,10,5,5,5,5,5,5,20,5,5,10,20,5,20,20,5,5,5,10,10,10,5,10,5,5,10,5,5,20,5,5,5,5,20,5,10,5,5,10,10,10,5,5,5,5,5,5,5,10,5,5,20,5,10,5,5,20,5,10,5,5,5,10,20,10,5,5,10,5,5,10,5,20,10,5,20,5,20,5,10,20,20,5,5,10,10,5,5,5,5,10,5,5,5,5,20,5,5,5,20,5,5,10,5,5,10,5,5,20,10,5,5,20,5,10,5,5,5,5,5,10,20,20,20,5,20,5,5,20,5,5,10,20,20,5,5,20,20,20,10,5,5,5,10,5,10,5,20,5,5,5,5,5,5,10,20,20,5,5,5,10,5,20,5,5,5,5,5,5,10,5,10,5,5,20,20,20,20,5,5,10,5,20,5,10,5,20,5,20,10,5,5,5,10,20,20,10,10,5,10,20,5,5,20,5,5,5,5,5,5,5,5,5,20,10,20,5,5,20,5,10,5,5,5,20,5,5,20,5,5,5,5,5,5,5,5,5,10,20,5,5,20,5,5,5,5,10,10,10,5,5,10,10,5,20,20,5,5,5,10,10,5,5,10,5,20,5,5,5,20,10,5,20,10,5,5,5,20,20,10,5,20,10,10,10,5,10,5,5,5,5,5,20,5,5,10,10,5,5,5,10,20,5,5,5,20,5,5,10,20,10,5,5,5,5,20,10,5,5,10,5,5,5,5,10,5,5,5,10,5,5,5,5,5,5,5,5,10,5,5,5,10,10,5,5,20,5,10,20,5,5,20,10,10,20,10,20,5,20,10,10,5,5,5,5,5,10,5,10,20,5,10,5,5,5,5,5,5,5,5,20,5,5,5,5,5,20,5,5,5,20,10,10,5,10,20,5,5,5,5,20,5,5,5,5,5,5,5,10,20,5,20,20,10,20,20,5,10,20,5,5,10,5,5,10,20,20,5,20,20,5,20,5,10,5,5,20,5,5,10,5,5,5,5,10,20,5,10,5,5,20,5,5,5,20,5,5,5,5,5,10,10,10,10,10,10,5,20,5,5,5,5,5,5,10,20,20,5,20,5,5,20,5,10,10,5,5,5,5,20,20,5,5,5,20,20,5,10,5,5,10,5,5,20,20,10,10,5,5,5,10,5,5,5,5,5,5,5,5,5,5,5,20,20,10,5,5,5,20,5,5,10,5,5,5,20,20,10,5,20,5,5,5,5,20,10,5,5,5,20,5,10,5,5,20,5,20,10,5,5,5,5,10,20,5,20,10,5,10,5,10,5,10,5,5,5,5,5,5,10,5,5,5,10,5,5,5,5,5,5,5,5,5,5,10,5,5,5,5,20,10,5,10,5,5,5,10,5,10,5,5,5,20,10,5,10,5,5,10,5,5,20,10,10,5,20,5,20,5,5,5,5,5,20,5,20,5,5,5,5,5,20,5,10,5,5,20,5,5,10,20,20,10,5,5,20,10,10,20,5,20,10,5,5,5,5,5,5,10,5,5,5,10,20,20,10,5,5,5,20,5,10,5,5,5,5,5,5,20,20,5,5,5,5,5,5,20,5,5,5,10,5,10,5,10,5,10,20,20,5,5,5,5,5,5,5,20,5,20,20,5,5,5,5,10,10,5,10,10,5,20,20,10,20,5,5,5,5,5,5,5,5,5,5,5,5,5,10,5,10,20,5,10,20,5,5,20,5,5,5,5,20,5,10,5,5,5,5,5,5,5,10,5,5,5,5,5,10,5,5,5,20,10,5,10,5,5,20,5,5,5,5,10,5,5,5,5,5,5,5,5,5,10,5,5,5,5,5,5,5,10,5,5,5,5,5,5,20,5,5,5,5,20,5,5,5,5,5,5,20,20,5,10,5,5,5,5,5,5,20,5,5,5,5,5,5,20,5,10,5,20,20,5,5,5,20,10,5,5,5,20,5,5,5,20,20,5,5,5,5,5,5,5,5,5,5,5,20,5,5,20,5,10,5,20,20,5,20,5,20,10,5,5,5,20,10,5,5,5,20,5,5,5,10,5,5,10,5,5,10,5,5,20,5,5,5,5,5,5,5,5,5,5,5,10,5,5,10,5,5,10,5,10,5,20,10,5,10,5,5,20,5,20,5,5,10,5,10,20,5,20,5,5,20,5,20,5,5,10,10,20,20,5,20,5,20,5,5,5,5,20,10,10,10,5,20,10,5,20,5,5,10,5,5,5,5,5,5,20,5,5,5,20,5,10,5,20,5,10,5,5,5,20,10,5,5,20,5,10,5,5,5,10,10,5,20,5,5,5,20,20,20,5,5,10,5,20,10,5,20,10,5,20,5,5,20,5,5,10,5,5,20,20,20,5,5,10,5,5,20,5,5,5,10,20,10,5,5,5,20,10,20,5,5,10,5,5,10,5,10,10,10,5,10,5,5,5,5,5,5,5,10,20,5,5,20,5,5,5,10,5,5,5,5,20,5,5,5,5,5,10,10,5,5,5,10,5,20,20,5,5,5,10,20,10,5,20,5,5,5,5,10,10,5,5,5,5,20,20,5,5,5,5,5,5,5,5,5,5,10,10,5,5,20,5,5,10,10,5,10,20,5,5,5,10,20,5,10,5,5,10,5,5,20,5,5,20,5,10,5,20,20,5,20,5,5,5,10,5,5,10,20,5,20,20,5,5,20,5,10,5,5,20,5,10,5,10,20,5,10,20,20,5,5,5,10,20,10,5,10,10,5,20,5,5,5,10,10,10,5,20,5,20,5,10,10,5,10,10,5,10,10,5,5,5,10,5,5,5,5,20,5,20,20,5,10,20,5,10,5,5,10,20,5,10,5,20,10,5,10,5,5,10,10,20,5,20,10,10,5,5,20,5,5,5,10,5,10,5,5,5,20,10,5,10,5,20,20,20,10,5,5,5,20,20,20,5,5,5,5,10,5,20,5,10,10,5,5,5,5,5,20,5,20,20,5,5,20,5,5,5,5,10,5,20,5,10,20,5,5,20,5,5,10,5,10,5,20,5,5,5,5,5,10,5,20,5,5,5,5,5,5,5,5,10,10,10,20,5,10,20,20,5,10,5,10,5,5,5,20,5,5,10,5,5,5,5,5,10,5,5,5,20,20,20,20,20,5,5,10,20,5,10,10,20,5,5,5,10,5,5,5,10,5,10,5,5,10,20,5,5,10,5,20,5,5,5,5,5,5,10,20,20,5,5,5,20,20,10,20,5,5,5,10,20,5,5,10,5,5,5,20,5,5,5,20,10,5,5,10,5,5,20,5,10,10,5,20,20,5,10,5,10,5,5,10,5,10,10,5,20,5,5,5,5,5,5,5,5,5,20,5,5,10,5,5,5,5,5,5,10,5,5,10,5,5,5,5,5,20,5,5,5,20,5,5,5,5,10,5,5,5,20,10,10,5,20,5,10,20,5,20,5,5,5,5,20,20,5,5,20,10,10,5,5,5,10,5,10,5,20,5,20,20,10,5,5,20,20,5,5,10,5,5,5,10,10,5,5,10,10,20,5,5,5,20,5,10,20,5,5,20,10,20,20,5,5,5,5,5,5,5,5,5,10,5,10,5,5,5,5,20,5,20,10,5,10,5,5,5,10,5,20,5,5,5,10,5,10,20,10,20,5,20,5,20,5,5,5,5,5,5,20,10,5,5,5,5,5,5,10,5,5,20,5,5,20,20,20,5,5,10,5,10,5,5,5,5,5,10,5,20,5,5,5,5,5,5,5,10,5,5,5,5,20,20,5,5,10,20,20,20,20,5,5,5,10,10,5,10,5,5,5,20,5,10,10,20,5,5,5,20,5,5,5,20,10,5,20,10,5,5,5,20,20,10,10,5,20,20,10,5,10,10,20,5,5,20,5,5,5,5,5,20,10,5,5,5,10,5,5,5,5,10,5,20,5,5,20,20,5,5,5,20,10,5,10,5,10,5,5,5,5,10,20,5,5,5,5,10,20,5,5,20,5,10,5,5,5,20,10,5,20,5,20,5,5,5,10,5,10,5,5,5,10,10,5,10,5,10,5,5,5,5,20,5,5,5,10,5,20,5,5,5,5,10,5,5,20,5,5,5,5,10,5,20,5,5,10,5,5,5,10,20,10,5,20,5,10,10,5,5,10,10,20,5,5,10,5,5,10,5,5,5,5,20,5,20,5,5,20,5,20,10,5,5,5,10,5,5,20,5,20,10,5,20,5,20,5,5,10,10,10,5,20,5,10,20,5,5,5,5,10,20,10,5,5,5,5,10,5,10,5,5,5,5,5,5,20,10,5,5,20,20,5,5,5,5,5,5,5,20,5,5,10,5,20,5,5,5,5,5,20,10,10,5,10,5,5,5,10,5,10,5,5,10,20,5,10,5,10,20,5,5,5,5,5,10,5,5,5,5,10,10,20,5,20,20,5,5,5,5,5,5,20,5,5,20,5,10,20,5,5,5,10,5,5,20,5,5,20,10,5,5,10,5,10,10,10,5,10,5,10,20,10,20,20,20,20,5,10,5,5,5,10,5,5,5,5,10,5,20,20,5,5,20,5,5,10,20,10,5,5,5,20,10,20,5,10,5,10,10,10,10,20,5,5,10,5,10,5,20,20,5,10,10,5,5,5,5,5,5,5,10,20,5,10,5,10,5,20,5,10,5,5,5,5,10,10,20,5,5,10,10,5,5,5,5,5,10,5,10,20,5,5,5,10,5,5,20,10,10,10,20,20,5,5,5,5,10,20,5,10,20,20,10,5,5,5,5,10,20,10,5,5,5,10,10,20,5,5,10,5,5,5,5,20,5,10,20,5,20,20,5,20,5,10,5,10,10,5,5,5,5,5,5,5,5,5,10,5,5,20,20,5,5,20,5,5,5,5,20,5,5,5,5,5,5,10,10,5,20,5,20,20,20,20,5,5,5,20,5,5,20,10,5,5,20,5,5,10,10,5,5,5,10,5,5,5,5,5,10,20,5,20,5,5,5,20,20,10,10,20,5,10,20,10,10,5,10,10,5,20,5,20,5,20,5,5,5,10,5,10,5,20,5,5,5,10,10,5,5,5,5,10,5,5,5,5,5,10,20,10,5,5,10,5,5,5,20,20,5,5,10,5,5,5,5,5,5,5,5,5,5,5,5,5,5,10,20,5,5,10,20,5,5,5,20,20,5,20,5,5,10,10,5,5,5,10,10,10,20,5,5,5,5,20,5,5,20,5,20,5,5,10,10,5,5,5,5,10,10,20,20,5,10,20,20,5,5,5,5,5,10,5,10,5,5,5,20,20,10,10,5,5,20,5,20,5,5,10,5,20,10,10,10,5,5,10,10,5,10,10,5,10,5,20,10,5,20,5,5,10,5,5,10,5,5,5,5,5,5,5,5,5,5,5,5,5,5,10,5,5,20,5,5,5,5,5,20,5,20,5,5,5,5,5,5,10,10,10,20,5,5,20,5,5,20,5,5,20,20,10,5,5,10,10,10,10,5,20,20,20,5,5,5,10,10,5,20,5,5,5,5,10,5,5,5,5,20,5,5,5,5,20,5,5,5,10,5,20,5,5,5,20,5,5,5,10,5,5,20,20,5,20,10,5,5,5,5,20,5,10,5,20,5,5,5,5,20,5,20,5,10,5,20,5,20,5,5,5,5,5,5,20,5,20,10,10,5,10,10,5,10,5,5,10,10,5,5,5,20,5,20,5,5,5,5,5,10,5,5,5,20,5,20,5,5,5,5,5,10,5,5,5,5,20,5,20,5,5,5,5,20,5,5,5,5,10,20,5,5,5,20,5,5,5,20,10,5,5,20,5,5,5,5,5,5,5,5,20,5,5,10,5,20,10,5,5,20,20,20,10,5,5,10,5,5,5,5,10,5,10,5,5,20,5,5,5,5,10,5,5,10,5,5,5,5,5,5,5,5,10,10,20,5,5,10,20,5,10,5,20,5,5,10,10,20,20,20,5,5,20,20,5,5,10,5,5,20,5,5,10,5,5,20,10,5,5,5,5,10,5,5,5,10,5,5,20,5,5,5,10,5,10,5,5,5,5,20,20,10,5,10,5,10,5,5,20,5,5,5,5,20,5,5,10,20,5,10,10,5,5,10,5,5,20,5,10,5,10,5,5,5,10,10,5,5,20,20,5,5,10,20,20,5,5,5,10,20,10,5,5,10,5,10,10,10,20,5,20,10,20,20,5,5,5,5,10,5,20,5,5,5,10,10,5,5,20,5,5,20,5,20,10,5,5,10,10,5,20,5,20,5,10,5,20,5,5,5,20,5,10,20,10,5,10,20,5,5,5,5,20,20,10,10,5,5,5,10,10,10,5,10,5,5,5,20,5,10,5,5,20,5,5,10,20,5,5,5,5,20,20,20,5,20,5,20,20,5,20,5,10,5,20,10,5,20,5,5,5,10,5,10,5,5,20,10,20,10,10,5,5,5,10,20,5,5,20,20,20,20,5,5,5,5,10,20,20,5,10,5,5,5,5,20,20,5,5,5,5,5,20,10,5,5,20,20,5,5,5,5,5,20,20,5,5,10,5,5,5,10,5,10,5,10,10,5,5,5,10,5,10,5,10,20,10,5,5,5,5,5,5,5,5,20,10,20,5,20,5,10,5,5,5,5,5,10,10,10,20,5,20,5,10,5,5,20,10,10,5,5,20,5,20,5,20,5,10,5,5,10,5,10,5,5,10,5,10,5,10,20,5,5,20,20,5,5,10,20,10,10,10,5,5,5,5,10,5,20,5,5,20,5,5,20,5,5,5,5,5,5,20,10,5,5,5,5,5,5,10,20,5,5,10,20,5,20,20,5,10,5,5,5,5,10,10,5,20,5,10,5,5,5,5,20,5,20,10,20,5,10,5,20,5,20,5,10,10,10,20,5,20,5,20,10,20,5,5,5,5,20,5,5,20,10,5,5,5,5,20,20,20,5,5,5,10,10,5,10,5,10,5,10,20,20,5,20,5,5,10,20,20,10,5,5,5,5,5,10,10,5,20,20,5,10,5,5,20,20,5,20,5,5,5,5,5,5,5,10,5,5,5,5,10,10,10,5,5,5,20,5,5,5,5,5,5,5,20,5,10,5,10,20,5,5,5,20,10,5,5,20,5,20,5,5,20,5,5,20,5,20,5,20,20,5,20,20,10,5,10,10,5,20,5,5,5,5,5,20,5,20,5,20,20,5,5,5,5,5,5,20,5,20,5,5,5,5,10,5,10,20,5,10,10,5,5,20,20,20,5,5,10,5,5,5,5,5,20,5,20,10,5,10,5,5,20,10,5,5,5,10,5,10,5,5,5,10,5,20,5,20,5,20,5,10,5,10,10,5,20,5,5,5,5,10,20,20,10,5,10,5,20,10,5,5,5,10,5,5,5,20,20,5,5,5,5,10,20,10,5,10,20,10,20,5,20,5,10,5,10,10,10,5,5,5,5,10,5,5,20,20,5,5,20,5,10,5,5,5,20,5,5,5,20,5,5,10,5,5,5,5,20,5,5,5,5,20,5,20,5,5,5,20,5,5,5,5,20,5,10,5,5,5,5,5,5,20,10,5,20,5,20,5,5,5,20,5,5,5,10,5,5,20,5,20,5,10,20,5,10,10,5,5,5,5,5,5,20,20,5,5,5,5,5,5,5,5,10,5,5,5,5,5,5,5,5,5,5,5,5,20,5,10,10,5,5,5,10,20,5,5,5,5,5,5,5,20,20,5,5,20,5,5,20,5,10,5,20,5,5,10,5,5,5,5,10,5,10,5,5,5,5,10,5,5,5,5,5,5,5,10,20,5,5,5,10,10,5,5,20,20,5,5,10,5,20,5,10,5,5,10,10,5,20,5,5,10,5,10,10,10,5,5,10,5,10,10,10,5,5,5,10,5,5,5,5,5,20,5,10,5,5,20,5,5,20,10,5,10,5,20,5,5,5,5,5,5,5,10,20,5,10,10,5,5,5,5,5,5,20,5,5,5,5,10,20,5,5,5,5,5,10,5,5,5,10,5};
        boolean result01 = leet860LemonadeChange.lemonadeChange01(bills);
        System.out.println(result01);
        System.out.println(leet860LemonadeChange.lemonadeChange02(bills));

    }

    public boolean lemonadeChange02(int[] bills) {
        if (bills==null || bills.length==0) {
            return true;
        }
        int five = 0, ten = 0;
        for (Integer b: bills) {
            if (b==5) {
                five ++;
            }else if (b==10) {
                if (five==0) return false;
                five --;
                ten++;
            }else if (b==20) {
                if (ten>0 && five>0) {
                    ten--;
                    five--;
                }else if (five>=3) {
                    five -= 3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 暴力求解
     * @param bills
     * @return
     */
    public boolean lemonadeChange01(int[] bills) {
        if (bills==null || bills.length==0) {
            return true;
        }
        List<Integer> values = new ArrayList<>();
        for (Integer oneB : bills) {
            if (oneB==5) {
                values.add(oneB);
            }else if (oneB==10) {
                int[] v01 = findValueIndex(values, 5, 1);
                if (v01[v01.length-1]==-1) {
                    return false;
                }
                values.remove(v01[0]);
                values.add(oneB);
            }else if (oneB==20) {
                int[] v02 = findValueIndex(values, 10, 1);
                int[] v03 = findValueIndex(values, 5, 1);
                if (v02[v02.length-1]!=-1 && v03[v03.length-1] != -1) {
                    values.remove(v02[0]);
                    if (v03[0]<v02[0]) {
                        values.remove(v03[0]);
                    }else {
                        values.remove(v03[0]-1);
                    }
                    values.add(oneB);
                }else {
                    int[] v4 = findValueIndex(values, 5, 3);
                    if (v4[v4.length-1]==-1) {
                        return false;
                    }
                    for (int i=0; i<v4.length; i++) {
                        values.remove(v4[i]-i);
                    }
                    values.add(oneB);
                }
            }
        }
        return true;
    }

    private int[] findValueIndex(List<Integer> values, int target, int num) {
        int[] result = new int[num];
        Arrays.fill(result, -1);
        for (int i=0, j=0; i<values.size(); i++) {
            if (values.get(i) == target) {
                result[j++] = i;
            }
            if (j==num) {
                break;
            }
        }
        return result;
    }
}
