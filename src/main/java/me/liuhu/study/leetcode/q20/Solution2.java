package me.liuhu.study.leetcode.q20;

import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/28
 **/
public class Solution2 implements Solution {

    /**
     * Time: O(n)
     * Space: O(n)
     * @param s
     * @return
     */
    @Override
    public boolean isValid(String s) {
        char[] items = s.toCharArray();

        Stack<Character> stack = new Stack();
        for (char item : items) {
            if ('(' == item) {
                stack.push(')');
            } else if ('{' == item) {
                stack.push('}');
            } else if ('[' == item) {
                stack.push(']');
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.pop() != item) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

}
