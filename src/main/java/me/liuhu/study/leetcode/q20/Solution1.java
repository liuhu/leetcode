package me.liuhu.study.leetcode.q20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/6/28
 **/
public class Solution1 implements Solution {

    private final Map<Character, Character> symbols = new HashMap<Character, Character>() {
        {
            put(']','[');
            put(')','(');
            put('}','{');
        }
    };
    /**
     * Time: O(n)
     * Space: O(1)
     * @param s
     * @return
     */
    @Override
    public boolean isValid(String s) {
        char[] items = s.toCharArray();

        Stack<Character> stack = new Stack();
        for (char item : items) {
            switch (item) {
                case '[':
                case '{':
                case '(':
                    stack.push(item);
                    break;
                case ']':
                case '}':
                case ')':
                    if (stack.empty()) {
                        return false;
                    } else if (!checkSymbol(item, stack.pop())) {
                        return false;
                    }
            }
        }
        return stack.empty();
    }

    /**
     * 获取相对应的括号
     * @param c1
     * @param c2
     * @return
     */
    private boolean checkSymbol(char c1, char c2) {
       return c2 == symbols.get(c1);
    }
}
