package com.hef.week10;

/**
 * @Date 2021/6/8
 * @Author lifei
 */
public class Leet58LengthOFLastWord {

    public static void main(String[] args) {
        Leet58LengthOFLastWord leet58LengthOFLastWord = new Leet58LengthOFLastWord();
        int res = leet58LengthOFLastWord.lengthOfLastWord("hello world");
        System.out.println(res);
    }

    public int lengthOfLastWord(String s) {
        if (s==null) return 0;
        int wordLen = 0;
        int i = s.length() - 1;
        while (i>=0 && s.charAt(i)==' ') i--;
        while (i>=0 && s.charAt(i)!=' ') {
            wordLen ++;
            i--;
        }
        return wordLen;
    }
}
