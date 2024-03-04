package com.hef.week02;

/**
 * @Date 2021/4/10
 * @Author lifei
 */
public class Leet1021RemoveOutermostParentheses {

    public String removeOuterParentheses(String S) {
        if (S==null || S=="") return S;
        char[] temp = S.toCharArray();
        int flag = 0;
        for (int i=0; i<temp.length; i++) {
            if(temp[i]!='(') break;
            temp[i++] = ' ';
            if (temp[i]=='(') {
                flag++;
                i++;
            }
            while (flag>0 || temp[i]!=')') {
                while(temp[i]=='(') {
                    flag++;
                    i++;
                }
                while (temp[i]==')' && flag>0) {
                    flag--;
                    i++;
                }
            }
            temp[i] = ' ';
        }
        return new String(temp).replaceAll(" ","");
    }

    public static void main(String[] args) {
        Leet1021RemoveOutermostParentheses removeOutermostParentheses = new Leet1021RemoveOutermostParentheses();
        String S = "(()())(())";
        String result = removeOutermostParentheses.removeOuterParentheses(S);
        System.out.println(result);

    }
}
