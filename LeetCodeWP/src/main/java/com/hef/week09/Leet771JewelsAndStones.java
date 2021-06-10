package com.hef.week09;

/**
 * @Date 2021/6/8
 * @Author lifei
 */
public class Leet771JewelsAndStones {

    public static void main(String[] args) {
        Leet771JewelsAndStones jewelsAndStones = new Leet771JewelsAndStones();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int res = jewelsAndStones.numJewelsInStones(jewels, stones);
        System.out.println(res);
    }

    public int numJewelsInStones(String jewels, String stones) {
        if (jewels==null || jewels.length()==0 || stones==null || stones.length()==0) return 0;
        int res = 0;
        for (int i=0; i<stones.length(); i++) {
            for (int j=0; j<jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) res++;
            }
        }
        return res;
    }
}
