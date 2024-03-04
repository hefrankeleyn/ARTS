package com.hef.week01;

import java.util.Stack;

/**
 * @Date 2021/4/4
 * @Author lifei
 */
public class Leet08ValidParentheses {

    public boolean solution02(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i<s.length(); i++) {
            char tmp = s.charAt(i);
            if (tmp=='(' || tmp == '{' || tmp == '[') {
                stack.push(tmp);
            }else {
                char matchTmp = stack.pop();
                if(stack.isEmpty()){
                    return false;
                }else if ((matchTmp=='(' && tmp==')')
                        || (matchTmp=='{' && tmp == '}')
                        || (matchTmp == '[' && tmp==']')) {
                    continue;
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i<s.length();i++) {
            char tmp = s.charAt(i);
            if (tmp == '(' || tmp == '{' || tmp == '[') {
                stack.push(tmp);
            }else {
                if (!stack.isEmpty()) {
                    char matchTmp = stack.pop();
                    if ((tmp==')' && matchTmp=='(') || (tmp=='}' && matchTmp=='{') || (tmp==']' && matchTmp=='[')) {
                        continue;
                    }else {
                        return false;
                    }
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Leet08ValidParentheses validParentheses = new Leet08ValidParentheses();
        System.out.println(validParentheses.solution("()"));
        System.out.println(validParentheses.solution02("()"));
    }
}
